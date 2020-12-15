package com.ytc.text.december14;

public class Person {

    private String name;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", profession='" + profession + '\'' +
                '}';
    }

    private String profession;

    public Person() {
    }

    public Person(String name, String profession) {
        this.name = name;

        this.profession = profession;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void OutputSkills(){

    }
}
