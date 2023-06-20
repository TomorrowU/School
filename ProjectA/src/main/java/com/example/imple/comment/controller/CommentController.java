package com.example.imple.comment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
public class CommentController implements  CreateController<CommentDTO> , UpdateController<CommentDTO> 
 , DeleteController<CommentDTO> {

	@Autowired
	CommentMapper mapper;
	
	@Autowired
	BoardMapper boardMapper;
	
	@GetMapping("/list")
	@ResponseBody
	public List<Comment> list(Model model ,HttpServletRequest request) {
			
		var value = mapper.commentList();
		
		return value;
		
	}
		
		
	@Override
	public void create(Model model, HttpServletRequest request) {
		
		
	}
	
	@Override
	public String create(@Valid CommentDTO dto, BindingResult binding, Model model, HttpServletRequest request,
			RedirectAttributes attr) {
		
		if(binding.hasErrors())
			return "redirect:/comment/create?error";

		dto.getModel();
		
		
		return "redirect:/comment/create?success";
	}
	@Override
	public void delete(Model model, HttpServletRequest request) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Model model, HttpServletRequest request) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String update(@Valid CommentDTO dto, BindingResult binding, Model model, HttpServletRequest request,
			RedirectAttributes attr) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String delete(@Valid CommentDTO dto, BindingResult binding, Model model, HttpServletRequest request,
			RedirectAttributes attr) {
		// TODO Auto-generated method stub
		return null;
	}




	
}
