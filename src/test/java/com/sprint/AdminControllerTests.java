package com.sprint;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;

import com.sprint.exceptions.InvalidCredentialsException;
import com.sprint.repository.AdminRepository;
import com.sprint.service.AdminImpl;


//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.web.servlet.MockMvc;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.sprint.service.AdminService;
//
//@WebMvcTest
//public class AdminControllerTests {
//
//	@Autowired
//	private MockMvc mockMvc;
//	
//	@MockBean
//	private AdminService adminService;
//	
//	@Autowired
//	private ObjectMapper objectMapper;
//	public AdminControllerTests() {
//		// TODO Auto-generated constructor stub
//	}
//}
//
//
@RunWith(MockitoJUnitRunner.class)
public class AdminControllerTests {

    @Mock
    private AdminRepository adminRepository;

    @InjectMocks
    private AdminImpl adminService;



    @Test(expected = InvalidCredentialsException.class)
    public void testLoginAdmin_withInvalidCredentials_shouldThrowInvalidCredentialsException() throws InvalidCredentialsException {
        // Arrange
        String email = "admin@example.com";
        String password = "password";

        when(adminRepository.validateAdmin(email, password)).thenReturn(null);

        // Act
        adminService.loginAdmin(email, password);

        // Assert
        // Expecting an InvalidCredentialsException to be thrown
    }
}
