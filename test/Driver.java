public class Driver {
    public static void main(String[] args){
	Basechar b = new Basechar();
	System.out.println(b.getName());
	Warrior w = new Warrior();
	System.out.println(w.getName());
	w.setName("Derrick");
	b.setName("Jeanne");
	System.out.println(b.getName());
	System.out.println(w.getName());
    }
}
