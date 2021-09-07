package Tunhpc00999_MiniProject.Service;



import java.util.List;

import Tunhpc00999_MiniProject.entity.Account;



public interface AccountService {
	public Account findById(String username);

	public List<Account> getAdministrators();

	public List<Account> findAll();
	
	Account create(Account account);

	Account update(Account account);

	void delete(String username);

	public List<Account> findByName(String fullname);

}	
