package ma.pfa.EtablissementSante.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ma.pfa.EtablissementSante.entity.Medecin;
import ma.pfa.EtablissementSante.repository.MedecinRepository;


@RestController
@RequestMapping(value="medecins")
@CrossOrigin(origins = "http://localhost:4200")
public class MedecinController {
	@Autowired
	private MedecinRepository medecinRepository;
	
	@PostMapping("/save")
	private void saveMedecin(@RequestBody Medecin medecin) {
		medecinRepository.save(medecin);
		
	}
	
	@DeleteMapping("/delete/{id}")
	private void deleteMedecin(@PathVariable int id) {
		medecinRepository.delete(medecinRepository.findById(id));
	}
	
	@GetMapping("/all")
	private List<Medecin> listMedecin(){
		return medecinRepository.findAll();
	}
	
	@GetMapping("/findById/{id}")
	public Medecin findMedecinById(@PathVariable int id)  {
		return medecinRepository.findById(id);
		
	}
	
	@PatchMapping("/update/{id}")
	public void update(@RequestBody  Medecin medecin,@PathVariable int id ) {
		medecinRepository.save(medecin);
	
	
	}
	
}
