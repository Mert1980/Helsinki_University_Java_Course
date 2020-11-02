
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }
    
    public boolean equals(Object compared){
        // if the variables are located in the same place, they are the same
        if(this == compared){
            return true;
        }
        // if the compared object is not an instance of Person, they are not the same
        if(!(compared instanceof Person)){
            return false;
        }
        
        // cast the object to Person object
        Person comparedObject = (Person) compared;
        
        // if the object's values are the same, the objects are the same
        if(this.name.equals(comparedObject.name) &&
           this.birthday.equals(comparedObject.birthday) &&
                this.height == comparedObject.height &&
                this.weight == comparedObject.weight){
            return true;
        }
        // otherwise, the objects are not the same
        return false;
    }

    // implement an equals method here for checking the equality of objects
}
