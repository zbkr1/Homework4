/*  Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.LinkedList;


public class Homework4 {

    public static void main(String[] args) {

        int[] listMas = {5,3,2,6,7,4,9, 1};
        LinkedList<Integer> linkList = new LinkedList<>();

        for (Integer temp : listMas) {
            linkList.add(temp);
        }
        
        int temp = 0;
        while (temp != linkList.size() - 1) {
            linkList.add(linkList.size()-temp, linkList.getFirst());
            linkList.removeFirst();
            temp++;
        }


        System.out.println("linkList = " + linkList);

        
    }
}  */

/* Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() - помещает элемент в конец очереди, 
dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя. 


import java.util.LinkedList;


public class Homework4 {

    public static void main(String[] args) {

        int[] list = { 3, 5, 7, 2, 4, 6 };

        LinkedList<Integer> linkList = new LinkedList<>();
        for (Integer temp : list) {
            linkList.add(temp);
        }

        System.out.println(linkList);

        enqueue(linkList, 9);
        System.out.println(linkList);

        System.out.println(dequeue(linkList));
        System.out.println(linkList);

        System.out.println(first(linkList));
    }

    public static void enqueue(LinkedList<Integer> list, int num) {
        list.addLast(num);
    }

    public static int dequeue(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        list.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        return num;
    }
}   */

/* В калькулятор добавьте возможность отменить последнюю операцию 

import java.util.Scanner;
import java.util.Stack;


public class Homework4 {


    public static void main(String[] args) throws Exception {

        Scanner scaner = new Scanner(System.in);
        String input = scaner.next();
        Stack<Integer> calc = new Stack<Integer>();
        while (scaner.hasNext()) {
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                int x = 0;
                int y = 0;
                int r = 0;
                if (Character.isDigit(c)) {
                    int t = Character.getNumericValue(c);
                    calc.push(t);
                } else if (c == '+') {
                    x = calc.pop();
                    y = calc.pop();
                    r = x + y;
                    calc.push(r);
                } else if (c == '-') {
                    x = calc.pop();
                    y = calc.pop();
                    r = x - y;
                    calc.push(r);
                } else if (c == '*') {
                    x = calc.pop();
                    y = calc.pop();
                    r = x * y;
                    calc.push(r);
                } else if (c == '/') {
                    x = calc.pop();
                    y = calc.pop();
                    r = x / y;
                    calc.push(r);
                }
            }
        }
        int a = calc.pop();
        System.out.println(a);
     }     
}
 */
