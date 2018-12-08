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

    public static String averageAgeOfAnimals() {
        String animalsAgeAvg2;
        String animalsAgeAvg3 = null;
//        Game game = GameControl.createNewGame("NoPlayerName");
        Game game = CityOfAaron.getCurrentGame();
        Storehouse storehouse = game.getTheStorehouse();
        Animal[] animals = storehouse.getAnimals();
        if (animals == null) {
            animalsAgeAvg2 = ("There are no animals in the Storehouse. Please add some.");
        } else {
            String animalName;
            int animalQuantity;
            int animalAge;
            int animalTotalAge = 0;
            int animalTotalQty = 0;
            for (Animal animal : animals) {
                animalName = animal.getname();
                animalQuantity = animal.getquantity();
                animalAge = animal.getAge();
                animalTotalQty += animalQuantity;
                animalTotalAge = (animalQuantity * animalAge) + animalTotalAge;
            }
            int animalTotalAgeAvg = animalTotalAge / animalTotalQty;

            animalsAgeAvg3 = ("The cumulative average of the age of all of your animals is: " + animalTotalAgeAvg + ".\n");

        }
        return "-----------------------\n"
                + animalsAgeAvg3 + "\n";
    }

    public static String animalsInStorehouse() {
        String animalReport = null;
        Game game = CityOfAaron.getCurrentGame();
        Storehouse storehouse = game.getTheStorehouse();
        Animal[] animals = storehouse.getAnimals();
        if (animals == null) {
            animalReport = ("There are no animals in the Storehouse. Please add some.");
        } else {
            String animalName;
            int animalQuantity;
            int animalAge;

            for (Animal animal : animals) {
                animalName = animal.getname();
                animalQuantity = animal.getquantity();
                animalAge = animal.getAge();
                animalReport = ("You have " + animalQuantity + " " + animalName + "s that are " + animalAge + " years old in the storehouse.\n");

            }

        }
        return "-----------------------\n"
                + animalReport + "\n";
    }

}
