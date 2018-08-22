package com.optum.springBoot.Entity;

import java.io.Serializable;

public class Data implements Serializable {
	private static final long serialVersionUID = 1L;
	private String Provider;
	private String Compliance;
	private String NonCompliance;
	public String getProvider() {
		return Provider;
	}
	public void setProvider(String provider) {
		Provider = provider;
	}
	public String getCompliance() {
		return Compliance;
	}
	public void setCompliance(String compliance) {
		Compliance = compliance;
	}
	public String getNonCompliance() {
		return NonCompliance;
	}
	public void setNonCompliance(String nonCompliance) {
		NonCompliance = nonCompliance;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
