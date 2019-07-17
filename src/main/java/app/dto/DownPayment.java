package app.dto;

import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

public class DownPayment {
    @JsonSetter(nulls = Nulls.AS_EMPTY)
    private int amount;
    private Float rate;

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "DownPayment{" +
                "amount=" + amount +
                ", rate=" + rate +
                '}';
    }
}
