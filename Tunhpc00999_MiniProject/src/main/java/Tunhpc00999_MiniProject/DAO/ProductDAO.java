package Tunhpc00999_MiniProject.DAO;



import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import Tunhpc00999_MiniProject.entity.Product;



public interface ProductDAO extends JpaRepository<Product, Integer>{
   @Query("SELECT p FROM Product p WHERE p.category.id=?1 and p.available=true")
   List<Product> findByCategoryId(String cid);
   
   @Query("SELECT p FROM Product p WHERE p.available=true")
   Page<Product> findAvailable(Pageable pa);
   
   @Query("SELECT p FROM Product p WHERE p.name LIKE ?1 ")
   List<Product> findByName(String name);
   
   @Query("SELECT p FROM Product p WHERE p.price=?1")
   List<Product> findByPrice(Double price);
}
