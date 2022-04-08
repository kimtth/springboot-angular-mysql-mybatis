package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ResponseResult;
import com.example.demo.model.ResponseUtils;
import com.example.demo.model.BoardVO;
import com.example.demo.service.BoardService;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BoardController {
	
	@Autowired BoardService boardService;

	@GetMapping("/api/getAll")
	public ResponseResult<List<BoardVO>> getAll() {
		List<BoardVO> result = boardService.getAll();
		return ResponseUtils.success("0000", result);
	}

	@GetMapping("/api/get/{boardNo}")
	public ResponseResult<BoardVO> get(@PathVariable int boardNo) throws Exception {
		BoardVO result = boardService.get(boardNo);

		return ResponseUtils.success("0000", result);
	}
	
	@PostMapping("/api/write")
	public ResponseResult<BoardVO> write(@RequestBody BoardVO boardVO) throws Exception {
		BoardVO result = boardService.write(boardVO);
		
		return ResponseUtils.success("0000", result);
	}
	
	@PostMapping("/api/delete")
	public ResponseResult<String> delete(@RequestBody BoardVO boardVO) throws Exception {
		boardService.delete(boardVO.getBoardNo());
		return ResponseUtils.success("0000", "");
	}
	
	@PostMapping("/api/update/{boardNo}")
	public ResponseResult<String> update(@PathVariable int boardNo, @RequestBody BoardVO boardVO) throws Exception {
		
		BoardVO param = new BoardVO();
		param.setBoardNo(boardNo);
		param.setTitle(boardVO.getTitle());
		param.setContents(boardVO.getContents());
		boardService.update(param);

		return ResponseUtils.success("0000", "");
	}
}
