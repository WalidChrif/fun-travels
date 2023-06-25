package ma.cigma.funtravels.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ma.cigma.funtravels.models.Offre;

@Repository
public interface OffreRepository extends JpaRepository<Offre, Long> {

	@Query(value="SELECT * FROM offre order by rand() limit 6",nativeQuery = true)
	Iterable<Offre> getRandomOffres();
}
