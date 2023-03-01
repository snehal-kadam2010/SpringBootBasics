package com.csi.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ApplicationController {
@GetMapping
public String sayHello() {
	return "Welcome to Fintech Csi";
}
@GetMapping("/services")
public String sayServices() {
	return "Full Java Developer";
}
@GetMapping("/address")
public String sayadd() {
	return "Pune";
}
@GetMapping("/listofEmployee")
public List<Employee> detailsEmp(){
	return Stream.of(new Employee(101, "swati"),new Employee(102, "Ram")).collect(Collectors.toList());
	
}

}
