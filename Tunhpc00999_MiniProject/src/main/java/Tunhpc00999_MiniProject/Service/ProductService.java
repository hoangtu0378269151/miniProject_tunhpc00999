package Tunhpc00999_MiniProject.Service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import Tunhpc00999_MiniProject.entity.Product;



public interface ProductService {
   
	List<Product> findAll();

	Product findById(Integer id);

	List<Product> findByCategoryId(String cid);

	Product create(Product product);

	Product update(Product product);

	void delete(Integer id);

	Page<Product> findAvail(Pageable pa);

	List<Product> findByName(String name);

	List<Product> findByPrice(Double price);
	
	
}
