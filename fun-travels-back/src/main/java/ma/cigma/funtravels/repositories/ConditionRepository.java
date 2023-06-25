package ma.cigma.funtravels.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.cigma.funtravels.models.Condition;

@Repository
public interface ConditionRepository extends JpaRepository<Condition, Long> {

}
