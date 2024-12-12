package nl.smallproject.www.librarysystembackend.services;

import jakarta.transaction.Transactional;
import nl.smallproject.www.librarysystembackend.dtos.Reservation.ReservationInputDto;
import nl.smallproject.www.librarysystembackend.dtos.Reservation.ReservationOutputDto;
import nl.smallproject.www.librarysystembackend.dtos.Reservation.ReservationUpdateDto;
import nl.smallproject.www.librarysystembackend.entities.User;
import nl.smallproject.www.librarysystembackend.exceptions.RecordNotFoundException;
import nl.smallproject.www.librarysystembackend.mappers.ReservationMapper;
import nl.smallproject.www.librarysystembackend.models.Book;
import nl.smallproject.www.librarysystembackend.models.Reservation;
import nl.smallproject.www.librarysystembackend.repositories.BookRepository;
import nl.smallproject.www.librarysystembackend.repositories.ReservationRepository;
import nl.smallproject.www.librarysystembackend.repositories.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ReservationService {

    private final ReservationRepository reservationRepository;
    private final ReservationMapper reservationMapper;
    private final BookRepository bookRepository;
    private final UserRepository userRepository;

    public ReservationService(ReservationRepository reservationRepository, ReservationMapper reservationMapper, BookRepository bookRepository, UserRepository userRepository) {
        this.reservationRepository = reservationRepository;
        this.reservationMapper = reservationMapper;
        this.bookRepository = bookRepository;
        this.userRepository = userRepository;
    }

    @Transactional
    public Reservation createReservation(ReservationInputDto reservationInputDto) {
        Optional<Book> bookOptional = bookRepository.findById(reservationInputDto.getBookId());
        if (bookOptional.isEmpty()) {
            return null;
        }
        Book book = bookOptional.get();

        Optional<User> userOptional = userRepository.findById(reservationInputDto.getUserId());
        if (userOptional.isEmpty())
        {
            return null;
        }
        User user = userOptional.get();


        Reservation reservation = reservationMapper.reservationInputDtoToEntity(reservationInputDto, book, user);
        return reservationRepository.save(reservation);
    }

    public List<ReservationOutputDto> getAllReservations() {
        List<Reservation> reservations = reservationRepository.findAll();
        List<ReservationOutputDto> reservationOutputDtos = new ArrayList<>();

        for (var entry: reservations) {
            reservationOutputDtos.add(reservationMapper.reservationEntityToOutputDto(entry));
        }
        return reservationOutputDtos;
    }

    public ReservationOutputDto getReservationById(long id) {
        Optional<Reservation> reservationOptional = Optional.ofNullable(reservationRepository.findById(id)
                .orElseThrow(() -> new RecordNotFoundException("Reservation not found with this id: " + id)));

        if (reservationOptional.isEmpty()) {
            return null;
        }

        Reservation reservation = reservationOptional.get();
        return reservationMapper.reservationEntityToOutputDto(reservation);
    }

    @Transactional
    public void updateReservation(Long id, ReservationUpdateDto reservationUpdateDto) {
        Optional<Reservation> reservationOptional = Optional.ofNullable(reservationRepository.findById(id)
                .orElseThrow(() -> new RecordNotFoundException("Reservation not found with this id: " + id)));

        if(reservationOptional.isEmpty()) {
            return;
        }
        Reservation existingReservation = reservationOptional.get();

        Optional<Book> bookOptional = bookRepository.findById(reservationUpdateDto.getBookId());
        if (bookOptional.isEmpty()) {
            return;
        }
        Book book = bookOptional.get();

        Optional<User> userOptional = userRepository.findById(reservationUpdateDto.getUserId());
        if (userOptional.isEmpty())
        {
            return;
        }
        User user = userOptional.get();


        Reservation updatedReservation = reservationMapper.reservationUpdateDtoToEntity(reservationUpdateDto, book, user);
        BeanUtils.copyProperties(updatedReservation, existingReservation, "id");
        reservationRepository.save(existingReservation);
    }

    @Transactional
    public void deleteReservation(Long id) {
        reservationRepository.deleteById(id);
    }
}
