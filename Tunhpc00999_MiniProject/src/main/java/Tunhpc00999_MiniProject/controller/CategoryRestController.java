package Tunhpc00999_MiniProject.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Tunhpc00999_MiniProject.Service.CategoryService;
import Tunhpc00999_MiniProject.entity.Category;



@CrossOrigin("*")
@RestController
@RequestMapping("/rest/categories")
public class CategoryRestController {
	@Autowired
	CategoryService categoryService;

	@GetMapping()
	public List<Category> getAll() {
		return categoryService.findAll();
	}
	
}
