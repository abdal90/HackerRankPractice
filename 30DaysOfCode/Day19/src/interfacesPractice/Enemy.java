package interfacesPractice;

public class Enemy implements Character {

    public String weapon;

    public Enemy() {
        weapon = "light saber";
    }

    @Override
    public void attack() {
        System.out.println("The enemy attacks you");
    }

    @Override
    public void heal() {
        System.out.println("The enemy heals himself");
    }

    @Override
    public String getWeapon() {
        return weapon;
    }

    public void weaponDraw(){
        System.out.println("Draw out weapon");
    }
}
