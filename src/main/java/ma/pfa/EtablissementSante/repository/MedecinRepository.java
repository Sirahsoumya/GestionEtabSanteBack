package ma.pfa.EtablissementSante.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ma.pfa.EtablissementSante.entity.Medecin;

@Repository
public interface MedecinRepository extends JpaRepository<Medecin, Integer> {
	Medecin findById(int id);


}
