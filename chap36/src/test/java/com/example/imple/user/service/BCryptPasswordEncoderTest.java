package com.example.imple.user.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


public class BCryptPasswordEncoderTest {
	
	BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
	
	
	@Test
	void encode() {
	
		var encodeStr = encoder.encode("1234");
		System.out.println(encodeStr);
		
		
		//$2a$10$sWir0UdE96tWUbNBvFE3ruoARN1Szx71SRijPp2zvJbAYD9507tO2
		//$2a$10$vbxncCR/PRglzaoyWrJk4e/trm1k84nsDib8xcCXtIMWFKgvsHAgy
	}
	
	@Test
	void matches() {
		var success = encoder.matches("1234", "$2a$10$sWir0UdE96tWUbNBvFE3ruoARN1Szx71SRijPp2zvJbAYD9507tO2");
		System.out.println(success);
		assertThat(success).isEqualTo(true);
		
		success= encoder.matches("1234","$2a$10$vbxncCR/PRglzaoyWrJk4e/trm1k84nsDib8xcCXtIMWFKgvsHAgy");
		System.out.println(success);
		assertThat(success).isEqualTo(true);
		
		success= encoder.matches("1234","1234");
		System.out.println(success);
		assertThat(success).isEqualTo(false);
	}
	
}
