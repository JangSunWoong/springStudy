package com.board.first.board.model.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.board.first.board.model.BoardVO;

@Repository
public class TestBoardDAO {
	
	@Autowired
	SqlSessionTemplate sqlSession;

	public List<BoardVO> selectBoardList() {
		return sqlSession.selectList("selectBoardList");
	}
	
}
