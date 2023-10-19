/*Направете програма BMI, с която да изчислите моя Body Mass Index.
Аз тежа 80кг и съм висок 171см.
Ако съм съм надвишил малко теглото и съм Overweight напишете на екрана more training, less eating,
 ако не съм – напишете you rock!
 */
package UNLOCKJAVA.Week1.Homework1;

public class BMI {
    public static void main(String[] args){
        double kg=80;
        double heightSm=171;
        double heightM=heightSm/100;
        double bmi=kg/(Math.pow(heightM,2));
        System.out.println(bmi>=25 ? "more training, less eating":" you rock!");
    }
}
