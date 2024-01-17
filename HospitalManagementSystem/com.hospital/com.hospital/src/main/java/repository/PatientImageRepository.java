package repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import model.PatientImage;

public interface PatientImageRepository extends JpaRepository<PatientImage, Long>{

	Optional<PatientImage> findByPid(int id);

	//void save(PatientImage img);
	//Optional<ImageModel> findByName(String name);

}