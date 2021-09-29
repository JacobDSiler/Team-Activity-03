package teamactivity;

public class Player {
    private String name;
    private int health;
    private int mana;
    private int gold;

    private Map<String, Integer> equipment;

    public Player(String name, int health, int mana, int gold) {
        this.name = name;
        this. health = health;
        this.mana = mana;
        this.gold = gold;

        this. equipment = new HashMap<>();
    }

    public String toString() {
        return String.format("Player %s has %d health, %d mana, and %d gold.\nThey are holding %d items.\n",
                name, health, mana, gold, equipment.size());
    }

    public void addEquipment(String itemName, int itemValue) {
        equipment.put(itemName, itemValue);
    }
}
