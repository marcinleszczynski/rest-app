package projects.spring.restapp.rest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import projects.spring.restapp.logic.MathFunctions;

public class MathControllerTests {

    @InjectMocks
    private MathController mathController;

    @Mock
    private MathFunctions mathFunctions;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }


    @Test
    void testGetSquare() {
        when(mathFunctions.square(90)).thenReturn(8100);

        ResponseEntity<Integer> response = mathController.getSquare(90);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(8100, response.getBody());
    }

    @Test
    void testGetCube() {
        when(mathFunctions.cube(4)).thenReturn(64);

        ResponseEntity<Integer> response = mathController.getCube(4);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(64, response.getBody());
    }

    @Test
    void testGetSum() {
        when(mathFunctions.add(10, 5)).thenReturn(15);

        ResponseEntity<Integer> response = mathController.getSum(10, 5);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(15, response.getBody());
    }

    @Test
    void testGetMul() {
        when(mathFunctions.mul(10, 5)).thenReturn(50);

        ResponseEntity<Integer> response = mathController.getMul(10, 5);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(50, response.getBody());
    }
}
