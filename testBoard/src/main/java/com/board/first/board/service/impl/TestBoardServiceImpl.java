package com.board.first.board.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.first.board.model.BoardVO;
import com.board.first.board.model.dao.TestBoardDAO;
import com.board.first.board.service.TestBoardService;

@Service
public class TestBoardServiceImpl implements TestBoardService{

	@Autowired
	TestBoardDAO testBoardDAO;

	@Override
	public List<BoardVO> selectBoardList() {
		return testBoardDAO.selectBoardList();
	}
	
}
