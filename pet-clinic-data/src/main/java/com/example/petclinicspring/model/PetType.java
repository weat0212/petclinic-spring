package com.example.petclinicspring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author weat0212@gmail.com
 * @project petclinic-spring
 * @package com.example.petclinicspring.model
 * @date 2020/11/14 下午 02:36
 */

@Entity
@Table(name = "types")
public class PetType extends BaseEntity{

    @Column(name = "pet_type_name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
