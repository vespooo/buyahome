package app.calculation;

import app.dto.Parameters;
import app.calculation.monthly.MonthCalculator;

import java.util.List;

public interface CalculationService {

    CalculationResult calculate(List<MonthCalculator>calculations, Parameters params);
}
