package com.optum.springBoot.Repository;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.optum.springBoot.Domain.Providerdata;


public interface ProviderdataRepository extends CrudRepository<Providerdata, String> {

}
