package com.example.demo.repository;

import java.util.Set;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.ManufacturingProcess;
import com.example.demo.entity.NatureOfBusiness;
import com.example.demo.entity.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
    Page<Supplier> findByLocationAndNatureOfBusinessAndManufacturingProcessesIn(
        String location, NatureOfBusiness natureOfBusiness, Set<ManufacturingProcess> manufacturingProcesses, Pageable pageable);
}
