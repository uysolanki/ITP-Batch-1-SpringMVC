package com.itp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itp.model.Employee;

@Controller
public class MyController {

	@RequestMapping("/home")
	public String greet()
	{
		return "hello";
	}
	
//	@RequestMapping("/showEmployee")
//	public String showEmployee(ModelMap modelmap)
//	{
//		Employee e1=new Employee();
//		e1.setDesg("Manager");
//		e1.setEname("Alice");
//		e1.setEno(101);
//		e1.setSal(800);
//		
//		Employee e2=new Employee();
//		e2.setDesg("Clerk");
//		e2.setEname("Ben");
//		e2.setEno(102);
//		e2.setSal(500);
//		
//		Employee e3=new Employee();
//		e3.setDesg("Programmer");
//		e3.setEname("Chris");
//		e3.setEno(103);
//		e3.setSal(1800);
//		modelmap.addAttribute("employee1",e1);
//		modelmap.addAttribute("employee2",e2);
//		modelmap.addAttribute("employee3",e3);
//		return "show-employee";
//	}
	
//	@RequestMapping("/showEmployee")
//	public ModelAndView showEmployee()
//	{
//		Employee e1=new Employee();
//		e1.setDesg("Manager");
//		e1.setEname("Alice");
//		e1.setEno(101);
//		e1.setSal(800);
//		
//		Employee e2=new Employee();
//		e2.setDesg("Clerk");
//		e2.setEname("Ben");
//		e2.setEno(102);
//		e2.setSal(500);
//		
//		Employee e3=new Employee();
//		e3.setDesg("Programmer");
//		e3.setEname("Chris");
//		e3.setEno(103);
//		e3.setSal(1800);
//		
//		ModelAndView mav=new ModelAndView("show-employee");
//		
//		mav.addObject("employee1",e1);
//		mav.addObject("employee2",e2);
//		mav.addObject("employee3",e3);
//		
//		return mav;
//	}
	
	@RequestMapping("/empRegForm")
	public String empRegForm(Model model)
	{
		model.addAttribute("employee",new Employee());
		return "add-employee-form";
	}
	
	
	@PostMapping("/submitEmployee")
	public String submitEmployee(@ModelAttribute Employee employee,Model model)
	{
		model.addAttribute("employee1",employee);
		return "show-employee";
	}
}
