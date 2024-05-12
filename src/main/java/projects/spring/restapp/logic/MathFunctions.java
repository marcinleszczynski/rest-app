package projects.spring.restapp.logic;

import org.springframework.stereotype.Component;

@Component
public class MathFunctions {
    public int square(int x) {
        return x*x;
    }
    public int cube(int x) {
        return x*x*x;
    }
    public int add(int x, int y) {
        return x+y;
    }
    public int mul(int x, int y) {
        return x*y;
    }
}