package app.dto;

import org.springframework.stereotype.Component;


public class Tax {
    private Integer yearAmount;
    private Integer monthAmount;
    private Float rate;

    public Integer getYearAmount() {
        return yearAmount;
    }

    public void setYearAmount(Integer yearAmount) {
        this.yearAmount = yearAmount;
    }

    public Integer getMonthAmount() {
        return monthAmount;
    }

    public void setMonthAmount(Integer monthAmount) {
        this.monthAmount = monthAmount;
    }

    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Tax{" +
                "yearAmount=" + yearAmount +
                ", monthAmount=" + monthAmount +
                ", rate=" + rate +
                '}';
    }
}
