package ma.cigma.funtravels.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.cigma.funtravels.exceptions.OffreException;
import ma.cigma.funtravels.models.Offre;
import ma.cigma.funtravels.repositories.OffreRepository;

@Service
@Transactional
public class OffreServiceImpl implements OffreService {

	@Autowired
	private OffreRepository offreRepository;

	@Override
	public Offre createOrUpdate(Offre o) {
		try {
			return offreRepository.save(o);
		} catch (Exception e) {
			throw new OffreException("Erreur de faire l'operation! l'offre n'a pas enregistrer");
		}
	}

	@Override
	public Offre findOffre(Long id) {
		Offre offre = offreRepository.findById(id).get();
		if (offre == null) {
			throw new OffreException("L'offre avec id '"+id+"' n'existe pas!");
		}
		return offre;
	}

	@Override
	public Iterable<Offre> findAll() {

		return offreRepository.findAll();
	}

	@Override
	public void deleteOffre(Long id) {
		Offre offre = offreRepository.findById(id).get();
		if (offre == null) {
			throw new OffreException("Erreur de faire l'operation car l'offre avec id '"+id+"' n'existe pas!");
		}
		offreRepository.delete(offre);
	}

	@Override
	public Iterable<Offre> getRandomOffres() {
		
		return offreRepository.getRandomOffres();
	}

}
