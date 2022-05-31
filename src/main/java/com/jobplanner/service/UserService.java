package com.jobplanner.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.jobplanner.dto.UserRequest;
import com.jobplanner.entity.User;
import com.jobplanner.entity.UserRole;
import com.jobplanner.models.AuditUser;
import com.jobplanner.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public User saveUser(UserRequest userRequest) {
		User user=new User();
		user.setFirstName(userRequest.getFirstName());
		user.setAddress(userRequest.getAddress());
		user.setEmail(userRequest.getEmail());
		user.setLastName(userRequest.getLastName());
		user.setMobile(userRequest.getMobile());
		user.setPassword(passwordEncoder.encode(userRequest.getPassword()));
		user.setUserName(userRequest.getUserName());
		user.setSuburb(userRequest.getSuburb());
		user.setState(userRequest.getState());
		user.setPostalCode(userRequest.getPostalCode());
		user.setActive(true);
		return userRepository.save(user);
	}
	
	public AuditUser getUserDetail(String userName) {
		AuditUser auditUser = null;
		Optional<User> userOptional = userRepository.findByUserName(userName);
		if (!ObjectUtils.isEmpty(userOptional)) {
			User user = userOptional.get();
			auditUser = new AuditUser();
			auditUser.setActive(user.getActive());
			auditUser.setId(user.getId());
			auditUser.setEmail(user.getEmail());
			auditUser.setPassword(user.getPassword());
			auditUser.setUsername(user.getUserName());
			auditUser.setActive(user.getActive());
			List<UserRole> userRoleSet = user.getUserRole();
			auditUser.setRoleScope(userRoleSet.stream().map(userRole -> userRole.getRoleScope().getScope().getName())
					.collect(Collectors.toList()));
		}
		return auditUser;
	}

}
