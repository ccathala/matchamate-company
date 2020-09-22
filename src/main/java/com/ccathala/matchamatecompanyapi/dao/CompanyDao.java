package com.ccathala.matchamatecompanyapi.dao;

import java.util.List;
import java.util.Optional;

import com.ccathala.matchamatecompanyapi.models.Company;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

public interface CompanyDao extends MongoRepository<Company, String> {
    List<Company> findByCompanyDataIsSetTrueOrderByAddress_Departement_CodeAsc();
    Optional<Company> findByEmail(@Param("email") String email);
    Company deleteByEmail(@Param("email") String email);  
}