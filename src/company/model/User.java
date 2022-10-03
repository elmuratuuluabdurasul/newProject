package company.model;

import company.model.somepackage.Gender;

public class User {
    private  int id;
    private String name;
    private int age;
    private Gender.Genderenum gender;

    public User(){}

    public User(int id, String name, int age, Gender.Genderenum gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender.Genderenum getGender() {
        return gender;
    }

    public void setGender(Gender.Genderenum gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", age = " + age +
                ", gender = '" + gender + '\'' +
                '}';
    }
}