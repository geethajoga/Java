package controller;

import java.util.Objects;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpSession;
import model.Admin;
import model.Doctor;
import model.Receptionist;
import repository.AdminRepository;
import repository.DoctorRepository;
import repository.ReceptionistRepository;

@CrossOrigin(origins="*",allowedHeaders = "*")
@RestController
@RequestMapping("/hms")
public class AdDrRecepController {
	
	@Autowired
	private DoctorRepository doctorrepository;
	
	@Autowired
	private ReceptionistRepository receptionistrepository; 
	
	@Autowired
	private AdminRepository adminRepository;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping(value ="/LoginAdminPage",produces="application/json")
	@ResponseBody
	public Admin adminLogin(@RequestBody Admin admin,HttpSession Session) {
		System.out.println(admin.getAdminName());
		System.out.println(admin.getPassword());
		Admin dt=adminRepository.findByAdminNameAndPassword(admin.getAdminName(),admin.getPassword() );
		System.out.println(dt);
		if(Objects.nonNull(dt)) 
		{
			admin.setAdminName("Success");
			return dt;
			
		}
		else 
		{
			admin.setEmailId("fail");
			return dt;
		}	
	}
	
	@PostMapping("/registerdoctor")
	public Doctor createDoctor(@RequestBody Doctor doctor) {
		return doctorrepository.save(doctor);
	}

	@PostMapping("/receptionist")
	public Receptionist createReceptionist(@RequestBody Receptionist receptionist) {
		System.out.println("Success");
		return receptionistrepository.save(receptionist);
	}
}