package co.kr.security.service.impl;

import java.util.HashMap;

import co.kr.security.UserVO;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("securityMapper")
public interface SecurityMapper {
	
	public UserVO login(String userId);
	
	public int urlCheck(HashMap<String, Object> urlParams);


}
