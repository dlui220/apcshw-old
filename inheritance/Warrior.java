/* subclass of Basechar */
public class Warrior extends Basechar{
    private int healthboost=5;
    
    public Warrior(String n){
	super(n);
	this.setName(n);
    }
    public int getHealth() {
	return healthboost + super.getHealth();
    }

    public void attack(Basechar other){
	System.out.println(this.getName()+" is super attacking "+other.getName());
    }
}
