public class Knife implements Weapon{
    public int damage() {
        return 30;
    }

    @Override
    public String toString() {
        return String.format("Knife, damage: %d", damage());
    }
}
