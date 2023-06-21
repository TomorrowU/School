package com.example.imple.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.imple.board.mapper.BoardMapper;
import com.example.standard.controller.DetailController;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/board")
public class BoardDetailController implements DetailController<Integer>{

	@Autowired
	BoardMapper mapper;
	
	@Override
	public String detail(Integer key, Model model, HttpServletRequest request) {
		
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String username = authentication.getName();
		
		
		
		try {
		var detail =mapper.boardDetail(key);
		model.addAttribute("detail",detail);
		model.addAttribute("username",username);
		} catch (Exception e) {
			
		}
		
		return "board/detail";
	}

}
