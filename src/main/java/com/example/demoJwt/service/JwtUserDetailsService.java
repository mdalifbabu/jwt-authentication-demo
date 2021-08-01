package com.example.demoJwt.service;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService{
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
		if("jwtdemo".equals(username)) {
			return new User("jwtdemo", "$2a$10$MsX.pCiSwwErSemJTUczOOddeJANY399m9TIcEY0BWMFkrY/1Deu6", new ArrayList<>());
		}else {
			throw new UsernameNotFoundException("User not with user name" + username);
		}
	}
}
