package com.example.demo.service;

import java.util.List;

import com.example.demo.model.BoardVO;

public interface BoardService {
	
	List<BoardVO> getAll();

	BoardVO get(int boardNo);

	BoardVO write(BoardVO boardVO) throws Exception;

	int delete(int boardNo) throws Exception;

	int update(BoardVO boardVO) throws Exception;
}
