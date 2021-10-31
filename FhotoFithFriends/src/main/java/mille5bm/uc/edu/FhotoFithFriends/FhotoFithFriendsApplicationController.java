package mille5bm.uc.edu.FhotoFithFriends;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FhotoFithFriendsApplicationController {
	@RequestMapping("/index")
	public String start() {
		return "index";
	}

}

//Added a controller since it was missing