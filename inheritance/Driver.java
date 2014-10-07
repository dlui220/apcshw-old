public class Driver {

    public static void main(String[] args){
	Basechar c = new Basechar();
	c.setHealth(150);
	System.out.println(c.getHealth());

	Warrior w = new Warrior();
	w.setHealth(500);
	System.out.println(w.getHealth());
	
	Warrior x = new Warrior();
	System.out.println(x.getHealth());

	Mage m = new Mage();
	System.out.println(m.getManna());

    }


}
