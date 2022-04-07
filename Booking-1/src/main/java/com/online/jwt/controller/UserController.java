package com.online.jwt.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.online.jwt.model.UserDTO;
import com.online.jwt.service.CookieService;
import com.online.jwt.service.JwtUserDetailsService;
import com.online.jwt.util.JwtUtil;

@Controller
public class UserController {

	 @Autowired
		private JwtUserDetailsService userDetailsService;
		
	    @Autowired
	    private JwtUtil jwtTokenUtil;
	    
		@Autowired
		private AuthenticationManager authenticationManager;
		
		@Autowired
		CookieService cookieService;

		@GetMapping("/home")
		public String home(){	
			return "home.jsp";
	}
		@GetMapping("/login")
		public String login(){	
			return "login.jsp";
	}
		@GetMapping("/signup")
		public String signup(){	
			return "signup.jsp";
	}
		
		@PostMapping("/register")
		public String saveUser(UserDTO user) throws Exception {
			userDetailsService.save(user);
			
			return "redirect:/login";
	}
		
		
		@PostMapping("/checkLogin")
		public String checkUser(@RequestParam("username") String email,@RequestParam("password") String password,HttpServletResponse resp) throws Exception {
			
			
			try {
				authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(email, password));
				
				final UserDetails userDetails = userDetailsService.loadUserByUsername(email);
				
				final String jwt = jwtTokenUtil.generateToken(userDetails);
				
				resp.addCookie(cookieService.getJwtCookie(jwt));
				
				return "redirect:/";	
		        }	
			catch(BadCredentialsException e) {
				return "redirect:/users/login?messasg=Invalid+email+or+password&status=danger&show=show";
			}
		
		}	
}
