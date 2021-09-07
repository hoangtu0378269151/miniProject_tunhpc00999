package Tunhpc00999_MiniProject.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/home/index")
    public String index() {
    	return "redirect:/home/product";
    }
    
    @RequestMapping({"/admin", "/admin/home/index"})
    public String admin() {
    	return "redirect:/assets/admin/index.html";
    }
}
