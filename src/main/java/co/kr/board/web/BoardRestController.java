package co.kr.board.web;

import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.kr.board.service.BoardService;

@Controller
@RequestMapping("/ajax")
public class BoardRestController {
	
	@Resource(name = "boardService")
	private BoardService boardService;
	
	@RequestMapping(value ="/boardList.do" ,method = RequestMethod.GET)
	public ModelAndView boardList(@RequestParam HashMap<String, Object> params) {
		ModelAndView jsonView = new ModelAndView("jsonView");
		int page = Integer.parseInt((String)params.get("page"));
		jsonView.addObject("list",boardService.boardList(page));
		return jsonView;
	}
}
