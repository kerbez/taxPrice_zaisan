package com.example.kerbe.tacksa;

/**
 * Created by kerbe on 01.10.2017.
 */

public class Price {
    private String  from;
    private String to;
    int price;

    public Price(String from, String to, int price) {
        this.from = from;
        this.to = to;
        this.price = price;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
