package ma.cigma.funtravels.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.cigma.funtravels.models.Equipement;

@Repository
public interface EquipementRepository extends JpaRepository<Equipement,	Long>{

}
