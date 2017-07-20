package com.example.demo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.example.demo.dao.SysUserRepository;
import com.example.demo.domain.SysUser;

public class CustomUserServcie implements UserDetailsService {

	@Autowired
	private SysUserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		SysUser user = userRepository.findByUsername(username);

		if (user == null) {
			throw new UsernameNotFoundException("用户名不存在");
		}

		return user;
	}

}
