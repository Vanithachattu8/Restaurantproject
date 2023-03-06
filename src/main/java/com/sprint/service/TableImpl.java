package com.sprint.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprint.models.Tables;
import com.sprint.repository.TableRepository;

@Service
public class TableImpl implements TableService {

    @Autowired
    private TableRepository tableRepository;

//    public List<Tables> findAvailableTables(LocalDate date, String time) {
//        return tableRepository.findAvailableTables(date, time);
//    }
    
        public Tables createTable(Tables table) {
            return tableRepository.save(table);
        }

        @Override
        public Tables createTableWithNumberAndCapacity(int tableNumber, int seatingCapacity) {
            Tables table = new Tables();
            table.setTableNumber(tableNumber);
            table.setSeatingCapacity(seatingCapacity); 
            return tableRepository.save(table);
        }
        @Override
        public List<Tables> getAllTables() {
            return tableRepository.findAll();
        }
        @Override
        public List<Tables> getTablesBySeatingCapacity(int seatingCapacity) {
            return tableRepository.findBySeatingCapacity(seatingCapacity);
        }
//        @Override
//        public List<Tables> getAvailableTablesBySeatingCapacityAndDateTime(int seatingCapacity, LocalDate date, String time) {
//            return tableRepository.findAvailableTablesBySeatingCapacityAndDateTime(seatingCapacity, date, time);
//        }
    }






