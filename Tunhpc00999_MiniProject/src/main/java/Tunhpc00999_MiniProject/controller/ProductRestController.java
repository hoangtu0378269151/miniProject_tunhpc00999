package Tunhpc00999_MiniProject.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Tunhpc00999_MiniProject.Service.ProductService;
import Tunhpc00999_MiniProject.entity.Product;




@CrossOrigin("*")
@RestController
@RequestMapping("/rest/products")
public class ProductRestController {
	@Autowired
	ProductService productService;

	@GetMapping()
	public List<Product> getAll() {
		return productService.findAll();
	}
	
	@GetMapping("{id}")
	public Product getOne(@PathVariable("id") Integer id) {
		return productService.findById(id);
	}
	@PostMapping
	public Product create(@RequestBody Product product) {
		return productService.create(product);
	}
	@PutMapping("{id}")
	public Product update(@PathVariable("id") Integer id,@RequestBody Product product) {
		return productService.update(product);
	}
	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") Integer id) {
		productService.delete(id);
	}
	
	@GetMapping("/findname/{name}")
	public List<Product> getName(@PathVariable("name")String name) {
		return productService.findByName("%" + name + "%");
	}
	
	@GetMapping("/findprice/{price}")
	public List<Product> getPrice(@PathVariable("price") Double price) {
		return productService.findByPrice(price);
	}
	
}
