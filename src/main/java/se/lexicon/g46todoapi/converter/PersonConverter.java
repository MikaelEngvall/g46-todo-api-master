package se.lexicon.g46todoapi.converter;

import org.springframework.stereotype.Repository;
import se.lexicon.todoapi.domain.dto.PersonDTOView;
import se.lexicon.todoapi.domain.entity.Person;

@Repository
public interface PersonConverter {

    PersonDTOView toPersonDTOView(Person entity);

    Person toPersonEntity(PersonDTOView dtoView);
}
