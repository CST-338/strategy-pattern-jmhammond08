package Abilities;

import Monsters.Monster;

import java.util.Random;

/**
 * The RangedAttack class implements the Attack interface to represent a ranged attack action
 * performed by a Monster.
 *
 * @author Jess Hammond
 * @version 1.0
 * GitHub Repo: https://github.com/CST-338/strategy-pattern-jmhammond08
 */

 class RangedAttack implements Attack{

    Monster attacker;

    public RangedAttack(Monster attacker) {
        this.attacker = attacker;
    }

    @Override
    public Integer attack(Monster target) {
        String message = attacker + " uses a ranged attack on " + target;
        System.out.println(message);
        return attacker.getAgi() - target.getAgi();
    }
}
