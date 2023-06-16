package com.example.imple.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.imple.user.mapper.UserMapper;
import com.example.imple.user.model.UserDTO;
import com.example.standard.controller.CreateController;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@RequestMapping("/user")
@Controller
@Slf4j
public class UserCreateController implements CreateController<UserDTO> {

	@Autowired
	UserMapper mapper;
	
	@Override
	public void create(Model model, HttpServletRequest request) {
	
		var error = request.getParameter("error");
		if(error==null) {
			var session = request.getSession();
			session.removeAttribute("user");
			session.removeAttribute("binding");
		}
			
		
	
	}

	@Override
	@Transactional
	public String create(@Valid UserDTO dto, BindingResult binding, Model model, HttpServletRequest request,
			RedirectAttributes attr) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		var session = request.getSession();
		session.setAttribute("user", dto);
		session.setAttribute("binding", binding);
		
		if(binding.hasErrors())
			return "redirect:/user/create?error";
		
		var user = dto.getModel();
		
		var password =user.getPassword();
		password=encoder.encode(password);
		user.setPassword(password);
		
		user.setRole("user");
		
		System.out.println(1+user.getRole());
		
		try {
		mapper.insertUser(user);
		}
		catch (DataIntegrityViolationException e) {
			binding.reject("id를 입력하세요");
			
			return "redirect:/user/create?error";
		}
		
		
		return "redirect:/user/success?create";
	}

}
