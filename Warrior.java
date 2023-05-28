import java.util.Random;

public class Warrior<T extends Weapon> {
    private String name;
    protected T weapon;
    private int healthPoints;

    private Defendable defence;

    public int getHealthPoints() {
        return healthPoints;
    }
    public Defendable getDefendable() {
        return defence;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public T getWeapon() {
        return weapon;
    }

    public Warrior(String name, T weapon, Defendable defence, int healthPoints) {
        this.name = name;
        this.weapon = weapon;
        this.defence = defence;
        this.healthPoints = healthPoints;
    }

    @Override
    public String toString() {
        return String.format("name: %s, weapon: %s, defence: %s, health: %d", name, weapon, defence, healthPoints);
    }

    public int hit() {
        Random random = new Random();
        return random.nextInt(weapon.damage());
    }

    public int block() {
        Random random = new Random();
        return random.nextInt(0, defence.defence());
    }

}
