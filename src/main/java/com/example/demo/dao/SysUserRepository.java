package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.SysUser;

public interface SysUserRepository extends JpaRepository<SysUser, Long> {
	
	public SysUser findByUsername(String username);

}
