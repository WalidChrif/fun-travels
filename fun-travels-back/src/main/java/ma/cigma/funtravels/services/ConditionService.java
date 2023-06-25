package ma.cigma.funtravels.services;

import ma.cigma.funtravels.models.Condition;

public interface ConditionService {

	Condition save(Condition c);
	
	Condition findCondition(Long id);
	
	Iterable<Condition> findAll();
	
	void deleteCondition(Long id);
}
