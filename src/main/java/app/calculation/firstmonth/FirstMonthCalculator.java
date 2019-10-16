package app.calculation.firstmonth;

import app.dto.Parameters;
import app.calculation.monthly.MonthCalculationResult;

public interface FirstMonthCalculator {
    MonthCalculationResult calculate(Parameters params);
}
