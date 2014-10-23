/* superclass of Warrior and Mage */
public class Basechar {
    private int health=20;
    private String name;
    private int manna;
    public String toString(){
	return this.getName();
    }
    public void attack(Basechar other){
	//	System.out.println(this.getName()+" is attacking "+other.getName());
	System.out.println(this+" is attacking "+other);
    }
<<<<<<< HEAD
     public Basechar(){
	name = "Default";
	}
     public void setName(String name){
=======
    /* 
    public Basechar(){
      name = "Derrick";
       }
    */
    public Basechar(String n){
	setName(n);
    }
    public void setName(String name){
>>>>>>> e72a37daf5793807b2e109318eb0f4b7ed8667bd
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
