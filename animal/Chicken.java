package animal;

import edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSond() {
        return "Chicken : cluck - cluck";
    }

    @Override
    public String howtoEat() {
        return "could be fried";
    }
}
