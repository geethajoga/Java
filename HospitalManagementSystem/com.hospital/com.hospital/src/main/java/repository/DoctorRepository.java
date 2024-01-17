package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long>{

	List<Doctor> findAll();

	Doctor findByDoctorId(long doctorId);

}