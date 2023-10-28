import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> garbageVolume = new ArrayList<>();
        System.out.println("Enter the amount of garbage at each station (in kg), enter 'q' to finish:");
        while (sc.hasNextInt()) {
            garbageVolume.add(sc.nextInt());
        }
        countMoney(garbageVolume);
    }
    
    public static void countMoney(ArrayList<Integer> a){
        int carVolume = 0;
        double time = 0;
        int i=0;
        int d = 0; 
        while (i < a.size()) {
            carVolume+= a.get(i);
            if(carVolume < 10000){
                time += 8;
                i+=1;
            }else{
                time += 30;
                carVolume = 0;
                d+=1;
            }
        }
        d+=1;
        time +=30;
        double totalTime = time/60;
        double totalmoney = (totalTime*120000) + (d*57000);
        System.out.println("Total money: " + totalmoney);
        
    }

}
