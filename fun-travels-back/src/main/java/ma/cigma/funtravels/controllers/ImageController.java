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

import ma.cigma.funtravels.models.Image;
import ma.cigma.funtravels.services.ImageService;
import ma.cigma.funtravels.services.MapValidationErrorService;

@RestController
@RequestMapping("/api/images")
@CrossOrigin(origins = "http://localhost:4200")
public class ImageController {

	@Autowired
	private ImageService imageService;

	@Autowired
	private MapValidationErrorService mapValidationErrorService;

	@PostMapping("")
	public ResponseEntity<?> saveImage(@Valid @RequestBody Image i, BindingResult result) {

		ResponseEntity<?> errorMap = mapValidationErrorService.mapValidationError(result);

		if (errorMap != null)
			return errorMap;

		imageService.save(i);

		return new ResponseEntity<Image>(i, HttpStatus.OK);

	}

	@GetMapping("/{id}")
	public ResponseEntity<?> getImage(@PathVariable("id") Long id) {

		Image image = imageService.findImage(id);

		// handle exception
		if (image == null)
			throw new RuntimeException();
		
		return new ResponseEntity<Image>(image, HttpStatus.OK);

	}
	
	@GetMapping("/all")
	public Iterable<Image> getAllImages(){
		
		return imageService.findAll();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteImage(@PathVariable("id") Long id) {

		imageService.deleteImage(id);

		
		return new ResponseEntity<String>("Image avec id '"+id+"' est supprimé avec succés!", HttpStatus.OK);

	}

}
