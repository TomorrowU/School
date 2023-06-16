package com.example.standard.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import jakarta.servlet.http.HttpServletRequest;

public interface DetailController<T> {
	
	@GetMapping("/detail/{key}")
	String detail (@PathVariable T key, Model model , HttpServletRequest request);
}
