package com.subham.designpattern.creational.builder.inner;

import com.subham.designpattern.creational.builder.outer.Address;
import com.subham.designpattern.creational.builder.outer.User;

import java.time.LocalDate;

/**
 * @author subham.paul
 * 
 * Builder class will be inner class of the class of the object to be created.
 */
public class Client {
    public static void main(String[] args) {
        UserDto userDto = directBuild(createUser());
        System.out.println(userDto);
    }

    /**
     * This method serves the role of director in builder pattern.
     */
    private static UserDto directBuild(User user) {
        return UserDto.builder()
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .birthday(user.getBirthday())
                .address(user.getAddress()).build();
    }

    /**
     * Returns a sample user.
     */
    public static User createUser() {
        User user = new User();
        user.setBirthday(LocalDate.of(1960, 5, 6));
        user.setFirstName("Ron");
        user.setLastName("Swanson");
        Address address = new Address();
        address.setHouseNumber("100");
        address.setStreet("State Street");
        address.setCity("Pawnee");
        address.setState("Indiana");
        address.setZipcode("47998");
        user.setAddress(address);
        return user;
    }
}
