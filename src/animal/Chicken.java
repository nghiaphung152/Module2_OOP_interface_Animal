package animal;
import edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: Cục xì lầu là ông bê lắp";
    }

    @Override
    public String howToEat() {
        return "mổ";
    }
}
