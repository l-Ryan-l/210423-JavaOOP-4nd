import java.util.ArrayList;
import java.util.List;

public class Team <T extends Warrior> {
    List<T> team = new ArrayList<>();
    public Team<T> addToTeam(T warrior) {
        team.add(warrior);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder warriorsSb = new StringBuilder();
        for (T i: team) {
            warriorsSb.append(i);
            warriorsSb.append("\n");
        }
        warriorsSb.append(String.format("Team's Health: %d, Team's damage: %d, Team's range: %d",
                healsPoints(), damagePoints(), maxRange()));
        return warriorsSb.toString();
    }

    public int healsPoints() {
        int sum = 0;
        for(T i : team) {
            sum += i.getHealthPoints();
        }
        return sum;
    }

    public int damagePoints() {
        int sumOfDamage = 0;
        for (T i: team) {
            sumOfDamage += i.getWeapon().damage();
        }
        return sumOfDamage;
    }

    public int maxRange() {
        int max = 0;
        for(T i : team) {
            if (i instanceof Archer) {
                if (max < ((Archer) i).range()) {
                    max = ((Archer) i).range();
                }
            }
        }
        return max;
    }


}
