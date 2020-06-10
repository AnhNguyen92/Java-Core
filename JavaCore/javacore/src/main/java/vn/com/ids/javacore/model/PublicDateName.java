package vn.com.ids.javacore.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PublicDateName {
	
	@JsonProperty("lang")
	private String lang;
	
	@JsonProperty("text")
	private String text;

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "PublicDateName [lang=" + lang + ", text=" + text + "]";
	}
	
}
