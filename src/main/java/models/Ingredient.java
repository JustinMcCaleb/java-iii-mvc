package models;

import java.io.Serializable;

public class Ingredient implements Serializable {

    // ******* CLASS PROPERTIES ********* //

    // id
    private long id;
    // ingredient name (title) i.e. "pickles", "cheese", etc
    private String title;
    // how many of this? 3 pickles? 2 slices of cheese?
    private int quantity;

    // ******* CONSTRUCTOR ********* //

    // zero-argument constructor, so Java can reserve space in memory for this when we finally create it! (It can hold the place in memory while we define things like 'title', 'quantity', etc)
    public Ingredient() {};

    // ******* GETTERS AND SETTERS ********* //

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
}
