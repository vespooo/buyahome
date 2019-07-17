package app.dto;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.math.BigDecimal;

public class Mortgage {

    private DownPayment downpayment;
    private BigDecimal interestRate;
    private Integer period;

    public DownPayment getDownpayment() {
        return downpayment;
    }

    public void setDownpayment(DownPayment downpayment) {
        this.downpayment = downpayment;
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    @Override
    public String toString() {
        return "Mortgage{" +
                "downpayment=" + downpayment +
                ", interestRate=" + interestRate +
                ", period=" + period +
                '}';
    }
}
