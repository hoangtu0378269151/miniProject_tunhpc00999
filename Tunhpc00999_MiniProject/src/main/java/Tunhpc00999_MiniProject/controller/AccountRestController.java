package Tunhpc00999_MiniProject.controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Tunhpc00999_MiniProject.Service.AccountService;
import Tunhpc00999_MiniProject.entity.Account;




@CrossOrigin("*")
@RestController
@RequestMapping("/rest/accounts")
public class AccountRestController {
    @Autowired
    AccountService accService;
    
    @GetMapping
    public List<Account> getAccounts(@RequestParam("admin")Optional<Boolean> admin){
    	if(admin.orElse(false)) {
    		return accService.getAdministrators();
    	}
    	return accService.findAll();
    }
    
    @GetMapping("load")
	public List<Account> getAll() {
		return accService.findAll();
	}
    
    @GetMapping("{username}")
	public Account getOne(@PathVariable("username") String username) {
		return accService.findById(username);
	}
	@PostMapping
	public Account create(@RequestBody  Account account) {
		return accService.create(account);
	}
	@PutMapping("{username}")
	public Account update(@PathVariable("username") String username,@RequestBody Account account) {
		return accService.update(account);
	}
	@DeleteMapping("{username}")
	public void delete(@PathVariable("username") String username) {
		accService.delete(username);
	}
	
	@PostMapping("/dky")
	public Account dangky(@RequestBody  Account account) {
		return accService.create(account);
	}
	
	@GetMapping("/findname/{fullname}")
	public List<Account> getName(@PathVariable("fullname")String fullname) {
		return accService.findByName("%" + fullname + "%");
	}
}
