package com.subham.designpattern.creational.builder.outer;

import java.time.LocalDate;

/**
 * @author subham.paul
 */
public class Client {
    public static void main(String[] args) {
        User user = createUser();
        UserDtoBuilder userDtoBuilder = new UserWebDtoBuilder();
        UserDto userDto = directBuild(userDtoBuilder, user);
        System.out.println(userDto);
    }

    /**
     * This method serves the role of director in builder pattern.
     */
    private static UserDto directBuild(UserDtoBuilder builder, User user) {
        return builder
                .withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withAddress(user.getAddress())
                .withBirthday(user.getBirthday())
                .build();
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
