package one.digital.innovation.personapi.mapper;

import one.digital.innovation.personapi.dto.request.PersonDTO;
import one.digital.innovation.personapi.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    //converte para Model
    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO personDTO);

    //Converte para DTO
    PersonDTO toDto(Person person);
}
