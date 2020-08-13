package com.ccathala.matchamatecompanyapi.dao;

import java.util.Optional;

import com.ccathala.matchamatecompanyapi.models.Company;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "companies", path = "companies")
public interface CompanyDao extends MongoRepository<Company, String> {
    Optional<Company> findByEmail(@Param("email") String email);

    Company deleteByEmail(@Param("email") String email);  

}