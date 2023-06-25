package ma.cigma.funtravels.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.cigma.funtravels.exceptions.UniteException;
import ma.cigma.funtravels.models.Unite;
import ma.cigma.funtravels.repositories.UniteRepository;

@Service
@Transactional
public class UniteServiceImpl implements UniteService {

	@Autowired
	private UniteRepository UniteRepository;

	@Override
	public Unite createOrUpdate(Unite u) {
		try {
			return UniteRepository.save(u);
		} catch (Exception e) {
			throw new UniteException("Erreur de faire l'operation! l'Unite n'a pas enregistrer");
		}
	}

	@Override
	public Unite findUnite(Long id) {
		Unite Unite = UniteRepository.findById(id).get();
		if (Unite == null) {
			throw new UniteException("L'Unite avec id '" + id + "' n'existe pas!");
		}
		return Unite;
	}

	@Override
	public Iterable<Unite> findAll() {

		return UniteRepository.findAll();
	}

	@Override
	public void deleteUnite(Long id) {
		Unite Unite = UniteRepository.findById(id).get();
		if (Unite == null) {
			throw new UniteException("Erreur de faire l'operation car l'Unite avec id '" + id + "' n'existe pas!");
		}
		UniteRepository.delete(Unite);
	}

}
