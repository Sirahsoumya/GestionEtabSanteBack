package ma.pfa.EtablissementSante.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.pfa.EtablissementSante.entity.Hopital;

@Repository
public interface HopitalRepository extends JpaRepository<Hopital,Integer> {
	Hopital findById(int id);


}
