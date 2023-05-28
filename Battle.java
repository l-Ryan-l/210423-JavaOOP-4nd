public class Battle {
    private Warrior one;
    private Warrior two;

    public Battle (Warrior one, Warrior two) {
        this.one = one;
        this.two = two;
    }

    public Warrior fight() {
        while (one.getHealthPoints() > 0 && two.getHealthPoints() > 0) {
            int hitOne = one.hit();
            int defendTwo = two.block();
            System.out.printf("The first warrior hit with %d damage. \n", hitOne);
            two.setHealthPoints(two.getHealthPoints() - hitOne);
            if (defendTwo > hitOne) {
                defendTwo = hitOne;
            }
            System.out.printf("The second warrior block %d damage points. \n", defendTwo);
            two.setHealthPoints(two.getHealthPoints() + defendTwo);
            System.out.printf("The second warrior's health points now: %d. \n", two.getHealthPoints());
            if (two.getHealthPoints() <= 0) {
                return one;
            }
            int hitTwo = two.hit();
            int defendOne = one.block();
            System.out.printf("The second warrior hit with %d damage. \n", hitTwo);
            if (defendOne > hitTwo) {
                defendOne = hitTwo;
            }
            System.out.printf("The first warrior block %d damage points. \n", defendOne);
            one.setHealthPoints(one.getHealthPoints() - hitTwo);
            one.setHealthPoints(one.getHealthPoints() + defendOne);
            System.out.printf("The first warrior's health points now: %d. \n", one.getHealthPoints());



        }
        return two;
    }
}
