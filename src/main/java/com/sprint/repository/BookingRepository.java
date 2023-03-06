package com.sprint.repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sprint.models.Booking;


@Repository
public interface BookingRepository extends JpaRepository<Booking,Long>{
	List<Booking> findByDate(@Param("startDate")LocalDate date);
	
//	@Query("SELECT date, numberOfGuests FROM Booking b WHERE b.date = :startDate and b.numberOfGuests =:guests ")
//	Optional<Booking> findByDateAndNumberOfGuests(@Param("startDate")LocalDate date,@Param("guests")int numberOfGuests);
//	@Query("SELECT b FROM Booking b WHERE b.date = :date AND  b.numberOfGuests = :numberOfGuests AND b.tableNumber = :tableNumber")
//	List<Booking> findByDateAndTimeAndNumberOfGuestsAndTableNumber(@Param("date") LocalDate date,  @Param("numberOfGuests") int numberOfGuests, @Param("tableNumber") Integer tableNumber);
	@Query("SELECT b FROM Booking b WHERE b.date = :date AND b.time = :time AND b.numberOfGuests = :numberOfGuests AND b.tableNumber = :tableNumber")
	List<Booking> findByDateTimeAndNumberOfGuestsAndTableNumber(@Param("date") LocalDate date, @Param("time") String time, @Param("numberOfGuests") int numberOfGuests, @Param("tableNumber") Integer tableNumber);

}
