package co.kr.security.config;

import java.util.HashMap;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import co.kr.security.service.SecurityService;

public class Interceptor extends HandlerInterceptorAdapter {
	
	@Resource(name="securityService")
	private SecurityService securityService;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		SecurityContext context = SecurityContextHolder.getContext();
		Authentication authentication = context.getAuthentication();
		HashMap<String, Object> urlParams = new HashMap<String,Object>();
		
		
		String auth = authentication.getAuthorities().toArray()[0].toString();
		String url = request.getRequestURI();
		
		if(auth.equals("ROLE_ANONYMOUS")) {
			response.sendRedirect("/login.do");
			return false;
		}else {
			if(!auth.equals("ROLE_ADMIN")) {
				urlParams.put("auth", auth);
				urlParams.put("url", url);
				int result = securityService.urlCheck(urlParams);
				if(result < 0 ) {
					response.sendRedirect("/login.do");
					return false;
				}
			}
		}
		return super.preHandle(request, response, handler);
	}

	
}
