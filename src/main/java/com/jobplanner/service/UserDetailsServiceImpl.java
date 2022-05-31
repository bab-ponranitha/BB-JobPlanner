package com.jobplanner.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.jobplanner.entity.User;
import com.jobplanner.entity.UserRole;
import com.jobplanner.models.AuditUser;
import com.jobplanner.repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	@Autowired
	private UserRepository userRepository;

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		return UserDetailsImpl.build(getUserDetail(userName));
	}

	private AuditUser getUserDetail(String userName) {
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
