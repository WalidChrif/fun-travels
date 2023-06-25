package ma.cigma.funtravels.services;

import ma.cigma.funtravels.models.Reservation;

public interface ReservationService {

	Reservation createOrUpdate(Reservation r);

	Reservation findReservation(Long id);
	
	Iterable<Reservation> findAll();
	
	void deleteReservation(Long id);
	
	Iterable<Reservation> getReservationsByOffre(Long id);
}
