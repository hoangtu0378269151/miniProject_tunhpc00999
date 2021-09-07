package Tunhpc00999_MiniProject.Service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Tunhpc00999_MiniProject.DAO.CategoryDAO;
import Tunhpc00999_MiniProject.entity.Category;



@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	CategoryDAO cDao;
	
	@Override
	public List<Category> findAll() {
		return cDao.findAll();
	}
    
}
