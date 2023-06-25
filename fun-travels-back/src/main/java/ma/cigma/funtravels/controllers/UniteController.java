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

import ma.cigma.funtravels.models.Unite;
import ma.cigma.funtravels.services.MapValidationErrorService;
import ma.cigma.funtravels.services.UniteService;

@RestController
@RequestMapping("/api/unites")
@CrossOrigin(origins = "http://localhost:4200")
public class UniteController {

	@Autowired
	private UniteService uniteService;
	
	@Autowired
	private MapValidationErrorService mapValidationErrorService;

	
	@PostMapping("")
	public ResponseEntity<?> createUtlisateur(@Valid @RequestBody Unite unite, BindingResult result){
		
		ResponseEntity<?> errorMap = mapValidationErrorService.mapValidationError(result);

		if (errorMap != null)
			return errorMap;
		
		uniteService.createOrUpdate(unite);
		
		return new ResponseEntity<Unite>(unite, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getUniteById(@PathVariable("id") Long id){
		
		Unite unite= uniteService.findUnite(id);
		
		return new ResponseEntity<Unite>(unite, HttpStatus.OK);
	}
	
	@GetMapping("/all")
	public Iterable<Unite> getAllUnites(){
		return uniteService.findAll();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteUnite(@PathVariable("id") Long id){
		
		uniteService.deleteUnite(id);
		
		return new ResponseEntity<String>("Unite avec id '"+id+"' est supprimé avec succés!", HttpStatus.OK);
	}

}
