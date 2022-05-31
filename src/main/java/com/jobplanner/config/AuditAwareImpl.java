package com.jobplanner.config;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import com.jobplanner.service.UserDetailsImpl;

public class AuditAwareImpl implements AuditorAware<String> {

	@Override
	public Optional<String> getCurrentAuditor() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (authentication == null || !authentication.isAuthenticated()) {
			return null;
		}
		UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
		return Optional.of(userDetails.getUsername());
	}

}
