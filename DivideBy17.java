/*Измислих си едно число – 8589935681. Чудя се дали се дели на 17.
Напишете програма, която проверява дали числото се дели на 17.
И ако е така – напишете на екрана yes,в противен случай напишете no.
Подсказка – използвайте операторите ‘остатък от делене’ и ternary оператор.
*/
package UNLOCKJAVA.Week1.Homework1;
public class DivideBy17 {
    public static void main(String[] args){
        long num=8589935681L;
       String result=(num%17==0) ? "yes" : "no";
        System.out.println(result);


    }
}
