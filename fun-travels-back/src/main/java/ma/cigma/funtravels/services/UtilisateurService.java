package ma.cigma.funtravels.services;


import ma.cigma.funtravels.models.Utilisateur;

public interface UtilisateurService {
	
	Utilisateur createOrUpdate(Utilisateur u);
	
	Utilisateur findUtilisateurByUsername(String username);
	
	Iterable<Utilisateur> findAll();
	
	void deleteUtilisateur(String username);
}
