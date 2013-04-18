package com.niuniu.service.share;

import com.niuniu.service.share.bean.User;

/**
 * @author rambodu
 * 2013-4-17
 */
public interface UserService {

	/**
	 * @param userId
	 * @return
	 */
	public User getUserById(long userId);
	
	public User login(String userName, String pass);
}
