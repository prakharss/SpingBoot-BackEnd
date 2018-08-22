package com.optum.springBoot.Domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Providerdata {
	
	Providerdata(){};
	
	@Id
	private String providername;
	
	private Long compliance;
	
	private Long noncompliance;
	
	public Providerdata(String providername, Long compliance, Long noncompliance) {
		super();
		this.compliance = compliance;
		this.noncompliance = noncompliance;
		this.providername = providername;
	}

	public String getProvidername() {
		return providername;
	}

	public void setProvidername(String providername) {
		this.providername = providername;
	}

	public Long getCompliance() {
		return compliance;
	}

	public void setCompliance(Long compliance) {
		this.compliance = compliance;
	}

	public Long getNoncompliance() {
		return noncompliance;
	}

	public void setNoncompliance(Long noncompliance) {
		this.noncompliance = noncompliance;
	}

}
