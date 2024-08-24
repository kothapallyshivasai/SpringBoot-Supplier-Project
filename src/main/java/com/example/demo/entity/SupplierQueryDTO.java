package com.example.demo.entity;

import java.util.Set;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class SupplierQueryDTO {
    @NotBlank
    private String location;

    @NotNull
    private NatureOfBusiness natureOfBusiness;

    @NotEmpty
    private Set<ManufacturingProcess> manufacturingProcesses;

    @Min(0)
    private int page = 0;

    @Min(1)
    private int size = 10;

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

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "SupplierQueryDTO [location=" + location + ", natureOfBusiness=" + natureOfBusiness
				+ ", manufacturingProcesses=" + manufacturingProcesses + ", page=" + page + ", size=" + size + "]";
	}

    
}
