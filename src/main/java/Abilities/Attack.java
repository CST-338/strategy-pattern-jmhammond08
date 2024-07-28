package Abilities;

/**
 * The Attack interface extends the Ability interface and represents an ability to attack.
 * Classes implementing this interface should provide concrete implementations for attacking a target.
 *
 * @author Jess Hammond
 * @version 1.0
 * GitHub Repo: https://github.com/CST-338/strategy-pattern-jmhammond08
 */

public interface Attack extends Ability {
    public abstract Integer attack(Monster target);
}
