package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {

    private Date expiryDate;

    public FreshMerchandise(String name, String uniqueId, String responsibleId) {
        super(name, uniqueId, responsibleId);
    }

    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf, int quantity) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
    }

    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf, int quantity, Date expiryDate) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expiryDate = expiryDate;
    }

    @Override
    public String getSpecificData() {
        return
            "Name: " + name +
            ", Unique id: " + uniqueId +
            ", Responsible id: " + responsibleId +
            ", Zone: " + zone +
            ", Area: " + area +
            ", Shelf: " + shelf +
            ", Quantity: " + quantity +
            ", Expiry date: " + this.getFormattedDate(this.getExpirationDate());
    }

    public void printSpecificData() {
        System.out.println(this.getSpecificData());
    }

    public String getFormattedDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return sdf.format(date);
    }

    public Date getExpirationDate() {
        return this.expiryDate;
    }

    public void setExpirationDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }
}
