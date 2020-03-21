package vn.com.ids.javacore.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DayName {
    @JsonProperty("lang")
    private String language;
    
    @JsonProperty("text")
    private String text;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
}
