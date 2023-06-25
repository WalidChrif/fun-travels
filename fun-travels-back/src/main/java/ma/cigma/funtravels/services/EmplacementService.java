package ma.cigma.funtravels.services;

import ma.cigma.funtravels.models.Emplacement;

public interface EmplacementService {

Emplacement save(Emplacement c);
	
	Emplacement findEmplacement(Long id);
	
	Iterable<Emplacement> findAll();
	
	void deleteEmplacement(Long id);
	
	Integer nb_placesBuVilleId(int ville_id);
}
