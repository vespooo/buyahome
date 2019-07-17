package app.dto;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

public class Rent {
    private Integer price;
    private BigDecimal indexingRate;

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public BigDecimal getIndexingRate() {
        return indexingRate;
    }

    public void setIndexingRate(BigDecimal indexingRate) {
        this.indexingRate = indexingRate;
    }

    @Override
    public String toString() {
        return "Rent{" +
                "price=" + price +
                ", indexingRate=" + indexingRate +
                '}';
    }
}
