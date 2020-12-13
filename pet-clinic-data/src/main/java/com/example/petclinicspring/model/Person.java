package com.example.petclinicspring.model;

import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * @author weat0212@gmail.com
 * @project petclinic-spring
 * @package com.example.petclinicspring.model
 * @date 2020/11/14 下午 02:34
 */

@MappedSuperclass
public class Person extends BaseEntity{

    @Column(name = "first_name")
    @NotNull
    private String firstName;

    @Column(name = "last_name")
    @NotNull
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
