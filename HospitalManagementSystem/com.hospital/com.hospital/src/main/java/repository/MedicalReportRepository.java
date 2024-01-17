package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import model.MedicalReport;


public interface MedicalReportRepository extends JpaRepository<MedicalReport, Long>{
	//medical report og a particular patient
	MedicalReport findByPid(int id);

	MedicalReport findByReportId(long id);

	
	

	

}