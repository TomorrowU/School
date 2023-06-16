package com.example.imple.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
		
		try {
		var detail =mapper.boardDetail(key);
		model.addAttribute("detail",detail);
		} catch (Exception e) {
			
		}
		
		return "board/detail";
	}

}
