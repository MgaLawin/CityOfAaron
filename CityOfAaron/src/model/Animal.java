package model;

import java.io.Serializable;

/**
 *
 * @author Deon
 */
public class Animal extends InventoryItem {

    private int age;

    public Animal(int age) {
        setAge(age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" + "age=" + age + '}';
    }

}
