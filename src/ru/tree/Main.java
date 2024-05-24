package ru.tree;

import ru.tree.famely_tree.FamilyTree;
import ru.tree.human.Gender;
import ru.tree.human.Human;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        FamilyTree peopleTree = new FamilyTree();
//
        Human person1 = new Human("Иван", LocalDate.of(2020, 3, 12), Gender.MALE);
        Human person2 = new Human("Елена", LocalDate.of(1992, 7, 25), Gender.FEMALE, 80);
        Human person3 = new Human("Алексей", LocalDate.of(2000, 5, 8), Gender.MALE);
        Human person4 = new Human("Марина", LocalDate.of(1985, 9, 30), Gender.FEMALE);
        Human person5 = new Human("Дмитрий", LocalDate.of(1975, 12, 18), Gender.MALE);


        peopleTree.addeadHuman(person2);
        peopleTree.addeadHuman(person3);
        peopleTree.addeadHuman(person4);
        peopleTree.addeadHuman(person5);

        //добавляем родителей
        person1.setMother(person2);
        person1.setFather(person3);


        peopleTree.addeadHuman(person1);

//
//       System.out.println(peopleTree.shareHuman("Иван").getInfo());
        //читаем подготовленные к сохранению данные
        System.out.println("сохрфняемые данные:\n" + peopleTree);

        FileHandler fileHandler = new FileHandler();
//      называем файл
        String fileName = "Tree.ser";
        // сохраняем
        fileHandler.save(peopleTree, fileName);
        //загружаем из файла
        Object peopleTreeDeser = fileHandler.load(fileName);
        System.out.println("загруженные данные:\n" + peopleTreeDeser);
    }
}
