package com.jsp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.dto.Hospital;
import com.jsp.service.HospitalService;

@Controller
public class HospitalController {
	
	@Autowired
	HospitalService hospitalService;
	
	@RequestMapping("/loadhospital")
	public ModelAndView loadHospital() {
		ModelAndView andView=new ModelAndView("savehospital.jsp");
		andView.addObject("load",new Hospital());
		return andView;
	}
	@RequestMapping("/savehospital")
	public ModelAndView saveHospital(@ModelAttribute Hospital hospital) {
		Hospital hospital2=hospitalService.saveHospital(hospital);
		if(hospital2!=null) {
			ModelAndView andView=new ModelAndView("hospitalhome.jsp");
			andView.addObject("msg","data saved");
			return andView;
		}else {
			ModelAndView andView=new ModelAndView("/loadhospital");
			return andView;
		}
	}
	
	@RequestMapping("/displayhospital")
	public ModelAndView displayHospital() {
		List<Hospital> hospitals=hospitalService.getAll();
		ModelAndView andView=new ModelAndView("displayhospital.jsp");
		andView.addObject("list", hospitals);
		return andView;
	}
	
	@RequestMapping("/gethospitalbyid")
	public ModelAndView getById(@RequestParam int id) {
		Hospital hospital=hospitalService.getById(id);
		ModelAndView andView=new ModelAndView("update.jsp");
		andView.addObject("hospitalupdate",hospital);
		return  andView;
	}
	
	@RequestMapping("/updatehospital")
	public ModelAndView updateHospital(@ModelAttribute Hospital hospital) {
		hospitalService.upaHospital(hospital);
		ModelAndView andView=new ModelAndView("/displayhospital");
		return andView;
	}
	
	@RequestMapping("/deletehospital")
	public ModelAndView deleteHospital(@RequestParam int id) {
		hospitalService.deleteHospital(id);
		ModelAndView andView=new ModelAndView("/hospitalhome.jsp");
		return andView;
	}
}
