package ma.cigma.funtravels.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.cigma.funtravels.exceptions.UtilisateurUsernameException;
import ma.cigma.funtravels.models.Utilisateur;
import ma.cigma.funtravels.repositories.UtilisateurRepository;

@Service
@Transactional
public class UtilisateurServiceImpl implements UtilisateurService {

	@Autowired
	private UtilisateurRepository utilisateurRepository;

	@Override
	public Utilisateur createOrUpdate(Utilisateur u) {
		try {
			return utilisateurRepository.save(u);

		} catch (Exception e) {
			throw new UtilisateurUsernameException("Utilisateur '" + u.getUsername() + "' est déja existe!");
		}
	}

	@Override
	public Utilisateur findUtilisateurByUsername(String username) {

		Utilisateur utilisateur = utilisateurRepository.findByUsername(username);

		if (utilisateur == null) {

			throw new UtilisateurUsernameException("Utilisateur '" + username + "' n'existe pas!");
		}

		return utilisateur;
	}

	@Override
	public Iterable<Utilisateur> findAll() {

		return utilisateurRepository.findAll();
	}

	@Override
	public void deleteUtilisateur(String username) {

		Utilisateur utilisateur = utilisateurRepository.findByUsername(username);

		if (utilisateur == null) {
			throw new UtilisateurUsernameException(
					"On peut pas supprimé l'utilisateur '" + username + "' car il n'existe pas!");
		}

		utilisateurRepository.delete(utilisateur);
	}

}
