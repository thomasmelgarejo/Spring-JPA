package com.JPA.repository;

import com.JPA.model.Company;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<Company,Long> {
}
