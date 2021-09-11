package src.catedras.clase3;

public abstract class AbstractTank {
    private double cooldown;
    private int damage;

    public AbstractTank(double aCooldown, int aDamage){
        this.cooldown = aCooldown;
        this.damage = aDamage;
    }

    public double getCooldown(){
        return this.cooldown;
    }

    public int getDamage(){
        return this.damage;
    }

    public String toString(){
        return "Cooldown: " + this.getCooldown() + " Damage: " +  this.getDamage();
    }

}
