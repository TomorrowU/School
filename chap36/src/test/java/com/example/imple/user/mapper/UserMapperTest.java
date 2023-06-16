package com.example.imple.user.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.example.imple.user.model.User;

@SpringBootTest
public class UserMapperTest {

	@Autowired
	UserMapper mapper;
	
	
	@Test
	void selectById() {
		var users=mapper.selectById("java");
		
		System.out.println(users);
		assertThat(users).isNotNull();
		
		users=mapper.selectById("python");
		System.out.println(users);
		
	}
	
	@Test
	@Transactional
	void insertUser() {
		var user = User.builder()
					   .id("Oracle")
					   .password("1234")
					   .role("USER")
					   .build();
		
		mapper.insertUser(user);
		
		System.out.println(mapper.selectById("Oracle"));
		
	}
}
