import java.util.HashMap;

public class Kobold extends Monster{
    public Kobold(Integer xp, HashMap<String, Integer> items, Integer maxHP) {
        super(xp, items, maxHP);
    }

    @Override
    public String toString() {
        return "Kobold has: " + super.toString();
    }
}
