package com.example.petclinicspring.service;

import com.example.petclinicspring.model.Owner;

/**
 * @author weat0212@gmail.com
 * @project petclinic-spring
 * @package com.example.petclinicspring.service
 * @date 2020/11/18 下午 03:44
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
