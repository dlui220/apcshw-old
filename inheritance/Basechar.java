/* superclass of Warrior and Mage */
public class Basechar {
    private int health=20;
    private String name;

    public String toString(){
	return this.getName();
    }
    public void attack(Basechar other){
	//	System.out.println(this.getName()+" is attacking "+other.getName());
	System.out.println(this+" is attacking "+other);
    }
    /* 
    public Basechar(){
      name = "Derrick";
       }
    */
    public Basechar(String n){
	setName(n);
    }
    public void setName(String name){
	this.name = name;
    }
    public String getName(){
	return name;
    }
    public int getHealth() {
	return health;
    }
    public void setHealth(int i){
	health = i;
    }
    
}
