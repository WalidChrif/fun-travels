package ma.cigma.funtravels.services;

import ma.cigma.funtravels.models.Offre;

public interface OffreService {

	Offre createOrUpdate(Offre o);

	Offre findOffre(Long id);

	Iterable<Offre> findAll();

	void deleteOffre(Long id);
	
	Iterable<Offre> getRandomOffres();
}
