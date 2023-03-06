package com.sprint.repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sprint.models.Tables;

@Repository
public interface TableRepository extends JpaRepository<Tables, Long> {

	List<Tables> findBySeatingCapacity(int seatingCapacity);

	
//	@Query("SELECT t FROM Table t WHERE t.seatingCapacity >= :seatingCapacity AND t.id NOT IN "
//            + "(SELECT b.table.id FROM Booking b WHERE b.date = :date AND b.time = :time)")
//    List<Tables> findAvailableTablesBySeatingCapacityAndDateTime(
//            @Param("seatingCapacity") int seatingCapacity,
//            @Param("date") LocalDate date,
//            @Param("time") String time);
	}


