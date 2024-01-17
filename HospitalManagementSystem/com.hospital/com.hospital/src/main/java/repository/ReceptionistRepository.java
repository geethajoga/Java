package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Receptionist;

public interface ReceptionistRepository extends JpaRepository<Receptionist, Long> {

	List<Receptionist> findAll();

	Receptionist findByReceptionistId(Long id);

	Receptionist findByEmailAdressAndPassword(String emailAdress, String password);

	Receptionist findByEmailAdress(String emailAdress);

}