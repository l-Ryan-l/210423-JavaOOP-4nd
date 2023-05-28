import java.util.Random;

public class Shield extends Defend{
    public Shield(int defencePoints) {
        super(defencePoints);
    }

    @Override
    public String toString() {
        return String.format("%d", defencePoints);
    }

    @Override
    public int defence() {
        return 20;
    }
}
