package com.jfsaaved.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
public class PostController {

	@Secured("ROLE_ADMIN")
	@RequestMapping("/list")
	public String list() {
		return "list post ..";
	}
	
	@Secured("ROLE_USER")
	@RequestMapping("/listuser")
	public String listuser() {
		return "list post ..";
	}
	
	@Secured({"ROLE_USER","ROLE_GUEST"})
	@RequestMapping("/listguest")
	public String listguest() {
		return "list post ..";
	}
	
}
