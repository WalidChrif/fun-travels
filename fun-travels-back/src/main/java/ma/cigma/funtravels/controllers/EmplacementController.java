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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ma.cigma.funtravels.models.Emplacement;
import ma.cigma.funtravels.services.EmplacementService;
import ma.cigma.funtravels.services.MapValidationErrorService;

@RestController
@RequestMapping("/api/emplacements")
@CrossOrigin(origins = "http://localhost:4200")
public class EmplacementController {

	@Autowired
	private EmplacementService emplacementService;
	
	@Autowired
	private MapValidationErrorService mapValidationErrorService;
	
	@PostMapping("")
	public ResponseEntity<?> saveEmplacement(@Valid @RequestBody Emplacement e, BindingResult result){
		
		ResponseEntity<?> errorMap = mapValidationErrorService.mapValidationError(result);

		if (errorMap != null)
			return errorMap;
		
		emplacementService.save(e);
		
		return new ResponseEntity<Emplacement>(e, HttpStatus.OK);
		
	} 
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getEmplacement(@PathVariable("id") Long id) {

		Emplacement emplacement = emplacementService.findEmplacement(id);
		
		return new ResponseEntity<Emplacement>(emplacement, HttpStatus.OK);

	}
	
	@GetMapping("/all")
	public Iterable<Emplacement> getAllEmplacements(){
		
		return emplacementService.findAll();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteEmplacement(@PathVariable("id") Long id) {

		emplacementService.deleteEmplacement(id);
		
		return new ResponseEntity<String>("Emplacement avec id '"+id+"' est supprimé avec succés!", HttpStatus.OK);

	}
	
	@GetMapping(value = "/nb_places", params = "ville_id")
	public Integer nb_placesByVilleId(@RequestParam("ville_id") int ville_id) {
		
		int nb_places = emplacementService.nb_placesBuVilleId(ville_id);
		
		return nb_places;
	}

}
