package ma.cigma.funtravels.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ma.cigma.funtravels.models.Ville;

@Repository
public interface VilleRepository extends JpaRepository<Ville, Integer>{

	@Query(value="SELECT * FROM ville order by rand() limit 6",nativeQuery = true)
	Iterable<Ville> getRandomVilles();
}
