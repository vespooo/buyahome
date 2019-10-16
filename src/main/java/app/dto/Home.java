package app.dto;

import app.serializer.Init;
import app.serializer.initiator.DefaultHoa;
import app.serializer.initiator.DefaultPrice;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

import java.math.BigDecimal;

public class Home implements MyComponent{
    @JsonSetter(nulls = Nulls.DEFAULT)
    @Init(initiator = DefaultPrice.class)
    private Integer price;

    @Init(initiator = DefaultHoa.class)
    private Integer hoa;


    private String city;
    private BigDecimal indexingRate;
    private Tax tax;


    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getHoa() {
        return hoa;
    }

    public void setHoa(Integer hoa) {
        this.hoa = hoa;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public BigDecimal getIndexingRate() {
        return indexingRate;
    }

    public void setIndexingRate(BigDecimal indexingRate) {
        this.indexingRate = indexingRate;
    }

    public Tax getTax() {
        return tax;
    }

    public void setTax(Tax tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "Home{" +
                "price=" + price +
                ", hoa=" + hoa +
                ", city='" + city + '\'' +
                ", indexingRate=" + indexingRate +
                ", tax=" + tax +
                '}';
    }
}
