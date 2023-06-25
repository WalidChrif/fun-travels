package ma.cigma.funtravels.services;

import ma.cigma.funtravels.models.Equipement;

public interface EquipementService {

	Equipement save(Equipement e);
	
	Equipement findEquipement(Long id);
	
	Iterable<Equipement> findAll();
	
	void deleteEquipement(Long id);
}
