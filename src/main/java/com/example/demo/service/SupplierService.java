package com.example.demo.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ManufacturingProcess;
import com.example.demo.entity.NatureOfBusiness;
import com.example.demo.entity.Supplier;
import com.example.demo.repository.SupplierRepository;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    public Page<Supplier> findSuppliers(String location, NatureOfBusiness natureOfBusiness, Set<ManufacturingProcess> processes, int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return supplierRepository.findByLocationAndNatureOfBusinessAndManufacturingProcessesIn(location, natureOfBusiness, processes, pageable);
    }
}

