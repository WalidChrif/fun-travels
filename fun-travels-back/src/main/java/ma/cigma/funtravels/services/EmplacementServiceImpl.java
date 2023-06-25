package ma.cigma.funtravels.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.cigma.funtravels.exceptions.EmplacementException;
import ma.cigma.funtravels.models.Emplacement;
import ma.cigma.funtravels.repositories.EmplacementRepository;

@Service
@Transactional
public class EmplacementServiceImpl implements EmplacementService {

	@Autowired
	private EmplacementRepository emplacementRepository;

	@Override
	public Emplacement save(Emplacement c) {
		try {
			return emplacementRepository.save(c);
		} catch (Exception e) {
			throw new EmplacementException("Erreur de faire l'operation! l'Emplacement n'a pas enregistrer");
		}
	}

	@Override
	public Emplacement findEmplacement(Long id) {
		Emplacement emplacement = emplacementRepository.findById(id).get();

		if (emplacement == null) {
			throw new EmplacementException("L'Emplacement avec id '"+id+"' n'existe pas!");
		}

		return emplacement;
	}

	@Override
	public Iterable<Emplacement> findAll() {

		return emplacementRepository.findAll();
	}

	@Override
	public void deleteEmplacement(Long id) {
		Emplacement emplacement = emplacementRepository.findById(id).get();

		if (emplacement == null) {
			throw new EmplacementException("Erreur de faire l'operation car l'Emplacement avec id '"+id+"' n'existe pas!");
		}

		emplacementRepository.delete(emplacement);

	}

	@Override
	public Integer nb_placesBuVilleId(int ville_id) {
		
		return emplacementRepository.nb_placesByVilleId(ville_id);
	}

}
