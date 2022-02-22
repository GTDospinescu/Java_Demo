package InterfacesAndAbstractClasses;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public List<String> write() {
        List<String> playerStats = new ArrayList<>();
        playerStats.add(name);
        playerStats.add(Integer.toString(hitPoints));
        playerStats.add(Integer.toString(strength));
        return playerStats;
    }

    @Override
    public void read(List<String> list) {
        if ((list != null) && !list.isEmpty()) {
            name = list.get(0);
            hitPoints = Integer.parseInt(list.get(1));
            strength = Integer.parseInt(list.get(2));
        }
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + getName() + "', " +
                "hitPoints='" + getHitPoints() + "', "+
                "strength='" + getStrength() + "'}";
    }
}
