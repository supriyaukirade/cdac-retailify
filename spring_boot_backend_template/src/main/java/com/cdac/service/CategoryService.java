package com.cdac.service;

import com.cdac.io.CategoryRequest;
import com.cdac.io.CategoryResponse;

public interface CategoryService {
	
	CategoryResponse add(CategoryRequest request);

}
