package Tunhpc00999_MiniProject.Service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Tunhpc00999_MiniProject.DAO.AccountDAO;
import Tunhpc00999_MiniProject.DAO.AuthorityDAO;
import Tunhpc00999_MiniProject.entity.Account;
import Tunhpc00999_MiniProject.entity.Authority;




@Service
public class AuthorityServiceImpl implements AuthorityService{

	@Autowired
	AuthorityDAO dao;
	
	@Autowired
	AccountDAO accDao;
	
	
	public List<Authority> findAuthoritiesOfAdministrators() {
        List<Account> accounts = accDao.getAdministrators();
		return dao.authoritiesOf(accounts);
	}

	
	public List<Authority> findAll() {
		return dao.findAll();
	}

	
	public Authority create(Authority auth) {
		return dao.save(auth);
	}

	
	public void delete(Integer id) {
		dao.deleteById(id);
	}

}
