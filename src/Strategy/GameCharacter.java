package Strategy;

import java.util.Optional;

public class GameCharacter {
    private Weapon weapon;

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        // delegate
        Optional.ofNullable(weapon).ifPresent(weapon1 -> weapon1.attack());
    }

    public static void main(String[] args) {
        GameCharacter gameCharacter = new GameCharacter();
        gameCharacter.setWeapon(new Knife());
        gameCharacter.attack();

    }
}
