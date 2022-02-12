package com.anlix.patients.patientsapi.models;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.anlix.patients.patientsapi.entities.Patient;
import com.anlix.patients.patientsapi.repositories.PatientRepository;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class PatientModel {

	private PatientRepository patientRepository;
	
	@RequestMapping("/patients")
	public ModelAndView listPatients() {
		ModelAndView model = new ModelAndView("index");
		Iterable<Patient> patients = patientRepository.findAll();
		model.addObject("patients", patients);
		return model;
	}
	
	@PostMapping("/patients")
	public ModelAndView patientInformation(@RequestParam("nomepesquisa") String nomepesquisa) {
		ModelAndView model = new ModelAndView("index");
		model.addObject("patients", patientRepository.findPatientByName(nomepesquisa));
		return model;
	}
}