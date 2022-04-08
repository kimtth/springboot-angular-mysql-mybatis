package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.BoardMapper;
import com.example.demo.model.BoardVO;


@Service
public class BoardSeviceImpl implements BoardService{

	@Autowired 
	private BoardMapper boardMapper;

	@Override
	public List<BoardVO> getAll() {
		return boardMapper.getAll();
	}
	
	@Override
	public BoardVO get(int boardNo) {
		return boardMapper.get(boardNo);
	}
	
	@Transactional
	@Override
	public BoardVO write(BoardVO boardVO) throws Exception {
		int rowCount = boardMapper.write(boardVO);
		int newBoardNo = boardVO.getBoardNo();
		BoardVO newBoard;
		if(rowCount == 1) {
			newBoard = boardMapper.get(newBoardNo);
		} else {
			throw new Exception();
		}
		
		return newBoard;
	}
	
	@Override
	public int delete(int boardNo) throws Exception {
		int flag = boardMapper.delete(boardNo);
		if(flag == 1) {
			return flag;
		} else {
			throw new Exception();
		}
	}
	
	@Override
	public int update(BoardVO boardVO) throws Exception {
		int flag = boardMapper.update(boardVO);
		if(flag == 1) {
			return flag;
		} else {
			throw new Exception();
		}
	}
}
