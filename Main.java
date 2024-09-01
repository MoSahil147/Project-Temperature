import java.util.*;
class Main {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("How many Days Temperature? ");
    int numDays = sc.nextInt(); //taking number of days
    // int x = (numDays-1);
    int[] temps = new int[numDays];
    // record the temp and finding average
    int sum = 0;
    for(int i=0; i<numDays; i++) {
        System.out.print("Enter Temperature for Day " + (i+1) + ": "); //taking temperature of a day
        temps[i] = sc.nextInt();
        sum += temps[i]; //taking the sum of all entered temperatures
    }

    double average = sum/numDays;
    //count days above average
    int above = 0;
    for(int i=0; i<temps.length; i++){
       if(temps[i]>average){
        above++;
       } 
    }
    System.out.println();
    System.out.println("Average Temperature: " + average);
    System.out.println(above + "days above average temperature");
    }
}