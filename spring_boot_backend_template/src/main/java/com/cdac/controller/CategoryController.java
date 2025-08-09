package com.cdac.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.io.CategoryRequest;
import com.cdac.io.CategoryResponse;

@RestController
@RequestMapping("/categories")
public class CategoryController {
	
	@PostMapping
	public CategoryResponse addCategory(@RequestBody CategoryRequest request) {
		
		
		
		
		
	}

}
