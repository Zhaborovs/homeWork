package ru.tree;

import ru.tree.famely_tree.FamilyTree;
import ru.tree.human.Gender;
import ru.tree.human.Human;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        FamilyTree peopleTree = new FamilyTree();

        Human person1 = new Human("Иван", LocalDate.of(1980, 3, 12), Gender.MALE);
        Human person2 = new Human("Елена", LocalDate.of(1992, 7, 25), Gender.FEMALE, 80);
        Human person3 = new Human("Алексей", LocalDate.of(2000, 5, 8), Gender.MALE);
        Human person4 = new Human("Марина", LocalDate.of(1985, 9, 30), Gender.FEMALE);
        Human person5 = new Human("Дмитрий", LocalDate.of(1975, 12, 18), Gender.MALE);

        peopleTree.addeadHuman(person1);
        peopleTree.addeadHuman(person2);
        peopleTree.addeadHuman(person3);
        peopleTree.addeadHuman(person4);
        peopleTree.addeadHuman(person5);


//
        System.out.println(peopleTree.shareHuman("Дмитрий"));

    }
}
