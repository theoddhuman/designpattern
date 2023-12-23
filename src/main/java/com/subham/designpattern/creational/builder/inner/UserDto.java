package com.subham.designpattern.creational.builder.inner;

import com.subham.designpattern.creational.builder.outer.Address;

import java.time.LocalDate;
import java.time.Period;

/**
 * @author subham.paul
 */
public class UserDto {
    private String name;

    private String address;

    private String age;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getAge() {
        return age;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    private void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name=" + name + "\nage=" + age + "\naddress=" + address ;
    }

    //Get builder instance
    public static UserDtoBuilder builder() {
        return new UserDtoBuilder();
    }

    public static class UserDtoBuilder {
        private String firstName;

        private String lastName;

        private String age;

        private String address;

        private UserDto userDto;

        public UserDtoBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserDtoBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserDtoBuilder birthday(LocalDate date) {
            age = Integer.toString(Period.between(date, LocalDate.now()).getYears());
            return this;
        }

        public UserDtoBuilder address(Address address) {
            this.address = address.getHouseNumber() + " " +address.getStreet()
                    + "\n"+address.getCity()+", "+address.getState()+" "+address.getZipcode();

            return this;
        }

        public UserDto build() {
            this.userDto = new UserDto();
            userDto.setName(firstName+" " + lastName);
            userDto.setAddress(address);
            userDto.setAge(age);
            return this.userDto;
        }

        public UserDto getUserDTO() {
            return this.userDto;
        }

    }
}
