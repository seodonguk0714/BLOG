package co.kr.security.service.impl;

import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import co.kr.security.UserVO;
import co.kr.security.service.SecurityService;

@Service("securityService")
public class SecurityServiceImpl implements SecurityService{

	@Resource(name="securityMapper")
	private SecurityMapper securityMapper;
	
	@Override
	public UserVO login(String userId) {
		// TODO Auto-generated method stub
		return securityMapper.login(userId);
	}

	@Override
	public int urlCheck(HashMap<String, Object> urlParams) {
		// TODO Auto-generated method stub
		return securityMapper.urlCheck(urlParams);
	}

}
