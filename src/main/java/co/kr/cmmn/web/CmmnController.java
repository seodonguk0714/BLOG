package co.kr.cmmn.web;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CmmnController {
	
	@RequestMapping(value = "/mainPage.do" , method = RequestMethod.GET)
	public String mainPage() {
		return "cmmn/main";
	}
	
	@RequestMapping(value = "/login.do" , method = RequestMethod.GET)
	public String loginPage() {
		return "/cmmn/login";
	}
	
	@RequestMapping(value = "/errorPage.do", method = RequestMethod.GET )
	public String errorPage() {
		return "/cmmm/error";
	}
}
