package controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import repository.DoctorRepository;

@CrossOrigin(origins="*",allowedHeaders = "*")
@RestController
@RequestMapping("/MediTrackProject1")

public class DoctorController {
	
	@Autowired
	private DoctorRepository doctorRepository;
	
	@CrossOrigin(origins = "http://localhost:3300")
	
	@GetMapping("/getdoctors")
	public List<model.Doctor> getAllDoctors() {
		return doctorRepository.findAll();
	}
	

}
