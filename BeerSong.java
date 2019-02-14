package Assignment2;

/**
 * Created by ChiliChinchilla on 2/13/2019.
 */
public class BeerSong {
    public static void main(String[] args){
        playSong();
    }

    public static void playSong() {
    	int bottles = 99;
    	String plur = "bottles";
    	
    	while (bottles > 0) {
    		
    		System.out.println(bottles + " " + plur + " of beer on the wall, " + bottles + " " + plur + " of beer");
    		bottles--;
    		
    		if (bottles == 1)
    			plur = "bottle";
    		else
    			plur = "bottles";
    		
    		if (bottles == 0)
    			System.out.println("Take one down, pass it around, no more bottles of beer on the wall.");
    		else
    			System.out.println("Take one down, pass it around, " + bottles + " " + plur + " of beer on the wall.");
    	}
    }
}