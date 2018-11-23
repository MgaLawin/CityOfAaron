package control;

import model.Map;
import model.Game;
import model.Point;
import model.Location;

/**
 *
 * @author chelseawaite
 */
public class MapControl {

    public MapControl() {
        //empty constructor
    }

    public static Map createMap() {

        Map map = new Map();
        int noOfRows = 5;
        int noOfColumns = 5;

        Location[][] locations = new Location[noOfRows][noOfColumns];

        locations[0][0] = new Location("R", "Ruler's Court", "You are now standing in the Ruler's Court.   This is where all the big decisions are made. Remember, if you let too many of your people starve...you'll get kicked out of office & game over.", new String[]{});
        locations[0][1] = new Location("S", "Storehouse", "You are standing in the City’s Granary and Storehouse. Here is where all the wheat is stored. Make sure you have enough to feed your people. It takes 20 bushels of wheat to feed one person. ", new String[]{});
        locations[0][2] = new Location("F", "Wheat Field", "“You are standing in one of the city’s wheat   fields. There is nothing but wheat as far as the eye can see. We hope to have a bountiful harvest this year.", new String[]{});
        locations[0][3] = new Location("U", "Undeveloped Land", "You are staining on undeveloped land.", new String[]{});
        locations[0][4] = new Location("U", "Undeveloped Land", "You are staining on undeveloped land.", new String[]{});

        locations[1][0] = new Location("U", "Undeveloped Land", "You are staining on undeveloped land.", new String[]{});
        locations[1][1] = new Location("V", "Village of Aaron", "This is the main village of Aaron. This is where you live and all of the major leaders. Make sure to feed your people well or you might not get to live here anymore. ", new String[]{});
        locations[1][2] = new Location("J", "Village of Jeremy", "You are walking through the Village of Jeremy. Rumor has it, Jeremey is planning to be the next ruler if you get kicked out of office. ", new String[]{});
        locations[1][3] = new Location("D", "Village of Deon", "The Village of Deon is the most beautiful village in all the land. They have never had a rat invasion before, but anything can happen. ", new String[]{});
        locations[1][4] = new Location("C", "Village of Chelsea", "You are in the Village of Chelsea. This village is next to the river and has some of the biggest wheat fields around! Wheat is your people’s main source of food. ", new String[]{});

        locations[2][0] = new Location("R", "River", "You are standing next to the river that flows through the City of Aaron. You use this river to irrigate your wheat fields. ", new String[]{});
        locations[2][1] = new Location("R", "River", "You are standing next to the river that flows through the City of Aaron. You use this river to irrigate your wheat fields. ", new String[]{});
        locations[2][2] = new Location("R", "River", "You are standing next to the river that flows through the City of Aaron. You use this river to irrigate your wheat fields. ", new String[]{});
        locations[2][3] = new Location("U", "Undeveloped Land", "You are staining on undeveloped land.", new String[]{});
        locations[2][4] = new Location("T", "Temple", "You are standing at the doors of the Temple. You and your people are blessed when the commandments of the Lord are followed. Paying titles and offerings will really help you and your people from going hungry. ", new String[]{});

        locations[3][0] = new Location("F", "Wheat Field", "“You are standing in one of the city’s wheat   fields. There is nothing but wheat as far as the eye can see. We hope to have a bountiful harvest this year.", new String[]{});
        locations[3][1] = new Location("F", "Wheat Field", "“You are standing in one of the city’s wheat   fields. There is nothing but wheat as far as the eye can see. We hope to have a bountiful harvest this year.", new String[]{});
        locations[3][2] = new Location("F", "Wheat Field", "“You are standing in one of the city’s wheat   fields. There is nothing but wheat as far as the eye can see. We hope to have a bountiful harvest this year.", new String[]{});
        locations[3][3] = new Location("R", "River", "You are standing next to the river that flows through the City of Aaron. You use this river to irrigate your wheat fields. ", new String[]{});
        locations[3][4] = new Location("F", "Wheat Field", "“You are standing in one of the city’s wheat fields. There is nothing but wheat as far as the eye can see. We hope to have a bountiful                       harvest this year.", new String[]{});

        locations[4][0] = new Location("U", "Undeveloped Land", "You are staining on undeveloped land.", new String[]{});
        locations[4][1] = new Location("W", "Watchtower", "The watchtower is used to watch for outside invasions. But remember, Laminites aren’t the only threat to your people. Rats often like to eat your food supply. ", new String[]{});
        locations[4][2] = new Location("R", "River", "You are standing next to the river that flows through the City of Aaron. You use this river to irrigate your wheat fields. ", new String[]{});
        locations[4][3] = new Location("U", "Undeveloped Land", "You are standing on undeveloped land.", new String[]{});
        locations[4][4] = new Location("B", "Border", "You are standing at the boarder of the Lamanite’s land. Be careful to not trespass!", new String[]{});

        //       map.setLocations(locations);
        Point point = new Point(2, 3);
        map.setCurrentLocation(point);

        return map;

    }
}
