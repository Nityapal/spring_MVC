package springmvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {
	
	/*
	 * @RequestMapping("/one") public String one() {
	 * System.out.println("this is one handler"); return "redirect:/two"; //view not
	 * msg }
	 */
	/*
	 * @RequestMapping("/one") public RedirectView one() {
	 * System.out.println("this is one handler"); RedirectView rdv =new
	 * RedirectView(); rdv.setUrl("two"); return rdv; //view not msg }
	 */
	@RequestMapping("/one")
	public String one(HttpServletResponse response) {
		System.out.println("this is one handler");
		return "redirect:/two"; //view not msg
	}
	
	@RequestMapping("/two")
	public String two() {
		System.out.println("this is other handler");
		return "contact";
	}

}
