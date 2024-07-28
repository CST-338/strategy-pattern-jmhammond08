package Monsters;

import java.util.HashMap;

/**
 * Represents an Imp, a type of Monster, with specific characteristics inherited from Monster class.
 * An Imp has health points (hp), experience points (xp), maximum health points (maxHP), and items it possesses.
 * Inherits behavior and properties from the Monster class.
 *
 * @author Jess Hammond
 * @version 1.0
 * GitHub Repo: https://github.com/CST-338/strategy-pattern-jmhammond08
 */
public class Imp extends Monster{

    public Imp(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
        super(maxHP, xp, items);
    }

    @Override
    public String toString() {
        return "Imp has: " + super.toString();
    }
}
