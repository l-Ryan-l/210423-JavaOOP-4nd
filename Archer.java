import java.util.Random;

public class Archer extends Warrior<Bow>{
    public Archer(String name, Bow bowName, Defendable sheild, int healthPoints) {
        super(name, bowName, sheild, healthPoints);
    }

    int range() {
        Random random = new Random();
        return random.nextInt((weapon).range());
    }

    @Override
    public String toString() {
        return String.format("Archer's %s", super.toString());
    }
}
