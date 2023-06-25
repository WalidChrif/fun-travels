package ma.cigma.funtravels.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.cigma.funtravels.exceptions.VilleException;
import ma.cigma.funtravels.models.Ville;
import ma.cigma.funtravels.repositories.VilleRepository;

@Service
@Transactional
public class VilleServiceImpl implements VilleService {
	
	@Autowired
	private VilleRepository villeRepository;

	@Override
	public Ville save(Ville c) {
		try {
			return villeRepository.save(c);
		} catch (Exception e) {
			throw new VilleException("Erreur de faire l'operation! la Ville n'a pas enregistrer");
		}
	}

	@Override
	public Ville findVille(Integer id) {
		Ville ville = villeRepository.findById(id).get();

		if (ville == null)
			throw new VilleException("La Ville avec id '"+id+"' n'existe pas!");

		return ville;
	}

	@Override
	public Iterable<Ville> findAll() {
		
		return villeRepository.findAll();
	}

	@Override
	public void deleteVille(Integer id) {
		Ville ville = villeRepository.findById(id).get();

		if (ville == null)
			throw new VilleException("Erreur de faire l'operation car la Ville avec id '"+id+"' n'existe pas!");

		villeRepository.delete(ville);

	}

	@Override
	public Iterable<Ville> getRandomVilles() {
		
		return villeRepository.getRandomVilles();
	}

}
