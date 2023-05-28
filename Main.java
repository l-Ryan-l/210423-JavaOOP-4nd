public class Main {
    public static void main(String[] args) {
        Team<Archer> archerTeam = new Team<>();
        archerTeam.addToTeam(new Archer("Robin the Hood", new Bow(), new Shield(50), 100))
                .addToTeam(new Archer("Legolas", new Bow(), new Shield(50), 100));

        Team<Assassin> assassinTeam = new Team<>();
        assassinTeam.addToTeam(new Assassin("Altair", new Knife(), new Shield(50), 110))
                .addToTeam(new Assassin("Ecio", new Knife(), new Shield(50), 130));

        System.out.println(archerTeam);
        System.out.println(assassinTeam);
        System.out.println("----------");

        Battle firstBattle = new Battle(new Warrior("Naruto", new Knife(), new Shield(20), 50),
                new Warrior("Sasuke", new Knife(), new Shield(20), 50));

        Warrior winner = firstBattle.fight();
        System.out.printf("The winner is %s", winner);
    }
}
