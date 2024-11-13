package com.subham.designpattern.creational.builder.outer;

import java.time.LocalDate;

/**
 * @author subham.paul
 */
public interface UserDtoBuilder {//methods to build "parts" of product at a time
    UserDtoBuilder withFirstName(String fname) ;

    UserDtoBuilder withLastName(String lname);

    UserDtoBuilder withBirthday(LocalDate date);

    UserDtoBuilder withAddress(Address address);
    //method to "assemble" final product
    UserDto build();

}
