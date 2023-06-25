package ma.cigma.funtravels.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.cigma.funtravels.models.Image;

@Repository
public interface ImageRepository extends JpaRepository<Image, Long>{

}
