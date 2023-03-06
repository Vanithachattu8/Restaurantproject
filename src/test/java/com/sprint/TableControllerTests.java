package com.sprint;

	import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

	import org.junit.Test;
	import org.junit.runner.RunWith;
	import org.mockito.Mock;
	import org.mockito.junit.MockitoJUnitRunner;

import com.sprint.models.Tables;
import com.sprint.repository.TableRepository;

//	@RunWith(MockitoJUnitRunner.class)
////	public class TableControllerTests {
////	    
////	    @Mock
////	    private TableRepository tableRepository;
////	    
////	    @Test
////	    public void testCreateTableWithNumberAndCapacity() {
////	        // create a mock table to be returned by the tableRepository
////	        Tables mockTable = new Tables();
////	        mockTable.setTableNumber(1);
////	        mockTable.setSeatingCapacity(4);
////	        when(tableRepository.save(any(Tables.class))).thenReturn(mockTable);
////	        
////	        // create an instance of the class to be tested
//////	        MyClass myClass = new MyClass(tableRepository);
////	        
////	        // call the method being tested
////	        Tables result = myClass.createTableWithNumberAndCapacity(1, 4);
////	        
////	        // verify that the tableRepository was called with the expected parameters
////	        verify(tableRepository).save(argThat(table -> 
////	            table.getTableNumber() == 1 && table.getSeatingCapacity() == 4));
////	        
////	        // verify that the result is the same as the mock table
////	        assertEquals(mockTable, result);
////	    }
////	}
////
