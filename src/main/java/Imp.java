import java.util.HashMap;

public class Imp extends Monster{
    public Imp(Integer xp, HashMap<String, Integer> items, Integer maxHP) {
        super(xp, items, maxHP);
    }

    @Override
    public String toString() {
        return "Imp has: " + super.toString();
    }
}
