package app.calculation.monthly;

import java.util.List;

public class MonthCalculationServiceImpl implements MonthCalculationService {
    @Override
    public MonthCalculationResult calculate(List<MonthCalculator> calculations, MonthCalculationResult result) {

        MonthCalculator regularMonthCalculator = new RegularMonthCalculator();
        result = regularMonthCalculator.calculate(result);
        for (MonthCalculator calculation : calculations){
            result = calculation.calculate(result);
        }
        return result;
    }
}
