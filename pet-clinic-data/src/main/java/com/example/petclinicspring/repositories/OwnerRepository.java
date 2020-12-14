package com.example.petclinicspring.repositories;

import com.example.petclinicspring.model.Owner;
import org.springframework.data.repository.CrudRepository;

/**
 * @author I-Chung, Wang
 * @date 2020/12/14 下午 07:19
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {

}
