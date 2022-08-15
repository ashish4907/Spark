package PUBG;

public class Player {
    String name;

    void play() {
        Game game = new Game();
        Weapon weapon = game.pressButton(this.name);

        if (weapon == null) {
            System.out.println("Player not found");
            return;
        }

        if (weapon instanceof Gun) {
            Gun gun = (Gun) weapon;
            gun.load();
        }

        if (weapon instanceof Knife) {
            Knife knife = (Knife) weapon;
            knife.sharpenKnife();
        }

        weapon.use();
    }
}
