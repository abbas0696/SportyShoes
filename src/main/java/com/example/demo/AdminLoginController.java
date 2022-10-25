package com.example.demo;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminLoginController {
	
	@Autowired
	AdminDao dao;
	
	@RequestMapping("/insert")
	public ModelAndView insert(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		AdminLogin e = new AdminLogin();
		e.setUsername(request.getParameter("username"));
		e.setPassword(request.getParameter("password"));
		e.setEmail(request.getParameter("email"));
		AdminLogin ee = dao.insert(e);
		if(ee!=null) {
			mv.setViewName("success.jsp");
		}
		return mv;
	}
	

	@RequestMapping("/getall")
	public ModelAndView getall(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		List<AdminLogin> list = dao.getall();
		mv.setViewName("display.jsp");
		mv.addObject("list",list);
		return mv;
		
}
	@RequestMapping("/create")
	public ModelAndView create(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		Product p = new Product();
		p.setProductname(request.getParameter("productname"));
		p.setColour(request.getParameter("colour"));
		p.setPrice(request.getParameter("price"));
		Product pp = dao.create(p);
		if(pp!=null) {
			mv.setViewName("cart.jsp");
		}
		return mv;
	}
	
	@RequestMapping("/findall")
	public ModelAndView findall(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		List<Product> list = dao.findall();
		mv.setViewName("list.jsp");
		mv.addObject("list",list);
		return mv;
	}
	
	@RequestMapping("/display")
	public ModelAndView display(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		Payment t = new Payment();
		t.setCardnumber(request.getParameter("cardnumber"));
		t.setCardholdername(request.getParameter("cardholdername"));
		t.setExpiry(request.getParameter("expiry"));
		t.setCvv(request.getParameter("cvv"));
		Payment tt = dao.display(t);
		if(tt!=null) {
			mv.setViewName("paymentsuccess.jsp");
		}
		return mv;
}
}
	
