package day03_variablesContinue;

public class c5_unaryOperators {
    public static void main(String[] args){
        // create variables
        int number1=10;
        int number2=number1;
         System.out.println(number2);

         int number3=15;
         int number4= -number3;
         // number4 = -15
        int number5= number3; // =15
        // number5 = 15


        System.out.println("number3 :" +number3);
        System.out.println("number4 :" +number4);
        System.out.println("number5 :" +number5);

        // if you want to copy previous line
        // use command + D for mac

        int x=10;
        int y = -x;

        // y = -10

        boolean b1= y>=0; // -10 > 0 false
        boolean b2 = x>=0; // 10>= 0 True

        System.out.println(b1);
        System.out.println(b2);


        int i1= -15;
        int i2 = +i1;// +-15 = -15
        int i3 = -i1;// -(-15)= 15


        int i4 = -i3; // -(15)=-15









    }





}
