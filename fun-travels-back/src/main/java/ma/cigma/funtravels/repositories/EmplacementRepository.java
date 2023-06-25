package ma.cigma.funtravels.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ma.cigma.funtravels.models.Emplacement;

@Repository
public interface EmplacementRepository extends JpaRepository<Emplacement, Long> {

	@Query(value="SELECT Count(*) FROM emplacement WHERE ville_id= ?1",nativeQuery = true)
	Integer nb_placesByVilleId(Integer id);
}
