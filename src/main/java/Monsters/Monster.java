package Monsters;

import Abilities.Attack;

import java.util.HashMap;
import java.util.Objects;
import java.util.Random;

/**
 * Represents a Monster with health points (hp), experience points (xp),
 * maximum health points (maxHP), and items it possesses.
 *
 * @author Jess Hammond
 * @version 1.1
 * GitHub Repo: https://github.com/CST-338/strategy-pattern-jmhammond08
 */

public class Monster {

    private Integer hp;
    private Integer xp = 10;
    private Integer maxHP;
    private HashMap<String, Integer> items;

    Integer agility = 10;
    Integer defense = 10;
    Integer strength = 10;
    Attack attack;


    public Monster(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
        this.xp = xp;
        this.items = items;
        this.maxHP = maxHP;
        hp = this.maxHP;
        this.attack = attack;
    }

    //Gets agility
    public Integer getAgi() {
        return agility;
    }

    //Gets defense
    public Integer getDef() {
        return defense;
    }

    //Gets strength
    public Integer getStr() {
        return strength;
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

    Integer getAttribute(Integer min, Integer max) {
       Random rand = new Random();
       if(min>max){
           Integer temp = min;
           min = max;
           max = temp;
       }
       return rand.nextInt(max - min) + min;
    }

    public boolean takeDamage(Integer damage) {
        if(damage>0){
            hp -= damage;
            System.out.println("The creature was hit for " + damage + " damage.");
        }

        if(hp<=0){
            hp = 0;
            System.out.println("Oh no! The creature has perished.");
            System.out.println(this.toString());
            return false;
        }
        System.out.println(this.toString());
        return true;
    }

    public Integer attackTarget(Monster target) {
        Integer damage = attack.attack(target);
        if (target.takeDamage(damage)) {
            return 0;
        }
        else return 1;
    }
}
