package com.sprint.service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.sprint.models.Tables;

public interface TableService {
	
	public Tables createTableWithNumberAndCapacity(int tableNumber, int seatingCapacity);
	List<Tables> getAllTables();
	List<Tables> getTablesBySeatingCapacity(int seatingCapacity);
	//public List<Tables> getAvailableTablesBySeatingCapacityAndDateTime(int seatingCapacity, LocalDate date, String time);
}
