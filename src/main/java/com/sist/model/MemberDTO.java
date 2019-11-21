package com.sist.model;

import java.util.List;


public class MemberDTO {
	private String m_Email;

	private String m_Pw;

	private String m_Name;

	private String m_Nickname;

	private String m_Birth;

	private String m_Phone;

	private String m_Picture;

	private List<Blog_contentDTO> blog_contentDTO;

	private List<Content_CommentDTO> comments;

	public String getM_Email() {
		return m_Email;
	}

	public void setM_Email(String m_Email) {
		this.m_Email = m_Email;
	}

	public String getM_Pw() {
		return m_Pw;
	}

	public void setM_Pw(String m_Pw) {
		this.m_Pw = m_Pw;
	}

	public String getM_Name() {
		return m_Name;
	}

	public void setM_Name(String m_Name) {
		this.m_Name = m_Name;
	}

	public String getM_Nickname() {
		return m_Nickname;
	}

	public void setM_Nickname(String m_Nickname) {
		this.m_Nickname = m_Nickname;
	}

	public String getM_Birth() {
		return m_Birth;
	}

	public void setM_Birth(String m_Birth) {
		this.m_Birth = m_Birth;
	}

	public String getM_Phone() {
		return m_Phone;
	}

	public void setM_Phone(String m_Phone) {
		this.m_Phone = m_Phone;
	}

	public String getM_Picture() {
		return m_Picture;
	}

	public void setM_Picture(String m_Picture) {
		this.m_Picture = m_Picture;
	}

	public List<Blog_contentDTO> getBlog_contentDTO() {
		return blog_contentDTO;
	}

	public void setBlog_contentDTO(List<Blog_contentDTO> blog_contentDTO) {
		this.blog_contentDTO = blog_contentDTO;
	}

	public List<Content_CommentDTO> getComments() {
		return comments;
	}

	public void setComments(List<Content_CommentDTO> comments) {
		this.comments = comments;
	}

}
