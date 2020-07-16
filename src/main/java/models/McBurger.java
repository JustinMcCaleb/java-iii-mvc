package models;

import java.io.Serializable;
import java.util.List;

public class McBurger implements Serializable {

    // ******* CLASS PROPERTIES ********* //

    // id
    private long id;
    // burger name (title)
    private String title;
    // price in cents
    private long priceInCents;
    // description
    private String description;
    // ingredients
    private List<Ingredient> ingredients;

    // ******* CONSTRUCTOR ********* //

    // zero-argument constructor, so Java can reserve space in memory for this when we finally create it! (It can hold the place in memory while we define things like 'title', 'ingredients', etc)
    public McBurger() {}

    // ******* GETTERS AND SETTERS ********* //
    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public long getPriceInCents() { return priceInCents; }
    public void setPriceInCents(long priceInCents) { this.priceInCents = priceInCents; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public List<Ingredient> getIngredients() { return ingredients; }
    public void setIngredients(List<Ingredient> ingredients) { this.ingredients = ingredients; }
}
