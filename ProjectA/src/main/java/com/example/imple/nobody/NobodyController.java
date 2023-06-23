package com.example.imple.nobody;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NobodyController {
	
	@GetMapping("/nobody")
	void nobody() {
		
	}
}
