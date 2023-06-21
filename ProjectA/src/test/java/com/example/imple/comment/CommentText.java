package com.example.imple.comment;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.imple.comment.mapper.CommentMapper;
import com.example.imple.comment.model.Comment;

@SpringBootTest
public class CommentText {

	@Autowired
	CommentMapper mapper;
	
	@Test
	void selectCount() {
		Comment cm = Comment.of(2,2, "수정수정","수정수정", null);
		try {
			System.out.println(mapper.commentCount());
//			System.out.println(mapper.commentList());
//			mapper.commentInsert(cm);
			mapper.commentUpdate(cm);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	void comment() {
//		System.out.println(mapper.commentList());
		
		
	}
}
