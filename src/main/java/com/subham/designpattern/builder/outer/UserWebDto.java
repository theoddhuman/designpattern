package com.subham.designpattern.builder.outer;

/**
 * @author subham.paul
 */
public class UserWebDto implements UserDto {
    private String name;

    private String address;

    private String age;

    public UserWebDto(String name, String address, String age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getAddress() {
        return this.address;
    }

    @Override
    public String getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return "UserWebDto{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
