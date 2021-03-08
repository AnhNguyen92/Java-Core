package javacore.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PublicHoliday {

	@JsonProperty("date")
	private PublicDate publicDate;

	@JsonProperty("name")
	private List<PublicDateName> dateNames;

	@JsonProperty("holidayType")
	private String holidayType;

	public PublicDate getPublicDate() {
		return publicDate;
	}

	public void setPublicDate(PublicDate publicDate) {
		this.publicDate = publicDate;
	}

	public List<PublicDateName> getDateNames() {
		return dateNames;
	}

	public void setDateNames(List<PublicDateName> dateNames) {
		this.dateNames = dateNames;
	}

	public String getHolidayType() {
		return holidayType;
	}

	public void setHolidayType(String holidayType) {
		this.holidayType = holidayType;
	}

	@Override
	public String toString() {
		return "PublicHoliday [publicDate=" + publicDate + ", dateNames=" + dateNames + ", holidayType=" + holidayType
				+ "]";
	}

}
