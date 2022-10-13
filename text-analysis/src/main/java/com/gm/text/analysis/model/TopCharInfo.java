package com.gm.text.analysis.model;

public class TopCharInfo {
	private Long count;
	private Double percentage;
	
	public TopCharInfo () {
		count = 0L;
		percentage = 0D;
	}
	
	public Long getCount() {
		return count;
	}
	public void setCount(Long count) {
		this.count = count;
	}
	public Double getPercentage() {
		return percentage;
	}
	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}
	
}
