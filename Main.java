package org.users.operators;

public class Main {
    public static void main(String[] args) {
        int a = 4;
//        a = a + 2;
        int b = 7;
//        boolean answer = a>b;
//        System.out.println(answer);

//        boolean answer = a==5 || b==2;
//        System.out.println(answer);

//        boolean answer = a==5 && b==7;
//        System.out.println(answer);

//        if (a>10)  {
//            System.out.println("A is greater than 10");
//        }
//        else {
//            System.out.println("A is less than 10");
//        }
        switch (a) {
            case 1:
                System.out.println("A is one");
                break;
            case 3:
                System.out.println("A is three");
                break;
            default:
                System.out.println("A is null");
                break;
        }


        System.out.println("Continue...");
    }
}
