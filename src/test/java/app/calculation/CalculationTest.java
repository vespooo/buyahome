package app.calculation;

import app.calculation.monthly.MonthCalculator;
import app.dto.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculationTest {

    @Autowired
    private CalculationService service;

    @Test
    public void testCalculation(){
        List<MonthCalculator> list = new ArrayList<>();
        Parameters params = new Parameters();

        service.calculate(list, params);
        //TODO Assertion
    }
}
