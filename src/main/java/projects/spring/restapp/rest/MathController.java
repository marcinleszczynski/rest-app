package projects.spring.restapp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projects.spring.restapp.logic.MathFunctions;

@RestController
@RequestMapping("/math")
public class MathController {

    @Autowired
    private MathFunctions mathFunctions;

    public MathController(MathFunctions mathFunctions) {
        this.mathFunctions = mathFunctions;
    }

    @GetMapping("/square/{num}")
    public ResponseEntity<Integer> getSquare(@PathVariable("num") int number) {
        int square = mathFunctions.square(number);
        return ResponseEntity.status(HttpStatus.OK).body(square);
    }

    @GetMapping("/cube/{num}")
    public ResponseEntity<Integer> getCube(@PathVariable("num") int number) {
        int cube = mathFunctions.cube(number);
        return ResponseEntity.status(HttpStatus.OK).body(cube);
    }

    @GetMapping("/add/{num1}+{num2}")
    public ResponseEntity<Integer> getSum(@PathVariable("num1") int number1, @PathVariable("num2") int number2) {
        int sum = mathFunctions.add(number1, number2);
        return ResponseEntity.status(HttpStatus.OK).body(sum);
    }

    @GetMapping("/mul/{num1}x{num2}")
    public ResponseEntity<Integer> getMul(@PathVariable("num1") int number1, @PathVariable("num2") int number2) {
        int product = mathFunctions.mul(number1, number2);
        return ResponseEntity.status(HttpStatus.OK).body(product);
    }
}
