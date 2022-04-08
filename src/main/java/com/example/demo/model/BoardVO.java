package com.example.demo.model;

import lombok.Data;

@Data
public class BoardVO {
	private int 	boardNo; 		//글 번호
	private String 	title;			//제목
	private String	contents;		//내용
	private int		hitCnt;			//조회수
	private String	createTime;		//생성시간
	private String	creatorId;		//작성자
	private String	updateTime;		//수정시간
	private String	updaterId;		//수정자
	private String	deletedYN;		//삭제여부
}
