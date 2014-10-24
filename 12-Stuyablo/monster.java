import java.util.*;
import java.io.*;

public class monster extends basechar { 
    Random r = new Random(); 
    
    public monster() { 
	setHealth(120 + r.nextInt(20));
	setStrength(80 + r.nextInt(20));
	setSpeed(45 + r.nextInt(20));
	setMana(80 + r.nextInt(20));
        
	setName("Orc");
    }
    public monster(String n ) {
	setHealth(120 + r.nextInt(20));
	setStrength(80 + r.nextInt(20));
	setSpeed(45 + r.nextInt(20));
	setMana(80 + r.nextInt(20));

	setName(n);
    }
   
	
    public void evilattack(basechar other) {
	this.setAttackStrength(this.getStrength()/10- r.nextInt(20));
	//other.setHealth(other.getHealth() - damage);
	System.out.println(this + "EvilAtacked"+other);
	//System.out.println(other +"lost"+damage+"damage!!");
	other.setDefending(true);
    } 
    public void darkmagic(basechar other) {
	this.setAttackStrength(this.getStrength()/10- r.nextInt(20));
	//this.setManna(this.getManna() / 2);
	//other.setHealth(other.getHealth() - damage);
	System.out.println(this + "used DARKMAGIC on"+other);
	//System.out.println(other +"lost"+damage+"damage!!");
	other.setDefending(true);
	    }
    public void dodge(basechar other) 
    {
	System.out.println(this.getName() + " is trying to DODGE " + other.getName() + "'s attack");
	boolean success = r.nextInt(20) <= this.getSpeed() / 100;
	if (success)
	    {
		other.setAttackStrength(0);
		System.out.println("DODGE was effective! No damage is taken!");
	    }
	else
	    {
	    System.out.println("DODGE failed. " + this.getName() + " took damage");
	    other.assignDamage(this);
	    }
    }
    public void block(basechar other)
    {
	
	System.out.println(this.getName() + " BLOCKS " + other.getName() + "'s attack");
	other.lowerAttackStrength(this.getStrength()/11 + r.nextInt(10));
	if (other.getAttackStrength() < 15)
	    {
		System.out.println(this.getName() + "'s block was super effective!");
	    }
	if (other.getAttackStrength() > 25)
	    {
		System.out.println(this.getName() + "'s block didn't work very well....");
	    }
	other.assignDamage(this);
	
    }
    public void heal(basechar other)
    {
	other.assignDamage(this);
	System.out.println(this.getName() + " is HEALING");
	    if (this.getHealth() == 0)
		{
		    System.out.println(this.getName() + " was killed while HEALING");
		}
	    this.increaseHealth(this.getMana()/10 + r.nextInt(10));
    }
	
}
