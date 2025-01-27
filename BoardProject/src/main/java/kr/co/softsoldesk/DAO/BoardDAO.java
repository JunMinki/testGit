package kr.co.softsoldesk.DAO;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.softsoldesk.beans.ContentBean;
import kr.co.softsoldesk.mapper.BoardMapper;

@Repository
public class BoardDAO {

	@Autowired
	private BoardMapper boardMapper;
	
	
	//게시글 저장
	public void addContentInfo(ContentBean writeContentBean) {
		
			boardMapper.addContentInfo(writeContentBean);
			
	}
	
	public int getContentIdx() {
		
		return boardMapper.getContentIdx();
	}
	
	//게시판 이름 가져오기
	public String getBoardInfoName(int board_info_idx) {
		//가져온 게시판의 고유 번호값에 따른 이름값을 리턴해줌	
		return boardMapper.getBoardInfoName(board_info_idx);
	}
	
	//특정 게시판의 게시글 제목, 작성자 이름, 작성 날짜 가져오기
	public List<ContentBean> getContentList(int board_info_idx, RowBounds rowBounds) {
		
		return boardMapper.getContentList(board_info_idx, rowBounds);
	}
	//특정 게시글 가져오기
	public ContentBean getContentInfo(int content_idx) {
		
		return boardMapper.getContentInfo(content_idx);
	}
	
	//게시글 수정하기
	public void modifyContentInfo(ContentBean modifyContent) {
		
		boardMapper.modifyContentInfo(modifyContent);
	}
	
	//게시글 삭제하기
	public void ContentDelete(int content_idx) {
		
		boardMapper.contentDelete(content_idx);
	}
	
	//게시글의 개수
	public int getContentCnt(int content_board_idx) {
		
		return boardMapper.getContentCnt(content_board_idx);
	}
}
