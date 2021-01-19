package com.example.petclinicspring.repositories;

import com.example.petclinicspring.model.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author I-Chung, Wang
 * @date 2020/12/14 下午 07:19
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
}
