package PUBG;

public class Gun extends Weapon {
    @Override
    public void use() {
        System.out.println("Trigger the Gun");
    }

    public void load() {
        System.out.println("Loading the Gun");
    }
}
