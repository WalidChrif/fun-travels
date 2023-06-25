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

import ma.cigma.funtravels.models.Utilisateur;
import ma.cigma.funtravels.services.MapValidationErrorService;
import ma.cigma.funtravels.services.UtilisateurService;

@RestController
@RequestMapping("/api/utilisateurs")
@CrossOrigin(origins = "http://localhost:4200")
public class UtilisateurController {

	@Autowired
	private UtilisateurService utilisateurService;
	
	@Autowired
	private MapValidationErrorService mapValidationErrorService;

	
	@PostMapping("")
	public ResponseEntity<?> createUtlisateur(@Valid @RequestBody Utilisateur utilisateur, BindingResult result){
		
		ResponseEntity<?> errorMap = mapValidationErrorService.mapValidationError(result);

		if (errorMap != null)
			return errorMap;
		
		utilisateurService.createOrUpdate(utilisateur);
		
		return new ResponseEntity<Utilisateur>(utilisateur, HttpStatus.OK);
	}
	
	@GetMapping("/{username}")
	public ResponseEntity<?> getUtilisateurByUsername(@PathVariable("username") String username){
		
		Utilisateur utilisateur= utilisateurService.findUtilisateurByUsername(username);
		
		return new ResponseEntity<Utilisateur>(utilisateur, HttpStatus.OK);
	}
	
	@GetMapping("/all")
	public Iterable<Utilisateur> getAllUtilisateurs(){
		return utilisateurService.findAll();
	}
	
	@DeleteMapping("/{username}")
	public ResponseEntity<?> deleteUtilisateur(@PathVariable("username") String username){
		
		utilisateurService.deleteUtilisateur(username);
		
		return new ResponseEntity<String>("Utilisateur '"+username+"' est supprimé avec succés!", HttpStatus.OK);
	}
	
}
