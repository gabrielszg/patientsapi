package com.anlix.patients.patientsapi.models;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.anlix.patients.patientsapi.entities.Patient;
import com.anlix.patients.patientsapi.repositories.PatientRepository;

import lombok.AllArgsConstructor;

//Classe com todos os métodos para comunicação com a interface Web
//fazendo a ligação entre o back-end e o front-end
//busca os arquivos index.html e consult.html contidos na pasta templates
@Controller
@AllArgsConstructor
public class PatientModel {

	private PatientRepository patientRepository;
	
	@RequestMapping("/")
	public ModelAndView initial() {
		ModelAndView model = new ModelAndView("index");
		model.addObject("patientobj", new Patient());
		return model;
	}
	
	@PostMapping("/namepatient")
	public ModelAndView patientInformation(@RequestParam String nomepesquisa) {
		ModelAndView model = new ModelAndView("consult");
		model.addObject("patients", patientRepository.findPatientByName(nomepesquisa).get(0));
		return model;
	}
}