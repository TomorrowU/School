package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import jakarta.servlet.DispatcherType;
import jakarta.servlet.http.HttpServletRequest;

@Configuration
public class SecurityConfig {
	
	
	@Bean
	PasswordEncoder encoder() {
	
		return new BCryptPasswordEncoder();
	}
	
	
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.csrf(csrf->{
			csrf.disable();
		});
		http.cors(cors->{
			cors.disable();
		});
		
		http.authorizeHttpRequests(request->{
			request.dispatcherTypeMatchers(DispatcherType.FORWARD).permitAll();
			request.requestMatchers("/").permitAll();
			request.requestMatchers("/webjars/**").permitAll();
			
			request.anyRequest().permitAll();
		});
		
		http.formLogin(login->{
			login.loginPage("/user/login");
			login.defaultSuccessUrl("/",true);
			login.failureHandler((request,response,e)->{
				request.setAttribute("exception", e);
				request.getRequestDispatcher("/user/login-fail").forward(request, response);
			});

		});
		
		http.logout(logout->{
			logout.logoutUrl("/user/logout");
		});
		
		
		
		
		return http.build();
	}
	
}
