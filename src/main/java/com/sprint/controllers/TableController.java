package com.sprint.controllers;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sprint.models.Tables;
import com.sprint.service.TableImpl;

@RestController
@RequestMapping("/tables")
public class TableController {

    @Autowired
    private TableImpl tableService;

//    @GetMapping("/available")
//    public List<Tables> getAvailableTables(@RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date,
//                                          @RequestParam("time") @DateTimeFormat(iso = DateTimeFormat.ISO.TIME) String time) {
//        return tableService.findAvailableTables(date, time);
//    }
    
//        @PostMapping
//        public Tables createTable(@RequestBody Tables table) {
//            return tableService.createTable(table);
//        }
//
//        @GetMapping("/seating/{seatingCapacity}")
//        public List<Tables> getTablesBySeating(@PathVariable int seatingCapacity) {
//            return tableService.getTablesBySeating(seatingCapacity);
//        }
    @PostMapping("/create")
    public Tables createTableWithNumberAndCapacity(@RequestParam int tableNumber, @RequestParam int seatingCapacity) {
        return tableService.createTableWithNumberAndCapacity(tableNumber, seatingCapacity);
    }
    @GetMapping("/list")
    public List<Tables> getAllTables() {
        return tableService.getAllTables();
    }
    @GetMapping("/by-seating-capacity")
    public List<Tables> getTablesBySeatingCapacity(@RequestParam int seatingCapacity) {
        return tableService.getTablesBySeatingCapacity(seatingCapacity);
    }
//    @GetMapping("/available")
//    public ResponseEntity<List<Tables>> getAvailableTables(@RequestParam int seatingCapacity, @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date, @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.TIME) String time) {
//        List<Tables> availableTables = tableService.getAvailableTablesBySeatingCapacityAndDateTime(seatingCapacity, date, time);
//        return ResponseEntity.ok().body(availableTables);
//    }
    }


