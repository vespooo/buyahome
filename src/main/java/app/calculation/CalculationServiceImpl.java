package app.calculation;

import app.dto.Parameters;
import app.calculation.firstmonth.FirstMonthCalculator;
import app.calculation.monthly.MonthCalculator;
import app.calculation.monthly.MonthCalculationResult;
import app.calculation.monthly.MonthCalculationService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CalculationServiceImpl implements CalculationService {

    @Autowired
    private MonthCalculationService service;

    @Autowired
    private FirstMonthCalculator firstMonthCalculator;

    @Override
    public CalculationResult calculate(List<MonthCalculator> calculations, Parameters params) {
        MonthCalculationResult monthResult = firstMonthCalculator.calculate(params);
        CalculationResult result = new CalculationResultImpl();
        while (monthResult.isCalculationOver()){
            monthResult = service.calculate(calculations, monthResult);
            result.add(monthResult);
        }
        return result;
    }
}
