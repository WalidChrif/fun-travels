package ma.cigma.funtravels.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.cigma.funtravels.models.Offre;
import ma.cigma.funtravels.models.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long>{

	Iterable<Reservation> findByOffre(Offre offre);
}
