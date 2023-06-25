package ma.cigma.funtravels.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.cigma.funtravels.exceptions.EquipementException;
import ma.cigma.funtravels.models.Equipement;
import ma.cigma.funtravels.repositories.EquipementRepository;

@Service
@Transactional
public class EquipementServiceImpl implements EquipementService {

	@Autowired
	private EquipementRepository equipementRepository;

	@Override
	public Equipement save(Equipement e) {
		try {
			return equipementRepository.save(e);
		} catch (Exception ex) {
			throw new EquipementException("Erreur de faire l'operation! l'equipement n'a pas enregistrer");
		}
	}

	@Override
	public Equipement findEquipement(Long id) {
		Equipement equipement = equipementRepository.findById(id).get();

		if (equipement == null) {
			throw new EquipementException("L'equipement avec id '"+id+"' n'existe pas!");
		}

		return equipement;
	}

	@Override
	public Iterable<Equipement> findAll() {

		return equipementRepository.findAll();
	}

	@Override
	public void deleteEquipement(Long id) {

		Equipement equipement = equipementRepository.findById(id).get();

		if (equipement == null) {
			throw new EquipementException("Erreur de faire l'operation car l'equipement avec id '"+id+"' n'existe pas!");
		}

		equipementRepository.delete(equipement);

	}

}
