import java.util.*;

public class Arraystuff {
    private int[] a;
    private Random rnd;
    /* by making a variable final we can't change
       the value after the initial asssignment 
    */
    public final int final_example = 123;
 
    public Arraystuff(int n){
	rnd = new Random();
	a = new int[n];
	for (int i=0;i<a.length;i++){
	    a[i] = 75+rnd.nextInt(76);
	}
    }
    
    public Arraystuff() {
	this(100);
    }

    public String toString(){
	String s="";
	for (int i=0;i<a.length;i++){
	    s=s+a[i]+", ";
	}
	return s;
    }

    public int find(int n){
	int result = 0;
	boolean found = false;
	for (int i=0;i<a.length;i++){
	    if (a[i] == n) {
		result = i + 1;
		break;
	    } else { 
		result = -1;
	    }	    
	}
	return result;
	
    }

    public int maxVal(){
	int result =a[0];
	for (int i=1;i<a.length;i++){
	    if (a[i]>result){
		result = a[i];
	    }
	}
	return result;
    }

    public int freq(int n){
	int result = 0;
	for (int i=1;i<a.length;i++) {
	    if (a[i] == n) {
		result++;
		}
	}
	return result;
    }

    public int sum67(int[] nums) {
	int result = 0;
	boolean count = true;
	if (nums.length == 0) {
	    result = 0;
	}
	for (int i=0;i<nums.length;i++){
	    if (nums[i] == 6) {
		count = false;
	    }
	    if (count) {
		result = result + nums[i];
	    }
	    if (nums[i] == 7) {
		count = true;
	    }
 
	}
	return result;
    }
 
    public boolean more14(int[] nums) {
	int count1 = 0;
	int count4 = 0;
	for (int i=0;i<nums.length;i++){
	    if (nums[i] == 1) {
		count1++;
	    }
	    if (nums[i] == 4) {
		count4++;
	    }
	}
	if (count1 > count4) {
	    return true;
	} else {
	    return false;
	}
    }

    public int[] tenRun(int[] nums) {
	int[] ans;
	ans = new int[nums.length];
	boolean mult = false;
	int multi = 0;
	for (int i=0; i<nums.length; i++){
	    if (mult ==false){
		ans[i] = nums[i];
	    }
	    if (nums[i]%10 == 0){
		mult = true;
		multi = nums[i];
	    }
	    if (mult){
		ans[i] = multi;
	    }
	}
	return ans;
    }


    public boolean tripleUp(int[] nums) {
	int count = 0;
	for (int i=0; i<(nums.length-1); i++){
	    if ((nums[i] + 1) == nums[i+1]){
		count = count + 1;
	    }
	    if ((nums[i] + 1) != nums[i+1]){
		count = 0;
	    }
	    if (count == 2){
		return true;
	    }
    
	}
	return false;
    }


    public boolean canBalance(int[] nums) {
	int left = 0;
   
	for (int i = 0; i < nums.length; i++) {
	    left += nums[i];
	    int right = 0;
	    for (int j = nums.length-1; j > i; j--) {
		right += nums[j];
	    }
	    if (right == left)
		return true;
	}
	return false;
    }



    public int[] seriesUp(int n) {
	int[] ans = new int[n * (n + 1) / 2];
	int pos = 0;
	for (int i=1; i <= n + 1; i++) {
	    for (int j = 1; j < i; j++) ans[pos++] = j;

	}
	return ans;
    }


    public static void main(String[] args) {
	Arraystuff as = new Arraystuff();
	System.out.println(as);
	System.out.println(as.find(100));
	System.out.println(as.maxVal());
	System.out.println(as.freq(100));
	
    }


}
