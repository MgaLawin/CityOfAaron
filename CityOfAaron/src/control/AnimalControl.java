package control;

import cityofaaron.CityOfAaron;
import model.Animal;
import control.GameControl;
import model.Game;
import model.Storehouse;

/**
 *
 * @author Jeremy
 */
public class AnimalControl {

    public AnimalControl() {
        //empty constructor
    }

    /**
     *
     * @return pass average age of animals
     */
//    public static Animal averageAgeOfAnimals() {
//        Game game = CityOfAaron.getCurrentGame();
//        Storehouse storehouse = game.getTheStorehouse();
//        Animal[] animals = storehouse.getAnimals();
//        if (animals == null) {
//            System.out.println("There are no animals in the Storehouse. Please add some.");
//        } else {
//            String animalName;
//            int animalQuantity;
//            int animalAge;
//            for (Animal animal : animals) {
//                animalName = animal.getName();
//                animalQuantity = animal.getQuantity();
//                animalAge = animal.getAge();
//                System.out.println("You have " + animalQuantity + " " + animalName + "s that are " + animalAge + " years old in the storehouse.\n");
//            }
//            int avgAge = 0;
//
//        }
//Find the average of a list
//average(list): number
//BEGIN
//total = 0
//  FOR index = 0 TO list.length -1
//  total = total + list[index]
//ENDFOR
//average = total / sizeOfList
//RETURN average
//END
}
