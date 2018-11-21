package model;

import java.io.Serializable;

/**
 *
 * @author chelseawaite
 */
public class Location extends Map implements Serializable {

    private String name;
    private String description;
    private String mapSymbol;
    private String[] gameTips;

    public Location() {
        // empty constructor for Javabeans
    }
    
    public Location(String mapSymbol, String name, String description, String[] tips){
        setMapSymbol (mapSymbol);
        setName(name);
        setDescription(description);
        setGameTips(tips);
}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMapSymbol() {
        return mapSymbol;
    }

    public void setMapSymbol(String symbol) {
        this.description = description;
    }

    public String[] getGameTips() {
        return gameTips;
    }

    public void setGameTips(String[] tips) {
        this.gameTips = gameTips;
    }

    @Override
    public String toString() {
        return "Location{"
            + "name" + name
            + ", description" + description
            + ", mapSymbols" + mapSymbol
            + ", gameTips" + gameTips
            + "}";
    }

}
