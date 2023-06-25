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

import ma.cigma.funtravels.models.Reservation;
import ma.cigma.funtravels.services.MapValidationErrorService;
import ma.cigma.funtravels.services.ReservationService;

@RestController
@RequestMapping("/api/reservations")
@CrossOrigin(origins = "http://localhost:4200")
public class ReservationController {
	
	@Autowired
	private ReservationService ReservationService;
	
	@Autowired
	private MapValidationErrorService mapValidationErrorService;

	
	@PostMapping("")
	public ResponseEntity<?> createUtlisateur(@Valid @RequestBody Reservation Reservation, BindingResult result){
		
		ResponseEntity<?> errorMap = mapValidationErrorService.mapValidationError(result);

		if (errorMap != null)
			return errorMap;
		
		ReservationService.createOrUpdate(Reservation);
		
		return new ResponseEntity<Reservation>(Reservation, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getReservationByUsername(@PathVariable("id") Long id){
		
		Reservation Reservation= ReservationService.findReservation(id);
		
		return new ResponseEntity<Reservation>(Reservation, HttpStatus.OK);
	}
	
	@GetMapping("/all")
	public Iterable<Reservation> getAllReservations(){
		return ReservationService.findAll();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteReservation(@PathVariable("id") Long id){
		
		ReservationService.deleteReservation(id);
		
		return new ResponseEntity<String>("Reservation avec id '"+id+"' est supprimé avec succés!", HttpStatus.OK);
	}
	
	
	@GetMapping("/reservationsByOffre/{offreId}")
	public Iterable<Reservation> getReservationsByOffre(@PathVariable("offreId") Long offreId){
		
		return ReservationService.getReservationsByOffre(offreId);
	}

}
