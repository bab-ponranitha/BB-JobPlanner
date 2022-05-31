package com.jobplanner.config;

import org.hibernate.boot.model.naming.CamelCaseToUnderscoresNamingStrategy;
import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpperCaseNamingStrategy extends CamelCaseToUnderscoresNamingStrategy{

	@Override
	protected Identifier getIdentifier(String name, boolean quoted, JdbcEnvironment jdbcEnvironment) {
		return new Identifier( name.toUpperCase(), quoted );
	}

}
