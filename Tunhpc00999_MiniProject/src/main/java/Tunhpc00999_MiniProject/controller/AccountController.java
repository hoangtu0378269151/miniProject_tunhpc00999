package Tunhpc00999_MiniProject.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccountController {
    
	@RequestMapping("/account/dangky")
	public String dangky() {
		return "layout/dangky";
	}
	
	@RequestMapping("/account/dmk")
	public String dmk() {
		return "layout/doimatkhau";
	}
	
	@RequestMapping("/account/quenmk")
	public String quenmk() {
		return "layout/quenmatkhau";
	}
}
