package co.kr.security.config;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import co.kr.cmmn.service.impl.CmmnMapper;
import co.kr.security.UserVO;
import co.kr.security.service.SecurityService;

public class CustomUserDetailsService implements UserDetailsService{
	
	@Resource(name="securityService")
	private SecurityService securityService;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		String userId = username;
		UserVO vo= securityService.login(userId);
		if(vo == null) {
			throw new UsernameNotFoundException(username);
		}
		
		return vo;
	}

}
