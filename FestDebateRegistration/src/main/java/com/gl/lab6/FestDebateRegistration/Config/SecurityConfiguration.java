package com.gl.lab6.FestDebateRegistration.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;


@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter
{

	
	  private AuthenticationSuccessHandler authSuccessHandler;
	  
	  @Autowired 
	  public SecurityConfiguration (AuthenticationSuccessHandler authenticationSuccessHandler)
	  {
	  this.authSuccessHandler=authenticationSuccessHandler; 
	  }
	 
	
	@Bean
	public UserDetailsService userDetailsService()
	{
		User.UserBuilder users=User.withDefaultPasswordEncoder();
		
		InMemoryUserDetailsManager manager=new InMemoryUserDetailsManager();
		manager.createUser(users.username("admin").password("admin@123").roles("admin").build());
		manager.createUser(users.username("leo").password("leo@123").roles("student").build());
		
		return manager;
	}

	@Override	
	protected void configure(HttpSecurity http) throws Exception {

		http
		.authorizeRequests()
		.antMatchers("/admin*")
		.authenticated()
		.and()
			.formLogin().loginPage("/login").successForwardUrl("/admin-home").permitAll()
			.and()
			.logout().permitAll()
			.and()
			.exceptionHandling().accessDeniedPage("/access-denied");
			

		
	}
	
	
	

}
