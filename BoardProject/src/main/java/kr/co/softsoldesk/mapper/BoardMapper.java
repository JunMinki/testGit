package kr.co.softsoldesk.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.session.RowBounds;

import kr.co.softsoldesk.beans.ContentBean;

public interface BoardMapper {
	
	//게시글 입력 쿼리문
	@Insert("insert into content_table(content_idx, content_subject, content_text, content_file,"
			+ "content_writer_idx, content_board_idx, content_date)"
			+ "values(content_seq.nextval, #{content_subject}, #{content_text}, #{content_file, jdbcType=VARCHAR},"
			+ "#{content_writer_idx}, #{content_board_idx}, sysdate)")
	
	void addContentInfo(ContentBean writeContentBean);
	//jdbcType=VARCHAR : null값 허용(null을 문자로 인식)
	
	//게시글 작성시 게시글 조회
	@Select("select max(content_idx) from content_table")
	int getContentIdx();
	
	//게시판 이름 쿼리문
	@Select("select board_info_name from board_info_table where board_info_idx = #{board_info_idx}")
	String getBoardInfoName(int board_info_idx);
	
	//게시글 목록 쿼리문
	@Select("select c.content_idx, c.content_subject, to_char(c.content_date, 'YYYY-MM-DD') as content_date, "
			+ "u.user_name as content_writer_name "
			+ "from content_table c, user_table u "
			+ "where c.content_writer_idx = u.user_idx "
			+ "and c.content_board_idx = #{board_info_idx} "
			+ "order by content_idx desc")
	List<ContentBean> getContentList(int board_info_idx, RowBounds rowbounds);
	
	//게시글 내용 쿼리문
	@Select("select c.content_writer_idx, c.content_board_idx, c.content_idx, c.content_subject, to_char(c.content_date, 'YYYY-MM-DD') as content_date, "
			+ "u.user_name as content_writer_name, c.content_text, c.content_file "
			+ "from content_table c, user_table u "
			+ "where c.content_writer_idx = u.user_idx "
			+ "and c.content_idx = #{content_idx}")
	ContentBean getContentInfo(int content_idx);

	@Update("update content_table set content_subject = #{content_subject},"
			+ "content_text = #{content_text}, content_file = #{content_file,"
			+ "jdbcType=VARCHAR} where content_idx = #{content_idx}")
	void modifyContentInfo(ContentBean modifyContent);
	
	//게시글 삭제 쿼리문
	@Delete("delete from content_table where content_idx = ${content_idx}")
	void contentDelete(int content_idx);
	
	@Select("select count(*) from content_table where content_board_idx = #{content_board_idx}")
	int getContentCnt(int content_board_idx);
	
}