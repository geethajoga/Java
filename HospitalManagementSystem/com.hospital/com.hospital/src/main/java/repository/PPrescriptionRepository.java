package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.PPrescrption;


@Repository
public interface PPrescriptionRepository extends JpaRepository<PPrescription, Long>{

	
	//get medicine details
	List<PPrescrption> findByPid1(int id);

	PPrescrption findByMedicineId(Long id);

	List<PPrescrption> findByPid1AndStatus1(int id, String string);

	PPrescrption save(PPrescrption pp);

	void delete(PPrescrption pp);

	

	

	

	


}