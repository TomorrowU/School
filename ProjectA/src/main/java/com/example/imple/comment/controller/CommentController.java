package com.example.imple.comment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.imple.board.mapper.BoardMapper;
import com.example.imple.comment.mapper.CommentMapper;
import com.example.imple.comment.model.Comment;
import com.example.imple.comment.model.CommentDTO;
import com.example.standard.controller.CreateController;
import com.example.standard.controller.DeleteController;
import com.example.standard.controller.DetailController;
import com.example.standard.controller.UpdateController;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/comment")
public class CommentController  {

	@Autowired
	CommentMapper mapper;
	
	@Autowired
	BoardMapper boardMapper;
	
	@GetMapping("/list")
	@ResponseBody
	public List<Comment> list(Model model ,HttpServletRequest request , int bno) {
			
		var value = mapper.commentList(bno);
		
		return value;
		
	}
		
		
	@PostMapping("/insert")
	@ResponseBody
	public int insertComment(int bno , String content) throws Exception {
		
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

		// 사용자 이름(username) 가져오기
		String username = authentication.getName();
		
		
		Comment comment = Comment.of(3, bno, content, content, null);
		comment.setBno(bno);
		comment.setContent(content);
		comment.setWriter(username);
		
		var insert = mapper.commentInsert(comment);
		
		return insert;
	}
	
	

	@PostMapping("/update")
	@ResponseBody
	public int update(int cno,String content , Model model, HttpServletRequest request,
			RedirectAttributes attr) {
		
		Comment comment = Comment.of(cno, cno, content, content, null);
		
		comment.setContent(content);
		var update =mapper.commentUpdate(comment);
		
		
		return update;
	}
	
	@PostMapping("/delete/{cno}")
	@ResponseBody
	public int delete(@PathVariable int cno ,@Valid CommentDTO dto, BindingResult binding, Model model, HttpServletRequest request,
			RedirectAttributes attr) {
		
		
		
		var delete =mapper.commentDelete(cno);
		
		return delete;
	}




	
}
