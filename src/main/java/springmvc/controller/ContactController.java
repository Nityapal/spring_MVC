/*
 * package springmvc.controller;
 * 
 * import org.springframework.stereotype.Controller; import
 * org.springframework.web.bind.annotation.RequestMapping;
 * 
 * @Controller public class ContactController {
 * 
 * public ContactController() {
 * System.out.println(">>> ContactController Initialized <<<"); }
 * 
 * @RequestMapping("/contact") public String showForm() { return "contact"; }
 * 
 * }
 */
package springmvc.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {

	@RequestMapping("/contact") 
	public String contact() { 
		return "contact"; 
	}
	
	@RequestMapping(path="/process",method=RequestMethod.POST)
	public String handleForm(@RequestParam("email") String userEmail, 
							@RequestParam("userName") String userName,
							@RequestParam("password") String userPassword,Model model) {
		
		System.out.println("user email is: "+userEmail);
		System.out.println("user name is: "+userName);
		System.out.println("user password is: "+userPassword);
		
		//process
		model.addAttribute("name", userName);
		model.addAttribute("email", userEmail);
		model.addAttribute("password", userPassword);
		
		return "success";
	}
	
	
}
