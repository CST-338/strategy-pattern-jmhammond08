package Monsters;

import java.util.HashMap;

/**
 * Represents a Kobold, a type of Monster, with specific characteristics inherited from Monster class.
 * An Imp has health points (hp), experience points (xp), maximum health points (maxHP), and items it possesses.
 * Inherits behavior and properties from the Monster class.
 *
 * @author Jess Hammond
 * @version 1.0
 * GitHub Repo: https://github.com/CST-338/strategy-pattern-jmhammond08
 */

public class Kobold extends Monster{

    public Kobold(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
        super(maxHP, xp, items);
    }

    @Override
    public String toString() {
        return "Kobold has: " + super.toString();
    }
}
