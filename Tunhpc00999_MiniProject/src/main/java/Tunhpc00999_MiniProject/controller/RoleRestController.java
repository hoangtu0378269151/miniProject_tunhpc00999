package Tunhpc00999_MiniProject.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Tunhpc00999_MiniProject.Service.RoleService;
import Tunhpc00999_MiniProject.entity.Role;




@CrossOrigin("*")
@RestController
@RequestMapping("/rest/roles")
public class RoleRestController {
   @Autowired
   RoleService roleService;
   
   @GetMapping
   public List<Role> getAll(){
	   return roleService.findAll();
   }
}
