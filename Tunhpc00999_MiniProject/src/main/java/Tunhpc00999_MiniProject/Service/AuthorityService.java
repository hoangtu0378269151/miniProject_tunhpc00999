package Tunhpc00999_MiniProject.Service;

import java.util.List;

import Tunhpc00999_MiniProject.entity.Authority;



public interface AuthorityService {

	public List<Authority> findAuthoritiesOfAdministrators();

	public List<Authority> findAll();

	public Authority create(Authority auth);

	public void delete(Integer id);
    
}
