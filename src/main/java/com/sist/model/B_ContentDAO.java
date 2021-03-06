package com.sist.model;

import java.util.HashMap;
import java.util.List;

public interface B_ContentDAO {

	// 블로그 게시판글 추가
	public int create_board(Blog_contentDTO dto);

	// 블로그 게시글 가져오기
	public List<MemberDTO> getBoardList(Blog_contentDTO dto);

	public int create_Comment(Content_CommentDTO dto);

	public List<MemberDTO> getcomment_list(Content_CommentDTO dto);

	// 좋아요, 좋아요 취소 체크
	public String CheckGoods(Blog_Content_GoodDTO dto);

	// 좋아요 등록
	public int addGoods(Blog_Content_GoodDTO dto);

	// 좋아요 취소
	public int CancelGoods(Blog_Content_GoodDTO dto);

	// 좋아요 카운트
	public int getGoodsCount(int bc_No);

	// 좋아요 갯수 Blog_content에 수정
	public void updateGoods(Blog_contentDTO dto);

	public int getboard_no();

	// 블로그 내에서 인기글 리스트 가져오기
	public List<Blog_contentDTO> HotBoardList(int b_No);

	// 관리자 공지사항 추가
	public int create_notice(Blog_contentDTO dto);
	
	//블로그 내에서 공지사항 리스트 가져오기
    public List<Blog_contentDTO> NoticeBoardList(int b_No);

	public int update_Board(Blog_contentDTO dto);

	public int delete_Board(int bc_No);

	public int delete_Comment(Content_CommentDTO dto);

	public int update_Comment(Content_CommentDTO dto);

	public int create_Reply_Comment(Content_CommentDTO dto);

	public int getComment_step(int cc_No);

	public void update_Step(Content_CommentDTO dto);
   
	//사진첩 사진리스트 불러오기
    public List<HashMap<String, Object>> getPictureList(int b_No);
    
    // 인기사진첩 리스트 불러오기
    public List<HashMap<String, Object>> getHotpictureList(int b_No); 

}
