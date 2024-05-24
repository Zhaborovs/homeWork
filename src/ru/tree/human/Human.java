package ru.tree.human;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class Human implements Serializable {
    private String name;
    private LocalDate dob, dod; // Дата рождения и смерти
    private List<Human> children; // Список детей
    private Human father, mother; // Отец и мать
    private Gender gender; // Пол

    public Human(String name, LocalDate dob, Gender gender) {
        this.name = name;
        this.dob = dob;
        this.gender = gender;
    }

    public Human(String name, LocalDate dob, Gender gender, int maxAge) {
        this(name,dob,gender);
        this.dod = LocalDate.now().minus(Period.ofYears(maxAge));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public LocalDate getDod() {
        return dod;
    }

    public void setDod(LocalDate dod) {
        this.dod = dod;
    }

    public List<Human> getChildren() {
        return children;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return  name;
    }
    public String getInfo() {
        return "Человек{" +
                "Имя='" + name + '\'' +
                ", Дата рождения=" + dob +
                ", Дата смерти=" + dod +
                ", Дети=" + children +
                ", Отец=" + father +
                ", Мать=" + mother +
                ", Пол=" + gender +
                '}';
    }

}
