package com.online.jwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.online.jwt.model.AuthenticationRequest;
import com.online.jwt.model.AuthenticationResponse;
import com.online.jwt.model.UserDTO;
import com.online.jwt.service.JwtUserDetailsService;
import com.online.jwt.util.JwtUtil;

@Controller
public class HomeController {

	@Autowired
	private JwtUserDetailsService userDetailsService;
	
    @Autowired
    private JwtUtil jwtTokenUtil;
    
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@GetMapping("/")
	public String hello() {
		
		return "success.jsp";
	}
	
}
