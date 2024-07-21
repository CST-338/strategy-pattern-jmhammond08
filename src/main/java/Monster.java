import java.util.HashMap;
import java.util.Objects;

/**
 * Represents a Monster with health points (hp), experience points (xp),
 * maximum health points (maxHP), and items it possesses.
 *
 * @author Jess Hammond
 * @version 1.0
 * GitHub Repo: https://github.com/CST-338/strategy-pattern-jmhammond08
 */

public class Monster {

    private Integer hp;
    private Integer xp = 10;
    private Integer maxHP;
    private HashMap<String, Integer> items;

    public Monster(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
        this.xp = xp;
        this.items = items;
        this.maxHP = maxHP;
        hp = this.maxHP;
    }

    //Gets and Sets HP
    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    //Gets and Sets Items
    public HashMap<String, Integer> getItems() {
        return items;
    }

    public void setItems(HashMap<String, Integer> items) {
        this.items = items;
    }

    //Gets XP
    public Integer getXp() {
        return xp;
    }

    //Gets Max HP
    public Integer getMaxHP() {
        return maxHP;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Monster monster = (Monster) o;
        return Objects.equals(getHp(), monster.getHp()) && Objects.equals(getXp(), monster.getXp()) && Objects.equals(getMaxHP(), monster.getMaxHP()) && Objects.equals(getItems(), monster.getItems());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHp(), getXp(), getMaxHP(), getItems());
    }

    //Displays the current health of the monster
    @Override
    public String toString() {
        return "hp=" + hp + "/" + maxHP ;
    }
}
