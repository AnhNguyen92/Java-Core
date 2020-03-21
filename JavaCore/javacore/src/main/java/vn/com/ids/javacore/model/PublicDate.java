package vn.com.ids.javacore.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PublicDate {
    @JsonProperty("day")
    private int day;
    
    @JsonProperty("month")
    private int month;
    
    @JsonProperty("year")
    private int year;
    
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
}
