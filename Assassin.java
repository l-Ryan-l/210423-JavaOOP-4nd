public class Assassin extends Warrior<Knife> {
    public Assassin (String name, Knife knifeName, Defendable shield, int healthPoints) {
        super(name, knifeName, shield, healthPoints);
    }

    @Override
    public String toString() {
        return String.format("Assassin %s", super.toString());
    }

}
