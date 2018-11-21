package model;

import java.io.Serializable;

/**
 *
 * @author Jeremy
 */
public class Author implements Serializable {

    private String name;
    private String title;

    public Author() {
        // empty constructor for Javabeans
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Author{"
            + "name" + name
            + "title" + title
            + "}";
    }

}
