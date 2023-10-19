/*Напишете програма, в която дефинирате 2 int променливи – month & day.
Програмата трябва да отпечатва true, ако денят е между 20-ти март (включително)
и 20-ти юни (включително) и false,в противен случай.
Нека:
month = 5
day = 1
 */
package UNLOCKJAVA.Week1.Homework1;
public class SpringSeason {
    public static void main (String[] args){
        int month=5;
        int day=1;
        boolean monthDay=(month == 3 && day >= 20) || (month > 3 && month < 6) || (month == 6 && day <= 20) ? true:false;
        System.out.println(monthDay);

    }
}
