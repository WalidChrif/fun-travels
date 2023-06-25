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

import ma.cigma.funtravels.models.Equipement;
import ma.cigma.funtravels.services.EquipementService;
import ma.cigma.funtravels.services.MapValidationErrorService;

@RestController
@RequestMapping("/api/equipements")
@CrossOrigin(origins = "http://localhost:4200")
public class EquipementController {

	@Autowired
	private EquipementService equipementService;

	@Autowired
	private MapValidationErrorService mapValidationErrorService;

	@PostMapping("")
	public ResponseEntity<?> saveEquipement(@Valid @RequestBody Equipement e, BindingResult result) {

		ResponseEntity<?> errorMap = mapValidationErrorService.mapValidationError(result);

		if (errorMap != null)
			return errorMap;

		equipementService.save(e);

		return new ResponseEntity<Equipement>(e, HttpStatus.OK);

	}

	@GetMapping("/{id}")
	public ResponseEntity<?> getEquipement(@PathVariable("id") Long id) {

		Equipement equipement = equipementService.findEquipement(id);
		
		return new ResponseEntity<Equipement>(equipement, HttpStatus.OK);

	}
	
	@GetMapping("/all")
	public Iterable<Equipement> getAllEquipements(){
		
		return equipementService.findAll();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteEquipement(@PathVariable("id") Long id) {

		equipementService.deleteEquipement(id);

		return new ResponseEntity<String>("Equipement avec id '"+id+"' est supprimé avec succés!", HttpStatus.OK);

	}

}
