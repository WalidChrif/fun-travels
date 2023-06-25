package ma.cigma.funtravels.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.cigma.funtravels.models.Ville;
import ma.cigma.funtravels.services.VilleService;
import ma.cigma.funtravels.services.MapValidationErrorService;

@RestController
@RequestMapping("/api/villes")
@CrossOrigin(origins = "http://localhost:4200")
public class VilleController {

	@Autowired
	private VilleService villeService;
	
	@Autowired
	private MapValidationErrorService mapValidationErrorService;
	
	@PostMapping("/create")
	public ResponseEntity<?> create(@Valid @RequestBody Ville v, BindingResult result) {
		
		ResponseEntity<?> errorMap = mapValidationErrorService.mapValidationError(result);

		if (errorMap != null)
			return errorMap;
		villeService.save(v);
		
		return new ResponseEntity<Ville>(v, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getVille(@PathVariable("id") int id){
		Ville ville = villeService.findVille(id);
		
		return new ResponseEntity<Ville>(ville,HttpStatus.OK);
	}
	
	@GetMapping("/all")
	public Iterable<Ville> getAllVilles(){
		return villeService.findAll();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteVille(@PathVariable("id") int id){
		
		villeService.deleteVille(id);
		
		return new ResponseEntity<String>("Offre avec id '"+id+"' est supprimé avec succés!", HttpStatus.OK);
	}
	
	@GetMapping("/aleatoires")
	public Iterable<Ville> getRandomVilles(){
		return villeService.getRandomVilles();
	}

}
