package com.example.service1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service1")
public class ServiceController {
@GetMapping("test2")

public String test2() {
	return "this is test2 controller";
}
}
