package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoConfiguration {


	@RequestMapping("/")
	public List<Demo> retrieveAllCourses() {
		return Arrays.asList(new Demo(1, "Learn AWS", "Pradeep"), new Demo(2, "Learn DevOps", "Pradeep"),
				new Demo(3, "Learn Azure", "Pradeep"),new Demo(4, "Codefresh", "Pradeep"));
	}

}
