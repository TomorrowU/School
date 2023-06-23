package com.example.imple.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.imple.board.mapper.BoardMapper;
import com.example.imple.board.model.BoardDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RequestMapping("/board")
@Controller
public class BoardSearchController {

	@Autowired
	BoardMapper mapper;
	
	@Autowired
	ObjectMapper json;
	
	@GetMapping("/search/{pageNum}/{pageSize}")
	String search(@PathVariable int pageNum, @PathVariable int pageSize,BoardDTO dto, Model model) {
		
		PageHelper.startPage(pageNum, pageSize);
		var keyword=dto.getSubject();
		var list = mapper.findByTitleContaining(keyword);
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
		
		return "board/search";
		
		
	}
	
}
