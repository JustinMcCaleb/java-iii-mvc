package models;

public interface McBurgers {

    // This interface says that any class who implements it, MUST have all these methods!
    McBurger findById(long id);

    // if we create one, return the ID so we can do stuff with it!
    long createBurger(McBurger burger);
}
