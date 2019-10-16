package app.calculation.monthly;

import java.util.List;

public interface MonthCalculationService {

    MonthCalculationResult calculate(List<MonthCalculator> calculations, MonthCalculationResult result);
}
