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

import ma.cigma.funtravels.models.Condition;
import ma.cigma.funtravels.services.ConditionService;
import ma.cigma.funtravels.services.MapValidationErrorService;

@RestController
@RequestMapping("/api/conditions")
@CrossOrigin(origins = "http://localhost:4200")
public class ConditionController {
	
	@Autowired
	private ConditionService conditionService;
	
	@Autowired
	private MapValidationErrorService mapValidationErrorService;
	
	@PostMapping("/create")
	public ResponseEntity<?> create(@Valid @RequestBody Condition c, BindingResult result) {
		
		ResponseEntity<?> errorMap = mapValidationErrorService.mapValidationError(result);

		if (errorMap != null)
			return errorMap;
		conditionService.save(c);
		
		return new ResponseEntity<Condition>(c,HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getCondition(@PathVariable("id") Long id){
		Condition condition = conditionService.findCondition(id);
		
		return new ResponseEntity<Condition>(condition,HttpStatus.OK);
	}
	
	@GetMapping("/all")
	public Iterable<Condition> getAllConditions(){
		return conditionService.findAll();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteCondition(@PathVariable("id") Long id){
		
		conditionService.deleteCondition(id);
		
		return new ResponseEntity<String>("Offre avec id '"+id+"' est supprimé avec succés!", HttpStatus.OK);
	}

}
