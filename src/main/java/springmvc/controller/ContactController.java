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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {

	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonData(Model m) {
		m.addAttribute("Header", "Fill out the form");
	}
	
	@RequestMapping("/contact")
	public String contact(Model m) {
		System.out.println("creating form");
		return "contact";
	}

	@RequestMapping(path = "/process", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,Model model) {

		System.out.println(user);
		int id= this.userService.createUser(user);
		model.addAttribute("msg", "user created with id "+id+" successfully");
		return "success";
	}

	/*
	 * @RequestMapping(path="/process",method=RequestMethod.POST) public String
	 * handleForm(@RequestParam(name= "email") String userEmail,
	 * 
	 * @RequestParam("userName") String userName,
	 * 
	 * @RequestParam("password") String userPassword,Model model) {
	 * 
	 * System.out.println("user email is: "+userEmail);
	 * System.out.println("user name is: "+userName);
	 * System.out.println("user password is: "+userPassword);
	 * 
	 * User user= new User(); user.setEmail(userEmail); user.setUserName(userName);
	 * user.setPassword(userPassword);
	 * 
	 * System.out.println(user);
	 * 
	 * 
	 * //process
	 * 
	 * model.addAttribute("name", userName); model.addAttribute("email", userEmail);
	 * model.addAttribute("password", userPassword);
	 * 
	 * 
	 * model.addAttribute("user", user);
	 * 
	 * return "success"; }
	 */

}
