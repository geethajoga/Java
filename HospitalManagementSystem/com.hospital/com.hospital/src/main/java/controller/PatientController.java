package controller;

import java.util.List;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpSession;
import model.AppointmentRecord;
import model.Doctor;
import model.Patient;
import model.Receptionist;
import repository.AppointmentRecordRepository;
import repository.DoctorRepository;
import repository.PatientRepository;
import repository.ReceptionistRepository;


@CrossOrigin(origins = "*", allowedHeaders = "*")
//@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/MediTrackProject/")

public class PatientController {
	
	
	@Autowired
	private PatientRepository patientRepository;
	
	@Autowired
	private AppointmentRecordRepository appointmentrecordRepository;
	
	@Autowired
	private DoctorRepository doctorrepository;
	
	@Autowired
	private ReceptionistRepository receptionistrepository; 
	
		//registration of patients
		@CrossOrigin(origins = "http://localhost:4200")
		@PostMapping("/PatientDetails")
		public Patient createPatient(@RequestBody Patient patient) {
			return patientRepository.save(patient);
			
		}
		
		//patient login
		@PostMapping("/login")
		@ResponseBody
		public Patient patientLogin(@RequestBody Patient p,HttpSession Session)
		{
			Patient dt=patientRepository.findByEmailIdAndPassword(p.getEmailId(),p.getPassword() );
			if(Objects.nonNull(dt)) 
			{
				p.setAadharNo("success");
				
				return dt;
			}
			else 
			{
				p.setAadharNo("fail");
				return p;
			}
		}
		
			@PutMapping("/reqForAppointment/{id}")
			public AppointmentRecord reqForAppointments(@PathVariable Long id,@RequestBody AppointmentRecord ar) {
			
				ar.setAppointmentStatus("Requested");
			ar.setPatientId(id);
			return appointmentrecordRepository.save(ar);
			
		}
			
			@GetMapping("/doctorDetails")
			public List<Doctor> getAllDoctors(){
				return doctorrepository.findAll();
			}
			

			@GetMapping("/receptionistDetails")
			public List<Receptionist> getAllReceptionist(){
				return receptionistrepository.findAll();
			}
		
			@GetMapping("/getPatientById/{id}")
			   public Patient getPatientById(@PathVariable long id){
				   
				   return patientRepository.findByPid2(id);
			   }

}


