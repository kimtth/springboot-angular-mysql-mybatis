package com.example.demo;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.BoardVO;

@Mapper
public interface BoardMapper {

	List<BoardVO> getAll();

	BoardVO get(int boardNo);

	int write(BoardVO boardVO);

	int delete(int boardNo);
	
	int update(BoardVO boardVO);
}
