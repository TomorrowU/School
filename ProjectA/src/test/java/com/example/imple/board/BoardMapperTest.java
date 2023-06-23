package com.example.imple.board;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.example.imple.board.mapper.BoardMapper;
import com.example.imple.board.model.Board;
import com.example.imple.user.mapper.UserMapper;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
public class BoardMapperTest {

	@Autowired
	BoardMapper mapper;
	
	@Autowired
	UserMapper userMapper;
	
	@Autowired
	ObjectMapper objectMapper;
	
	@Test
	@Transactional
	void boardCount() throws Exception {
		
		
		
		objectMapper.createGenerator(System.out)
					.writeObject(mapper.findByTitleContaining("ㄴㅁ"));
	}
}
