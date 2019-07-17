package app.dto;

import app.dto.serializer.HomeDeserializer;
import app.dto.serializer.Init;
import app.dto.serializer.initiator.DefaultPrice;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.springframework.stereotype.Component;

import java.util.Date;

public class Parameters implements MyComponent{

    @JsonSetter(nulls = Nulls.AS_EMPTY)
    //@JsonDeserialize(using = HomeDeserializer.class)

    private Home home;
    @JsonSetter(nulls = Nulls.AS_EMPTY)
    private Rent rent;
    @JsonSetter(nulls = Nulls.AS_EMPTY)
    private Mortgage mortgage;
    private Date date;
    //private Strategy strategy;


    public Parameters() {
        this.home = new Home();
        this.rent = new Rent();
        this.mortgage = new Mortgage();
    }

    public Home getHome() {
        return home;
    }

    //@JsonDeserialize(using = HomeDeserializer.class)
    //@JsonSetter(nulls = Nulls.AS_EMPTY)
    public void setHome(Home home) {
        this.home = home;
    }

    public Rent getRent() {
        return rent;
    }

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    public Mortgage getMortgage() {
        return mortgage;
    }

    public void setMortgage(Mortgage mortgage) {
        this.mortgage = mortgage;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Parameters{" +
                "home=" + home +
                ", rent=" + rent +
                ", mortgage=" + mortgage +
                ", date=" + date +
                '}';
    }
}
