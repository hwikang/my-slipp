package ref.slipp.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	@GetMapping("/helloworld")
	public String welcome(String name ,int age,Model model) {
		System.out.println("된느거니?");
		model.addAttribute("name",name);

		model.addAttribute("age",age);
		return "welcome";  //html무시하고 앞에이름만
	}
}