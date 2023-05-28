public class Bow implements Weapon {
    public int damage() {
        return 20;
    }

    public int range() {
        return 50;
    }

    @Override
    public String toString() {
        return String.format("Bow, damage: %d, Bow range: %d", damage(), range());
    }
}
