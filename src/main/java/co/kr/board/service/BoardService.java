package co.kr.board.service;

import java.util.HashMap;
import java.util.List;

public interface BoardService {
	
	public List<HashMap<String, Object>> boardList(int page);
	
}
