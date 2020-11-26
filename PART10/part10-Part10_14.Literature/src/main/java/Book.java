/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mertdemirok
 */
public class Book implements Comparable<Book> {
    private String name;
    private int age;

    public Book(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (recommended for " + age + " years olds or older)";
    }
    
@Override
    public int compareTo(Book o) {
        if (this.age == o.age) {
            return this.name.compareTo(o.name);
        }
 
        return this.age - o.age;
    }
}
