package com.example.demo.entity;

import java.util.Set;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Supplier {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long supplierId;

    private String companyName;
    
    private String website;
    
    private String location;
    
    @Enumerated(EnumType.STRING)
    private NatureOfBusiness natureOfBusiness;

    @ElementCollection(targetClass = ManufacturingProcess.class)
    @Enumerated(EnumType.STRING)
    private Set<ManufacturingProcess> manufacturingProcesses;

	@Override
	public String toString() {
		return "Supplier [supplierId=" + supplierId + ", companyName=" + companyName + ", website=" + website
				+ ", location=" + location + ", natureOfBusiness=" + natureOfBusiness + ", manufacturingProcesses="
				+ manufacturingProcesses + "]";
	}

	public Long getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public NatureOfBusiness getNatureOfBusiness() {
		return natureOfBusiness;
	}

	public void setNatureOfBusiness(NatureOfBusiness natureOfBusiness) {
		this.natureOfBusiness = natureOfBusiness;
	}

	public Set<ManufacturingProcess> getManufacturingProcesses() {
		return manufacturingProcesses;
	}

	public void setManufacturingProcesses(Set<ManufacturingProcess> manufacturingProcesses) {
		this.manufacturingProcesses = manufacturingProcesses;
	}
    
}
