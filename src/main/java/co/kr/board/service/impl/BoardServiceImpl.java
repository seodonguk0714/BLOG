package co.kr.board.service.impl;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import co.kr.board.service.BoardService;


@Service("boardService")
public class BoardServiceImpl implements BoardService{
	
	@Resource(name="boardMapper")
	private BoardMapper boardMapper;

	@Override
	public List<HashMap<String, Object>> boardList(int page) {
		// TODO Auto-generated method stub
		return boardMapper.boardList(page);
	}
	
	
}
