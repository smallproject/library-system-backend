package nl.smallproject.www.librarysystembackend.controllers;

import jakarta.validation.Valid;
import nl.smallproject.www.librarysystembackend.dtos.Reservation.ReservationInputDto;
import nl.smallproject.www.librarysystembackend.dtos.Reservation.ReservationOutputDto;
import nl.smallproject.www.librarysystembackend.dtos.Reservation.ReservationUpdateDto;
import nl.smallproject.www.librarysystembackend.services.ReservationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/v1/reservations")
@CrossOrigin
public class ReservationsController {
    private final ReservationService reservationService;


    public ReservationsController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<ReservationOutputDto>> getAllReservations() {
        List<ReservationOutputDto> reservationOutputDtos = reservationService.getAllReservations();
        return ResponseEntity.ok(reservationOutputDtos);
    }

    @RequestMapping(value ="{id}", method = RequestMethod.GET)
    public ResponseEntity<ReservationOutputDto> getReservationById(@PathVariable long id) {
        ReservationOutputDto reservationOutputDto = reservationService.getReservationById(id);
        return ResponseEntity.ok(reservationOutputDto);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Object> createReservation(@Valid @RequestBody ReservationInputDto reservationInputDto) {
        var newReservation = reservationService.createReservation(reservationInputDto);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/" + newReservation.getId())
                .buildAndExpand(newReservation)
                .toUri();

        return ResponseEntity.created(location).eTag(String.valueOf(HttpStatus.CREATED)).body(newReservation);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public ResponseEntity<Object> updateReservation(@PathVariable Long id, @Valid @RequestBody final ReservationUpdateDto reservationUpdateDto) {
        reservationService.updateReservation(id, reservationUpdateDto);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> deleteReservation(@PathVariable Long id) {
        reservationService.deleteReservation(id);
        return ResponseEntity.noContent().build();
    }
}
