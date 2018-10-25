package app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	@RequestMapping(value ="/about")
	public String sayHello (@RequestParam(value="name",required=true) String name, Model model) {
		
		model.addAttribute("name", name);
		
		return "hello";
	}
		
}
