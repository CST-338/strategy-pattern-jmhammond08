package Monsters;

import Abilities.MeleeAttack;

import java.util.HashMap;

/**
 * Represents an Imp, a type of Monster, with specific characteristics inherited from Monster class.
 * An Imp has health points (hp), experience points (xp), maximum health points (maxHP), and items it possesses.
 * Inherits behavior and properties from the Monster class.
 *
 * @author Jess Hammond
 * @version 1.1
 * GitHub Repo: https://github.com/CST-338/strategy-pattern-jmhammond08
 */
public class Imp extends Monster{

    public Imp(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
        super(maxHP, xp, items);
        Integer maxStr = 15;
        Integer maxDef = 6;
        Integer maxAgi = 3;

        attack = new MeleeAttack(this);

        strength = super.getAttribute(strength, maxStr);
        defense = super.getAttribute(defense, maxDef);
        agility = super.getAttribute(agility, maxAgi);
    }

    @Override
    public String toString() {
        return "Imp has: " + super.toString();
    }
}
