package com.privalia.springbootexam.repositories;

import com.privalia.springbootexam.domain.Policy;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PolicyRepository extends CrudRepository<Policy, String> {
/*
    @Query("SELECT p FROM policies p LEFT JOIN clients c WHERE c.name=:userName")
    Iterable<Policy> findPoliciesByUserName(@Param("userName") String userName);
*/
}
