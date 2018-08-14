package com.optum.springBoot.Controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class DashBoardController {
	
	@RequestMapping("/hi")
	public String say() {
		return "Hi1234567";
	}
}


/*


*/