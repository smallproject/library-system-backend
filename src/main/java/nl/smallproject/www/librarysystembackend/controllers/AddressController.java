package nl.smallproject.www.librarysystembackend.controllers;

import jakarta.validation.Valid;
import nl.smallproject.www.librarysystembackend.dtos.Address.AddressInputDto;
import nl.smallproject.www.librarysystembackend.dtos.Address.AddressOutputDto;
import nl.smallproject.www.librarysystembackend.services.AddressService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/addresses")
public class AddressController {
    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<AddressOutputDto>> getAllAddresses() {
        List<AddressOutputDto> addressOutputDtos = addressService.getAllAddresses();
        return ResponseEntity.ok(addressOutputDtos);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public ResponseEntity<AddressOutputDto> getAddressById(@PathVariable Long id) {
        AddressOutputDto addressOutputDto = addressService.getAddressById(id);
        return ResponseEntity.ok(addressOutputDto);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Object> createAddress(@Valid @RequestBody final AddressInputDto addressInputDto) {
        var newAddress = addressService.createAddress(addressInputDto);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/" + newAddress.getId())
                .buildAndExpand(newAddress)
                .toUri();

        return ResponseEntity.created(location).eTag(String.valueOf(HttpStatus.CREATED)).body(newAddress);
    }
}
