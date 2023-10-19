/*Напишете програма, в която дефинирате 2 int променливи – month & day.
Програмата трябва да отпечатва true, ако денят е между 20-ти март (включително)
 и 20-ти юни (включително) и false, в противен случай.
Нека:
month = 4
day = 31
Проверихте ли внимателно какви са ви входните данни?
 Ами ако въведа ден 31 на месец, който няма 31 дни? Или пък въведа дата 40-ти май?
 */
package UNLOCKJAVA.Week1.Homework1;
public class SpringSeason2 {
    public static void main(String[]args){
        int month=4;
        int day=31;
        boolean monthDay=(month >= 1 && month <= 12) && ((month == 2 && day >= 1 && day <= 28) && ((month == 4 || month == 6 || month == 9 || month == 11) && (day >= 1 && day <= 30))) ? true : false;
        System.out.println(monthDay);

    }
}
