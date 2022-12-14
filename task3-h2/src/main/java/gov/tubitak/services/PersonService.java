package gov.tubitak.services;

import gov.tubitak.dto.PersonDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;

public interface PersonService {
    PersonDto save(PersonDto personDto);
    void deleteById(Long id);

    PersonDto update(Long id, PersonDto updatedPerson);
    List<PersonDto> getAll();
    Page<PersonDto> getAll(Pageable pageable);

    PersonDto getById(Long id);
}
