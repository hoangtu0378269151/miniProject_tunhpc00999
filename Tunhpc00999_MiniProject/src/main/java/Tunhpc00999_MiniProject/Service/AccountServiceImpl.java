package Tunhpc00999_MiniProject.Service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Tunhpc00999_MiniProject.DAO.AccountDAO;
import Tunhpc00999_MiniProject.entity.Account;



@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	AccountDAO adao;

	@Override
	public Account findById(String username) {
		// TODO Auto-generated method stub
		return adao.findById(username).get();
	}


	public List<Account> getAdministrators() {
		return adao.getAdministrators();
	}


	public List<Account> findAll() {
		return adao.findAll();
	}
	

	public Account create(Account account) {
		return adao.save(account);
	}


	public Account update(Account account) {
		// TODO Auto-generated method stub
		return adao.save(account);
	}


	public void delete(String username) {
		// TODO Auto-generated method stub
		adao.deleteById(username);
	}


	@Override
	public List<Account> findByName(String fullname) {
		return adao.findByName(fullname);
	}
	
	
	
	
}
