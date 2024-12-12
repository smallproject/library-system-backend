package nl.smallproject.www.librarysystembackend.mappers;

import nl.smallproject.www.librarysystembackend.dtos.Reservation.ReservationInputDto;
import nl.smallproject.www.librarysystembackend.dtos.Reservation.ReservationOutputDto;
import nl.smallproject.www.librarysystembackend.dtos.Reservation.ReservationUpdateDto;
import nl.smallproject.www.librarysystembackend.entities.User;
import nl.smallproject.www.librarysystembackend.models.Book;
import nl.smallproject.www.librarysystembackend.models.Reservation;
import org.springframework.stereotype.Component;

@Component
public class ReservationMapper {


    public Reservation reservationInputDtoToEntity(ReservationInputDto reservationInputDto, Book book, User user) {
        if (reservationInputDto == null || book == null || user == null) {
            return null;
        }

        Reservation reservation = new Reservation();
        reservation.setUser(user);
        reservation.setBook(book);
        reservation.setReservationDate(reservationInputDto.getReservationDate());
        reservation.setExpiryDate(reservationInputDto.getExpiryDate());
        reservation.setStatus(reservationInputDto.getStatus());
        reservation.setPickupLocation(reservationInputDto.getPickupLocation());
        reservation.setNotes(reservationInputDto.getNotes());
        reservation.setReservationCode(reservationInputDto.getReservationCode());
        reservation.setCreateAt(reservationInputDto.getCreateAt());
        reservation.setUpdateAt(reservationInputDto.getUpdateAt());

        return reservation;
    }

    public ReservationOutputDto reservationEntityToOutputDto(Reservation reservation) {
        ReservationOutputDto reservationOutputDto = new ReservationOutputDto();
        reservationOutputDto.setId(reservation.getId());
        reservationOutputDto.setBookId(reservation.getBook().getId());
        reservationOutputDto.setUserId(reservation.getUser().getId());
        reservationOutputDto.setReservationDate(reservation.getReservationDate());
        reservationOutputDto.setExpiryDate(reservation.getExpiryDate());
        reservationOutputDto.setStatus(reservation.getStatus());
        reservationOutputDto.setPickupLocation(reservation.getPickupLocation());
        reservationOutputDto.setNotes(reservation.getNotes());
        reservationOutputDto.setReservationCode(reservation.getReservationCode());
        reservationOutputDto.setCreateAt(reservation.getCreateAt());
        reservationOutputDto.setUpdateAt(reservation.getUpdateAt());

        return reservationOutputDto;
    }

    public Reservation reservationUpdateDtoToEntity(ReservationUpdateDto reservationUpdateDto, Book book, User user) {
        if (reservationUpdateDto == null || book == null || user == null) {
            return null;
        }

        Reservation reservation = new Reservation();
        reservation.setUser(user);
        reservation.setBook(book);
        reservation.setReservationDate(reservationUpdateDto.getReservationDate());
        reservation.setExpiryDate(reservationUpdateDto.getExpiryDate());
        reservation.setStatus(reservationUpdateDto.getStatus());
        reservation.setPickupLocation(reservationUpdateDto.getPickupLocation());
        reservation.setNotes(reservationUpdateDto.getNotes());
        reservation.setReservationCode(reservationUpdateDto.getReservationCode());
        reservation.setCreateAt(reservationUpdateDto.getCreateAt());
        reservation.setUpdateAt(reservationUpdateDto.getUpdateAt());

        return reservation;
    }
}
