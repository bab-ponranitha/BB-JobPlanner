package com.jobplanner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jobplanner.dto.UserRequest;
import com.jobplanner.models.AuthenticationRequest;
import com.jobplanner.models.AuthenticationResponse;
import com.jobplanner.service.UserDetailsServiceImpl;
import com.jobplanner.service.UserService;
import com.jobplanner.util.JwtUtil;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class AuthenicationController {
	
	@Autowired
	private AuthenticationManager authenticationManager;
	@Autowired
	private UserDetailsServiceImpl userDetailsService;
	@Autowired
	private UserService userService;
	@Autowired
	private JwtUtil jwtUtil;

	@GetMapping("/welcome")
	public String welcomeUser() {
		return "welcome";
	}
	@Secured("ADMIN")
	@GetMapping("/welcome-admin")
	public String welcomeAdmin() {
		return "welcome admin";
	}
	@PostMapping("/sign-in")
	public String saveUser(@RequestBody UserRequest userRequest){
		userService.saveUser(userRequest);
		return "user details saved successfully";
	}

	@PostMapping("/authenticate")
	public ResponseEntity<?> generateAuthenticationToken(@RequestBody AuthenticationRequest authenticationReq) {
		String jwt="";
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticationReq.getUserName(),
					authenticationReq.getPassword()));
			UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationReq.getUserName());
			jwt = jwtUtil.generateToken(userDetails);			
		} catch (DisabledException e) {
			log.error("USER_DISABLED", e);
		} catch (BadCredentialsException e) {
			log.error("INVALID_CREDENTIALS", e);
		}
		return ResponseEntity.ok(new AuthenticationResponse(jwt));
	}
}
