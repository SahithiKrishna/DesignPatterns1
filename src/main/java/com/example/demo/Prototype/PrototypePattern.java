package com.example.demo.Prototype;

import java.util.ArrayList;
import java.util.List;

//This pattern is used when the object creation is a costly operation and requires too much time and resource.
//Prototype pattern provides a mechanism to copy the original object to a new object and then modify it according to our needs. Prototype design pattern uses java cloning to copy the object.
//it’s not a good idea to create the Object using new keyword and load all the data again from database. The better approach would be to clone the existing object into a new object and then do the data manipulation.
//Prototype design pattern mandates that the Object which you are copying should provide the copying feature.
public class PrototypePattern implements Cloneable {
    private List<Integer> typeOfComp;

    public PrototypePattern(){
        typeOfComp = new ArrayList<>();
    }

    public PrototypePattern(List<Integer> typeOfCompList){
        this.typeOfComp = typeOfCompList;
    }

    public void loadData(){
        typeOfComp.add(1);
        typeOfComp.add(2);
        typeOfComp.add(69);
    }

    public List<Integer> getTypeOfComp(){
        return this.typeOfComp;
    }

    public Object clone() throws CloneNotSupportedException{
        List<Integer> newList = new ArrayList<>();
        for(int i: this.typeOfComp){
            newList.add(i);
        }
        return new PrototypePattern(newList);
    }
}
