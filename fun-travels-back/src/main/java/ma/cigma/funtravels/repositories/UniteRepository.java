package ma.cigma.funtravels.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.cigma.funtravels.models.Unite;

@Repository
public interface UniteRepository extends JpaRepository<Unite, Long> {

}
