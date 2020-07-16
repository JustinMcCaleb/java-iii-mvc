package models;

public interface Ingredients {
    // This interface says that any class who implements it, MUST have all these methods!
    Ingredient findById(long id);

    // if we create one, return the ID so we can do stuff with it!
    long createIngredient(Ingredient ingredient);
}
