package com.example.imple.user.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.imple.user.mapper.UserMapper;
import com.example.imple.user.model.User;
import com.example.imple.user.model.UserDTO;
import com.example.standard.controller.CreateController;

import jakarta.el.PropertyNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/user")
@Slf4j
public class UserSigninController implements CreateController<UserDTO>{

	@Autowired
	UserMapper mapper;
	
	@Override
	public void create(Model model, HttpServletRequest request) {
		
		log.info("GET create()...");
		var error = request.getParameter("error");
		if (error == null) {
			var session = request.getSession();
			session.removeAttribute("user");
			session.removeAttribute("binding");
	}

	}
	
	@Override
	@Transactional
	public String create(UserDTO dto, BindingResult binding, Model model, HttpServletRequest request,
			RedirectAttributes attr) {
		System.out.println("AAAA");
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		var session = request.getSession();
		session.setAttribute("user", dto);
		session.setAttribute("binding", binding);
		
		if(binding.hasErrors())
			return "redirect:/user/create?error";
		
			
			var user = dto.getModel();
			var password=user.getPassword();
			user.setPassword(encoder.encode(password));
			if(user.getRole()!="USER" && user.getRole()!="ADMIN")
				user.setRole("USER");
			
			System.out.println("BBB");
		try {
		mapper.insertUser(user);
		}
		catch (DataIntegrityViolationException e) {
			binding.reject("DataIntegrityViolationException", " id를 입력하세요");
			return "redirect:/user/create?error";
		}	
		
		return "redirect:/user/success/?create";
	}
		
	}


