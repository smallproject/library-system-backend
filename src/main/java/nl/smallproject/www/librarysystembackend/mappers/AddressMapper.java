package nl.smallproject.www.librarysystembackend.mappers;

import nl.smallproject.www.librarysystembackend.dtos.Address.AddressInputDto;
import nl.smallproject.www.librarysystembackend.dtos.Address.AddressOutputDto;
import nl.smallproject.www.librarysystembackend.models.Address;
import org.springframework.stereotype.Component;

@Component
public class AddressMapper {
    public AddressOutputDto addressEntityToOutputDto(Address address) {
        AddressOutputDto addressOutputDto = new AddressOutputDto();
        addressOutputDto.setId(address.getId());
        addressOutputDto.setStreet(address.getStreet());
        addressOutputDto.setHouseNo(address.getHouseNo());
        addressOutputDto.setPostCode(address.getPostCode());
        return addressOutputDto;
    }

    public Address addressInputDtoToEntity(AddressInputDto addressInputDto) {
        Address address = new Address();
        address.setId(addressInputDto.getId());
        address.setStreet(addressInputDto.getStreet());
        address.setHouseNo(addressInputDto.getHouseNo());
        address.setPostCode(addressInputDto.getPostCode());
        return address;
    }
}
