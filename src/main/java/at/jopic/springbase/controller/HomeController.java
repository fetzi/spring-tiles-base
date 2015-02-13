package at.jopic.springbase.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value = "/")
	public String showHome() {

		// /page/{folder}/{file}/{pagetitle}
		return "/page/home/index/Index Page Title";
	}
}
