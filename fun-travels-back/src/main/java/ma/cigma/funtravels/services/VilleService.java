package ma.cigma.funtravels.services;

import ma.cigma.funtravels.models.Ville;

public interface VilleService {

	Ville save(Ville c);

	Ville findVille(Integer id);

	Iterable<Ville> findAll();

	void deleteVille(Integer id);
	
	Iterable<Ville> getRandomVilles();
}
