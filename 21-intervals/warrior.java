import java.util.Random;
import java.util.*;
public class warrior extends basechar implements Comparable
{
    Random randomNumber = new Random();
    public warrior(String n)
    {
	setStrength(90 + randomNumber.nextInt(20));
	setHealth(140 + randomNumber.nextInt(20));
	setSpeed(40 + randomNumber.nextInt(20));
	setName(n);
    }
    public void bash(basechar other)
    {
	this.setAttackStrength(this.getStrength()/10 + randomNumber.nextInt(20)); 
	System.out.println(this.getName() + " BASHES " +other);
	other.setDefending(true);
    }
    /* 
     Bash sets the attack strength, which is one tenth of the strength + a random integer from 0 to 20.
     After it sets the attack strength, it sets the opponent's defending variable to true. This will trigger the opponent to defend.
     When the opponent attacks, a similar thing happens. The defending variable is set to true, thus triggering the option of using your shield. 
     Maybe we should add more defense methods? The defense method then reduces the attack strength by a certain amount. I put it as strength/9 + random int from 0 to 20.
     Finally, the damage is given 
    */
    public void block(basechar other)
    {
	System.out.println(this.getName() + " BLOCKS " + other.getName() + "'s attack");
	other.lowerAttackStrength(this.getStrength()/9 + randomNumber.nextInt(20));
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
    public void run (basechar other)
    {
	boolean escape = randomNumber.nextInt(150) < this.getStrength();
	if (escape) 
	    {
		System.out.println(this.getName() + " knocked over " + other.getName() + " and fled successfully");
	    }
	else
	    {
		System.out.println("RUN failed...");
	    }
	other.setAttackStrength(0);
    }

    public int compareTo(Object other){
	warrior a = (warrior)other;
	return this.toString().compareTo(a.toString());
    }

   public static void main(String[] args) {
        warrior a = new warrior("A");
        warrior b = new warrior("B");
	warrior c = new warrior("C");
        warrior[] array = {b, a, c};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
