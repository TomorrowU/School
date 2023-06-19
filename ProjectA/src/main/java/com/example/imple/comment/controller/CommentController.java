package com.example.imple.comment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
public class CommentController implements DetailController<Comment> , CreateController<CommentDTO> , UpdateController<CommentDTO> 
 , DeleteController<CommentDTO> {

	@Override
	public String detail(Comment key, Model model, HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void create(Model model, HttpServletRequest request) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String create(@Valid CommentDTO dto, BindingResult binding, Model model, HttpServletRequest request,
			RedirectAttributes attr) {
		// TODO Auto-generated method stub
		return null;
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
