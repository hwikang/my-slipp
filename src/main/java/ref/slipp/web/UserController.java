package ref.slipp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
	@PostMapping("/create")
	public String create(User user) {  //setter가 있으면 이렇게 한번에 user를 불러내서 세팅가능
		System.out.println(user);  //toString 하면 걍 뽑네?
		return "index";
	}
}
