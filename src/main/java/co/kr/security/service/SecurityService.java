package co.kr.security.service;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import co.kr.security.UserVO;

public interface SecurityService {

	public UserVO login(String userId);
	
	public int urlCheck(HashMap<String, Object> urlParams);

}
