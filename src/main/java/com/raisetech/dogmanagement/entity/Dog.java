package com.raisetech.dogmanagement.entity;

import java.util.Objects;

public class Dog {
    private int id;
    private String name;
    private String sex;
    private String age;
    private String dogBreed;
    private String region;

    public Dog(int id, String name, String sex, String age, String dogBreed, String region) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.dogBreed = dogBreed;
        this.region = region;
    }

    public Dog(String name, String sex, String age, String dogBreed, String region) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.dogBreed = dogBreed;
        this.region = region;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Dog dog = (Dog) o;
        return id == dog.id && Objects.equals(name, dog.name) && Objects.equals(sex, dog.sex) && Objects.equals(age, dog.age) &&Objects.equals(dogBreed, dog.dogBreed) &&Objects.equals(region, dog.region);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, sex, dogBreed, region);}
}

