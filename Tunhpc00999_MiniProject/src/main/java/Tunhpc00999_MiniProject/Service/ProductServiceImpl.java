package Tunhpc00999_MiniProject.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import Tunhpc00999_MiniProject.DAO.ProductDAO;
import Tunhpc00999_MiniProject.entity.Product;


@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	ProductDAO pdao;

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return pdao.findAll();
	}

	@Override
	public Product findById(Integer id) {
		// TODO Auto-generated method stub
		return pdao.findById(id).get();
	}

	@Override
	public List<Product> findByCategoryId(String cid) {
		// TODO Auto-generated method stub
		return pdao.findByCategoryId(cid);
	}

	@Override
	public Product create(Product product) {
		// TODO Auto-generated method stub
		return pdao.save(product);
	}

	@Override
	public Product update(Product product) {
		// TODO Auto-generated method stub
		return pdao.save(product);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		 pdao.deleteById(id);
	}

	@Override
	public Page<Product> findAvail(Pageable pa) {
		return pdao.findAvailable(pa);
	}

	
	public List<Product> findByName(String name) {
		return pdao.findByName(name);
	}

	public List<Product> findByPrice(Double price) {
		 return pdao.findByPrice(price);
	}

}
