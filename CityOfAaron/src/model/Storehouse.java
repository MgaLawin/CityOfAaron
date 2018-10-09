/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Jeremy
 */
public class Storehouse implements Serializable {

    private Author[] authors;
    private Animal[] animals;
    private InventoryItem[] tools;
    private Provision[] provisions;

    public Storehouse() {
        // empty constructor for Javabeans
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(

        (Animal[] animals) {
        this.animals = animals;
    }

    @Override
    public String toString() {
        return "Storehouse{"
                + "authors" + author
                + "animals" + animal
                + "mapSymbols" + mapSymbol
                + "gameTips" + gameTips
                + "}";
    }

}
