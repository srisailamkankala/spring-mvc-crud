package com.jsp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.dao.HospitalDao;
import com.jsp.dto.Hospital;

@Component
public class HospitalService {
		@Autowired
		HospitalDao dao;
		
	public Hospital saveHospital( Hospital hospital) {
			return dao.saveHospital(hospital);
	}	
	public Hospital upaHospital(Hospital hospital) {
		return dao.updateHospital(hospital);
	}
	public Hospital deleteHospital(int id) {
		return dao.deleteHospital(id);	
	}
	public Hospital getById(int id) {
		return dao.getById(id);
	}
	public List<Hospital> getAll(){
		return dao.getAll();
	}
}
