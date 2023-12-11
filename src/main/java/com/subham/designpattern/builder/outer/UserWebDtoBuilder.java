package com.subham.designpattern.builder.outer;

import java.time.LocalDate;
import java.time.Period;

/**
 * @author subham.paul
 */

public class UserWebDtoBuilder implements UserDtoBuilder{
    private String firstName;
    private String lastName;
    private String age;
    private String address;
    private UserWebDto dto;

    @Override
    public UserDtoBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public UserDtoBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public UserDtoBuilder withBirthday(LocalDate date) {
        Period ageInYears = Period.between(date, LocalDate.now());
        age = Integer.toString(ageInYears.getYears());
        return this;
    }

    @Override
    public UserDtoBuilder withAddress(Address address) {
        this.address = address.getHouseNumber() +", " + address.getStreet()
                +"\n" + address.getCity() +"\n"+address.getState()+" "+address.getZipcode();
        return this;
    }

    @Override
    public UserDto build() {
        dto = new UserWebDto(firstName + " " + lastName, address, age);
        return dto;
    }

    @Override
    public UserDto getUserDto() {
        return dto;
    }
}
