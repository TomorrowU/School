package com.example.imple.user;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.example.imple.user.mapper.UserMapper;
import com.example.imple.user.model.User;
import com.example.imple.user.model.UserDTO;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
public class UserMapperTest {

	@Autowired
	UserMapper mapper;
	
	@Autowired
	ObjectMapper objcMapper;
	
	@Test
	void selectById() throws IOException {
		
		System.out.println(mapper.selectById("java"));
		objcMapper.createGenerator(System.out)
				  .writeObject(mapper.selectAll());
	}
	
	@Test
	@Transactional
	void insertUser() throws IOException{
		
		User user = User.of("hi","1234","USER");
		
		mapper.insertUser(user);
		
		objcMapper.createGenerator(System.out)
		  .writeObject(mapper.selectAll());
	}
	
}
