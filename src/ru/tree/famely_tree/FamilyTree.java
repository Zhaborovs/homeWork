package ru.tree.famely_tree;
import ru.tree.human.Human;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FamilyTree implements Serializable {
    private List<Human> humanList;

    public FamilyTree() {
        humanList = new ArrayList<>();
    }

    public void addeadHuman(Human human){
        humanList.add(human);
    }

//поиск человека по имени
    public Human shareHuman(String nameHuman){
        for(Human human: humanList){
            if(human.getName().equals(nameHuman)){
                return human;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Human human : humanList) {
            result.append(human.toString()).append("\n");
        }
        return result.toString();
    }
}
