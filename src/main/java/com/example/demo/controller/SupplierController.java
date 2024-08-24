package com.example.demo.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.ManufacturingProcess;
import com.example.demo.entity.NatureOfBusiness;
import com.example.demo.entity.Supplier;
import com.example.demo.entity.SupplierQueryDTO;
import com.example.demo.repository.SupplierRepository;
import com.example.demo.service.SupplierService;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @PostMapping("/query")
    public ResponseEntity<Page<Supplier>> getSuppliers(@Valid @RequestBody SupplierQueryDTO queryDTO) {
        Page<Supplier> suppliers = supplierService.findSuppliers(
            queryDTO.getLocation(),
            queryDTO.getNatureOfBusiness(),
            queryDTO.getManufacturingProcesses(),
            queryDTO.getPage(),
            queryDTO.getSize()
        );
        return ResponseEntity.ok(suppliers);
    }
    
    @Autowired
    private SupplierRepository supplierRepository;

    @PostMapping("/add")
    public ResponseEntity<Supplier> addSupplier(@Valid @RequestBody SupplierDTO supplierDTO) {
        Supplier supplier = new Supplier();
        supplier.setCompanyName(supplierDTO.getCompanyName());
        supplier.setWebsite(supplierDTO.getWebsite());
        supplier.setLocation(supplierDTO.getLocation());
        supplier.setNatureOfBusiness(supplierDTO.getNatureOfBusiness());
        supplier.setManufacturingProcesses(supplierDTO.getManufacturingProcesses());

        Supplier savedSupplier = supplierRepository.save(supplier);
        return ResponseEntity.ok(savedSupplier);
    }
}


class SupplierDTO {
    @NotBlank
    private String companyName;

    @NotBlank
    private String website;

    @NotBlank
    private String location;

    @NotNull
    private NatureOfBusiness natureOfBusiness;

    @NotEmpty
    private Set<ManufacturingProcess> manufacturingProcesses;

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