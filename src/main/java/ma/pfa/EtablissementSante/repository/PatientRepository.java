package ma.pfa.EtablissementSante.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ma.pfa.EtablissementSante.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer>{
	Patient findById(int id);
}
