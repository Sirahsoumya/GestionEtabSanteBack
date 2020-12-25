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
import ma.pfa.EtablissementSante.entity.Hopital;
import ma.pfa.EtablissementSante.repository.HopitalRepository;



@RestController
@RequestMapping(value="hopitaux")
@CrossOrigin(origins = "http://localhost:4200")
public class HopitalController {
	@Autowired
	private HopitalRepository hopitalRepository;
	
	@PostMapping("/save")
	private void saveHopital(@RequestBody Hopital hopital) {
		hopitalRepository.save(hopital);
		
	}
	
	@DeleteMapping("/delete/{id}")
	private void deleteHopital(@PathVariable int id) {
		System.out.println("delete back");
		hopitalRepository.delete(hopitalRepository.findById(id));
	}
	
	@GetMapping("/all")
	private List<Hopital> listHopital(){
		return hopitalRepository.findAll();
	}
	
	@GetMapping("/findById/{id}")
	public Hopital findHopitalById(@PathVariable int id)  {
		return hopitalRepository.findById(id);
		
	}
	
	@PatchMapping("/update/{id}")
	public void update(@RequestBody  Hopital hopital,@PathVariable int id ) {
		hopitalRepository.save(hopital);
	
	
	}
	

}
