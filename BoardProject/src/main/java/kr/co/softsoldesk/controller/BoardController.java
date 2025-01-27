package kr.co.softsoldesk.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.softsoldesk.beans.BoardInfoBean;
import kr.co.softsoldesk.beans.ContentBean;
import kr.co.softsoldesk.beans.PageBean;
import kr.co.softsoldesk.beans.UserBean;
import kr.co.softsoldesk.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Resource(name = "loginUserBean")
	UserBean loginuserBean;
	
	@Autowired
	BoardService boardService;

	@GetMapping("/main")
	private String main(@RequestParam("board_info_idx") int board_info_idx, Model model,
						@RequestParam(value = "page", defaultValue = "1") int page ) {
		// 게시글 index 번호 가져오기

		String boardInfoName = boardService.getBoardInfoName(board_info_idx);// 게시판 이름
		
		List<ContentBean> contentList = boardService.getContentList(board_info_idx, page);// 게시판 게시글들

		model.addAttribute("board_info_idx", board_info_idx);
		model.addAttribute("board_info_name", boardInfoName);
		model.addAttribute("contentList", contentList);
		
		PageBean pageBean = boardService.getContentCnt(board_info_idx, page);
		model.addAttribute("pageBean", pageBean);

		return "board/main";
	}

	@GetMapping("/read") // RequestParam을 선언해줌으로써 주소값(패러미터)에 표기해줌
	private String read(@RequestParam("content_idx") int content_idx,
			@RequestParam("board_info_idx") int board_info_idx, Model model) {

		ContentBean readContentBean = boardService.getContentInfo(content_idx);
		
		model.addAttribute("content", readContentBean);
		model.addAttribute("board_info_idx", board_info_idx);
		model.addAttribute("content_idx", content_idx);
		model.addAttribute("user_idx", loginuserBean.getUser_idx());
		
		return "board/read";
	}

	@GetMapping("/write")
	private String write(@ModelAttribute("writeContentBean")ContentBean writeContentBean,
			@RequestParam("board_info_idx") int board_info_idx, Model model) {

		writeContentBean.setContent_board_idx(board_info_idx);

		return "board/write";
	}

	@PostMapping("/write_pro")
	private String write_pro(@Valid @ModelAttribute("writeContentBean")
							 ContentBean writeContentBean, BindingResult result, Model model) {
		if (result.hasErrors()) {

			return "board/write";
		}

		boardService.addConetentInfo(writeContentBean);

		int content_idx = boardService.getContentIdx();
		int board_info_idx = writeContentBean.getContent_board_idx();
		
		model.addAttribute("content_idx", content_idx);
		model.addAttribute("board_info_idx", board_info_idx);
		
		return "board/write_success";
	}

	@GetMapping("/modify")
	private String modify(@RequestParam("content_idx") int content_idx,
						  @RequestParam("board_info_idx") int board_info_idx, Model model) {

		ContentBean modifyContentBean = boardService.getContentInfo(content_idx);
		
		System.out.println(modifyContentBean.getContent_board_idx());
		
		model.addAttribute("modifyContentBean", modifyContentBean);
		model.addAttribute("content_idx", content_idx);
		model.addAttribute("board_info_idx", board_info_idx);
		
		return "board/modify";
	}
	
	@PostMapping("/modify_pro")
	private String modify_pro(@Valid @ModelAttribute("modifyContentBean") ContentBean modifyContentBean,
			BindingResult result, Model model) {
		
		if (result.hasErrors()) {
			System.out.println("에러발생");
			return "board/modify";
			
		}
		
		int content_idx = modifyContentBean.getContent_idx();
		int board_info_idx = modifyContentBean.getContent_board_idx();
		
		model.addAttribute("content_idx", content_idx);
		model.addAttribute("board_info_idx", board_info_idx);
		System.out.println(board_info_idx);
		
		boardService.modifyContentInfo(modifyContentBean);
		
		return "board/modify_success";
	}

	@GetMapping("/not_writer")
	private String not_writer() {
		
		return "board/not_writer";
	}

	@GetMapping("/delete")
	private String delete(@RequestParam("content_idx") int content_idx, Model model) {
		
		boardService.contentDelete(content_idx);
		
		return "board/delete";
	}
}
