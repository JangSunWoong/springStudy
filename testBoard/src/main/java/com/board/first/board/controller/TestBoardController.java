package com.board.first.board.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.board.first.board.model.BoardVO;
import com.board.first.board.service.TestBoardService;

@Controller
public class TestBoardController {
	
	@Autowired
	private TestBoardService testBoardService;

	
	@RequestMapping(value="/board/boardList.do")
	public ModelAndView boardListView(ModelAndView mav) {
		List<BoardVO> boardList = testBoardService.selectBoardList();
		
		mav.addObject("boardList", boardList);
		mav.setViewName("/board/boardList");
		return mav;
	}
}
