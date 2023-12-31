package com.example.imple.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.imple.board.mapper.BoardMapper;
import com.example.standard.controller.PageableController;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/board")
public class BoardListController implements PageableController {
	
	@Autowired
	BoardMapper mapper;
	
	@Autowired
	ObjectMapper json;
	
	@GetMapping("/list")
	void list(Model model, HttpServletRequest request) {
		var list = mapper.boardList();
		
		model.addAttribute("list",list);
		
	}

	@Override
	public String page(int pageNum, int pageSize, Model model) {
		
		PageHelper.startPage(pageNum, pageSize);
		var list = mapper.selectPage();
		var paging = PageInfo.of(list,5);
		model.addAttribute("list", list);
		model.addAttribute("paging", paging);
		
		try {
			paging.setList(null);
			var str = json.writeValueAsString(paging);
			model.addAttribute("json", str);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		return "board/page";
	}
	
	
	
}
