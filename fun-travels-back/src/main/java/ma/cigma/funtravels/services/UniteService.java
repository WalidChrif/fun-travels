package ma.cigma.funtravels.services;

import ma.cigma.funtravels.models.Unite;

public interface UniteService {

	Unite createOrUpdate(Unite u);

	Unite findUnite(Long id);

	Iterable<Unite> findAll();

	void deleteUnite(Long id);
}
