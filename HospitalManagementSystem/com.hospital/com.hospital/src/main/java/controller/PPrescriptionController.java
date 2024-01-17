package controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;

import model.MedicalReport;
import model.PPrescrption;
import model.Patient;
import repository.MedicalReportRepository;
import repository.PPrescription;
import repository.PPrescriptionRepository;

public class PPrescriptionController {

	@Autowired
	private PPrescriptionRepository pprescriptionRepository;
	
	@Autowired
	private MedicalReportRepository medicalreportRepository;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/report/{id}")
	   public List<PPrescrption> getMedicineDetailsById(@PathVariable int id){
		   
		   return pprescriptionRepository.findByPid1(id);
	   }
	
	//@CrossOrigin
	@GetMapping("/report2/{id}")
	   public List<PPrescrption> getMedicineDetailsById2(@PathVariable int id){
		   
		   return pprescriptionRepository.findByPid1AndStatus1(id,"Active");
	   }
	
	//patient medical report details
	//@CrossOrigin
	@GetMapping("/report1/{id}")
	   public MedicalReport getMedicineDetailsById1(@PathVariable int id){
		   
		   return medicalreportRepository.findByPid(id);
	   }
	
	@GetMapping("/report4/{id}")
	   public MedicalReport getMedicalReportById(@PathVariable long id){
		   
		   return medicalreportRepository.findByReportId(id);
	   }
	
	
	//create medical report
	@PutMapping("/createMedicalR/{id}")
	public MedicalReport createMedicalR(@PathVariable Long id,@RequestBody MedicalReport mr) {
		Long l= new Long(id);
		int i=l.intValue();
		
		mr.setPid(i);
		return medicalreportRepository.save(mr);
		
	}
	
	//add medicine details
		@PutMapping("/addMedicine/{id}")
		public PPrescrption addMedicineDetails(@PathVariable Long id,@RequestBody  PPrescrption pp) {
			Long l= new Long(id);
			int i=l.intValue();
			
			pp.setPid1(i);
			return pprescriptionRepository.save(pp);
			
		}
		
		//@CrossOrigin
		@PutMapping("/addMedicine1/{id}")
		public PPrescrption addMedicineDetails1(@PathVariable Long id,@RequestBody  PPrescrption pp) {
			Long l= new Long(id);
			int i=l.intValue();
			
			pp.setPid1(i);
			pp.setStatus1("Active");
			return pprescriptionRepository.save(pp);
			
		}
		
		//get record of single medines by passing patient id
		//@CrossOrigin
		@GetMapping("/getSMedicineD/{id}")
		public PPrescrption getEmployeeById(@PathVariable Long id) {
			//Long id=Long.parseLong(id1);
			PPrescrption pp=pprescriptionRepository.findByMedicineId(id);
			return pp;
		}
		
		//update employee by rest api
		//@CrossOrigin
		@PutMapping("/updateMedicineR/{id}")
		public ResponseEntity<PPrescrption> updateMedicineDetails(@PathVariable Long id,@RequestBody PPrescrption pp1){
			
			pp1.setMedicineId(id);	
			PPrescrption updateMedicineR=(PPrescrption) pprescriptionRepository.save(pp1);
			return ResponseEntity.ok(updateMedicineR);
			
		}
		
		@PutMapping("/updateMedicalReport/{id}")
		public ResponseEntity<MedicalReport> updateMedicalReport(@PathVariable Long id,@RequestBody MedicalReport mr){
			
			mr.setReportId(id);	
			MedicalReport updateMedicalR=medicalreportRepository.save(mr);
			return ResponseEntity.ok(updateMedicalR);
			
		}
		
		//@CrossOrigin
		@DeleteMapping("/DMedicineRecord/{id}")
		public ResponseEntity <Map<String, Boolean>> deleteRecord(@PathVariable Long id){
			PPrescrption pp = pprescriptionRepository.findByMedicineId(id);
					
			pprescriptionRepository.delete(pp);
			Map<String,Boolean> response = new HashMap<>();
			response.put("deleted", Boolean.TRUE);
			return ResponseEntity.ok(response);
		}
		
		//@CrossOrigin
		@PutMapping("/DMedicineRecord1/{id}/{id1}")
		public ResponseEntity<PPrescrption> deleteRecord1(@PathVariable Long id,@PathVariable Long id1,@RequestBody PPrescrption pp1){
			PPrescrption pp=pprescriptionRepository.findByMedicineId(id);
			Long l= new Long(id1);
			int i=l.intValue();
			pp1.setMedicineId(id);	
			pp.setStatus1("InActive");
			pp.setPid1(i);
			PPrescrption updateMedicineR=pprescriptionRepository.save(pp);
			return ResponseEntity.ok(updateMedicineR);
			
		}
		
		

	
	
	
	

}
	
	
