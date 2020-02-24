public class Monster {

    private String name;
    private int hitPoints;
    private int armorClass;
    private int attackDamage;

    public Monster(String name, int hitPoints, int armorClass, int attackDamage) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.armorClass = armorClass;
        this.attackDamage = attackDamage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", armorClass=" + armorClass +
                ", attackDamage=" + attackDamage +
                '}';
    }
}//End Class
