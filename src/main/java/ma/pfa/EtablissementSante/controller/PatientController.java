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
import ma.pfa.EtablissementSante.entity.Patient;
import ma.pfa.EtablissementSante.repository.PatientRepository;

@RestController
@RequestMapping(value="patients")
@CrossOrigin(origins = "http://localhost:4200")
public class PatientController {
	@Autowired
	private PatientRepository patientRepository;
	
	@PostMapping("/save")
	private void savePatient(@RequestBody Patient Patient) {
		patientRepository.save(Patient);
		
	}
	
	@DeleteMapping("/delete/{id}")
	private void deletePatient(@PathVariable int id) {
		patientRepository.delete(patientRepository.findById(id));
	}
	
	@GetMapping("/all")
	private List<Patient> listPatient(){
		return patientRepository.findAll();
	}
	
	@GetMapping("/findById/{id}")
	public Patient findPatientById(@PathVariable int id)  {
		return patientRepository.findById(id);
		
	}
	
	@PatchMapping("/update/{id}")
	public void update(@RequestBody  Patient patient,@PathVariable int id ) {
		patientRepository.save(patient);
	}
	
	
	

}
