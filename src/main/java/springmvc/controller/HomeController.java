package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("this is home url");
		model.addAttribute("name", "nitya");
		
		List<String> ls= new ArrayList<String>();
		ls.add("spider");
		ls.add("hulk");
		ls.add("thor");
		model.addAttribute("f", ls);
		
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about page");
		return "about";
	}
	
}
