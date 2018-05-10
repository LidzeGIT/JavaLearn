package javaapplication82;

import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

public class JavaApplication82 {
    
    public static void main(String[] args) {
       
        ArrayList<Person> simpleList= new ArrayList<>();
        simpleList.add(new Person("name1", 20));
        simpleList.add(new Person("name2", 30));
        
        ObservableList<Person> fxList = FXCollections.observableArrayList(simpleList);
        
        fxList.addListener(new ListChangeListener<Person>(){
            @Override
            public void onChanged(ListChangeListener.Change<? extends Person> c)  {
                while(c.next()){
                    if(c.wasAdded()){
                        for(Person p : c.getAddedSubList()){
                           // System.out.println("add: "+p);
                            simpleList.add(p);
                        }
                    }
                    if(c.wasRemoved()){
                        for(Person p : c.getRemoved()){
                            simpleList.remove(p);
                        }
                    }
                }
            }
            
        });
        
        fxList.add(new Person("name3", 40));
        fxList.get(1).age++;
        
        for( Person person : simpleList){
            System.out.println(person);
        }
        
    }

    public JavaApplication82() {
    }
    
}

class Person{
    
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + '}';
    }
    
    
    
    
}
