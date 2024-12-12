package nl.smallproject.www.librarysystembackend.models;

import nl.smallproject.www.librarysystembackend.entities.User;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReservationTest {

        @Test
        void testSetAndGetId() {
            Reservation reservation = new Reservation();
            reservation.setId(1L);
            assertEquals(1L, reservation.getId(), "The ID should be set and retrieved correctly.");
        }

        @Test
        void testSetAndGetUser() {
            Reservation reservation = new Reservation();
            User user = new User();
            user.setName("Luis");

            reservation.setUser(user);

            assertEquals(user, reservation.getUser(), "The User should be set and retrieved correctly.");
        }

        @Test
        void testSetAndGetBook() {
            Reservation reservation = new Reservation();
            Book book = new Book();
            book.setId(200L);

            reservation.setBook(book);

            assertEquals(book, reservation.getBook(), "The Book should be set and retrieved correctly.");
        }

        @Test
        void testSetAndGetReservationDate() {
            Reservation reservation = new Reservation();
            Date reservationDate = new Date();

            reservation.setReservationDate(reservationDate);

            assertEquals(reservationDate, reservation.getReservationDate(), "The Reservation Date should be set and retrieved correctly.");
        }

        @Test
        void testSetAndGetExpiryDate() {
            Reservation reservation = new Reservation();
            Date expiryDate = new Date();

            reservation.setExpiryDate(expiryDate);

            assertEquals(expiryDate, reservation.getExpiryDate(), "The Expiry Date should be set and retrieved correctly.");
        }

        @Test
        void testSetAndGetStatus() {
            Reservation reservation = new Reservation();
            String status = "Active";

            reservation.setStatus(status);

            assertEquals(status, reservation.getStatus(), "The Status should be set and retrieved correctly.");
        }

        @Test
        void testSetAndGetPickupLocation() {
            Reservation reservation = new Reservation();
            String pickupLocation = "Central Library";

            reservation.setPickupLocation(pickupLocation);

            assertEquals(pickupLocation, reservation.getPickupLocation(), "The Pickup Location should be set and retrieved correctly.");
        }

        @Test
        void testSetAndGetNotes() {
            Reservation reservation = new Reservation();
            String notes = "Handle with care";

            reservation.setNotes(notes);

            assertEquals(notes, reservation.getNotes(), "The Notes should be set and retrieved correctly.");
        }

        @Test
        void testSetAndGetReservationCode() {
            Reservation reservation = new Reservation();
            String reservationCode = "R123456";

            reservation.setReservationCode(reservationCode);

            assertEquals(reservationCode, reservation.getReservationCode(), "The Reservation Code should be set and retrieved correctly.");
        }

        @Test
        void testSetAndGetCreateAt() {
            Reservation reservation = new Reservation();
            Date createAt = new Date();

            reservation.setCreateAt(createAt);

            assertEquals(createAt, reservation.getCreateAt(), "The Create At date should be set and retrieved correctly.");
        }

        @Test
        void testSetAndGetUpdateAt() {
            Reservation reservation = new Reservation();
            Date updateAt = new Date();

            reservation.setUpdateAt(updateAt);

            assertEquals(updateAt, reservation.getUpdateAt(), "The Update At date should be set and retrieved correctly.");
        }
}
