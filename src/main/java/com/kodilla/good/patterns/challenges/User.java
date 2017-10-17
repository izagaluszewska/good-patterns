package com.kodilla.good.patterns.challenges;

public class User {
    private String name;
    private String surname;
    private String nick;
    private int age;
    private double averageNote;
    private String address;

    public User(String name, String surname, String nick, int age, double averageNote, String address) {
        this.name = name;
        this.surname = surname;
        this.nick = nick;
        this.age = age;
        this.averageNote = averageNote;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getNick() {
        return nick;
    }

    public int getAge() {
        return age;
    }

    public double getAverageNote() {
        return averageNote;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", nick='" + nick + '\'' +
                ", age=" + age +
                ", averageNote=" + averageNote +
                ", address='" + address + '\'' +
                '}';
    }
}
