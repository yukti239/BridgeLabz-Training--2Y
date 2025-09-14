
import java.util.*;
public class FootballTeamHeights {
    public static void main(String[] args) {
        int[] heights = new int[11];
        Random rand = new Random();
        for(int i=0;i<11;i++) heights[i] = rand.nextInt(101)+150;
        int sum = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int h:heights){sum+=h; if(h<min)min=h; if(h>max)max=h;}
        double mean = sum/11.0;
        System.out.println("Shortest:"+min+" Tallest:"+max+" Mean:"+mean);
    }
}
