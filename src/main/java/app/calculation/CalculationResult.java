package app.calculation;

import app.calculation.monthly.MonthCalculationResult;

public interface CalculationResult {
    void add(MonthCalculationResult monthResult);
}
