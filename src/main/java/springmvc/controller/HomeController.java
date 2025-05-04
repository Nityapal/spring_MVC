package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("this is help controller");
		//creating modelandview object
		ModelAndView mod= new ModelAndView();
		//setting data
		mod.addObject("name", "umbrella");
		LocalDateTime now= LocalDateTime.now();
		mod.addObject("time", now);
		//setting view name
		mod.setViewName("help");
		return mod;
	}
	
}
