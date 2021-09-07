package Tunhpc00999_MiniProject.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Tunhpc00999_MiniProject.DAO.RoleDAO;
import Tunhpc00999_MiniProject.entity.Role;





@Service
public class RoleServiceIml implements RoleService{

	@Autowired
	RoleDAO dao;
	
	
	public List<Role> findAll() {
		return dao.findAll();
	}
   
}
