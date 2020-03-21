package vn.com.ids.javacore.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PublicHoliday {
    @JsonProperty("date")
    private PublicDate publicDate;
    
    @JsonProperty("name")
    private List<DayName> dayNames;
    
    @JsonProperty("holidayType")
    private String holidayType;

    public PublicDate getPublicDate() {
        return publicDate;
    }

    public void setPublicDate(PublicDate publicDate) {
        this.publicDate = publicDate;
    }

    public List<DayName> getDayNames() {
        return dayNames;
    }

    public void setDayNames(List<DayName> dayNames) {
        this.dayNames = dayNames;
    }

    public String getHolidayType() {
        return holidayType;
    }

    public void setHolidayType(String holidayType) {
        this.holidayType = holidayType;
    }

    @Override
    public String toString() {
        return "PublicHoliday [publicDate=" + publicDate + ", dayNames=" + dayNames + ", holidayType=" + holidayType + "]";
    }
    
    public void printDateAndName() {
        System.out.println("PublicHoliday " + this.publicDate.getDay() + "/" + this.publicDate.getMonth() +  "/" + this.publicDate.getYear() + " - " + this.getDayNames().get(this.dayNames.size() -1).getText());
    }
}
