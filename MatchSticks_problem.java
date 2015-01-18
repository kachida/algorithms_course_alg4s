package test.matchsticks;
import java.util.ArrayList;
import java.util.Collections;

public class MatchSticks {


    public int findMaxArea(int[] sticks) {
		//Write your code here

int maxarea=0;
    	ArrayList<Integer> al=new ArrayList<Integer>();
    	for(int i=0;i<sticks.length;i++)
    	{
    		al.add(sticks[i]);
    	}
    	Collections.sort(al);
    	maxarea=al.get(al.size()-1)*(al.get(al.size()-2));
    	
System.out.println(maxarea);

        return maxarea;


       
    }
   

    public static void main (String[] args) {
        //TestCase 1:
        try{
            int sticks[] = {4, 2, 4, 4, 8, 6};
            int max = new MatchSticks().findMaxArea(sticks);
            System.out.println(max);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        //TestCase 2:
        try{
            int sticks[] = {9, 9, 5, 6, 2, 10};
            int max = new MatchSticks().findMaxArea(sticks);
            System.out.println(max);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        //TestCase 3:
        try{
            int sticks[] = {9, 6, 5, 5, 3, 10};
            int max = new MatchSticks().findMaxArea(sticks);
            System.out.println(max);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}