package ru.tree.famely_tree;
import ru.tree.human.Human;

import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
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
}
