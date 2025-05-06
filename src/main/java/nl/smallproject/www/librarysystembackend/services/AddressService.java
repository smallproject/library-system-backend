package nl.smallproject.www.librarysystembackend.services;

import jakarta.transaction.Transactional;
import nl.smallproject.www.librarysystembackend.dtos.Address.AddressInputDto;
import nl.smallproject.www.librarysystembackend.dtos.Address.AddressOutputDto;
import nl.smallproject.www.librarysystembackend.exceptions.RecordNotFoundException;
import nl.smallproject.www.librarysystembackend.mappers.AddressMapper;
import nl.smallproject.www.librarysystembackend.models.Address;
import nl.smallproject.www.librarysystembackend.repositories.AddressRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    private final AddressRepository addressRepository;
    private final AddressMapper addressMapper;

    public AddressService(AddressRepository addressRepository, AddressMapper addressMapper) {
        this.addressRepository = addressRepository;
        this.addressMapper = addressMapper;
    }

    public List<AddressOutputDto> getAllAddresses() {
        List<Address> addresses = addressRepository.findAll();
        List<AddressOutputDto> addressOutputDtos = new ArrayList<>();
        for (Address address : addresses) {
            addressOutputDtos.add(addressMapper.addressEntityToOutputDto(address));
        }
        return addressOutputDtos;
    }

    public AddressOutputDto getAddressById(Long id) {
        Optional<Address> addressOptional = Optional.ofNullable(addressRepository.findById(id)
                .orElseThrow(() -> new RecordNotFoundException("Address not found with this id: " + id)));

        if (addressOptional.isPresent()) {
            Address address = addressOptional.get();
            return addressMapper.addressEntityToOutputDto(address);
        } else {
            throw new RecordNotFoundException("Address not found with this id: " + id);
        }
    }

    @Transactional
    public Address createAddress(AddressInputDto addressInputDto) {
        Address address = addressMapper.addressInputDtoToEntity(addressInputDto);
        addressRepository.save(address);
        return address;
    }
}
