package day03_variablesContinue;

public class c1_boolenCharContinue {

    public static void main(String[] args){
        boolean b1=false;
        boolean b2=25 == 30;
        boolean b3 = 20 != 21;

        //== that means equal
        //!= not equal


        System.out.println(b2);
        System.out.println(b3);

        // ! this will change your value as opposite
        // !true = false
        //!false = true

        System.out.println(true == false); //  false
        System.out.println(!true == false); //true

        System.out.println(!true != !false);
        // (false != true)---- true

        System.out.println( !(true==false));
        // (!(false) )
        //(  true  )


        System.out.println( !(true == true) == (false == !true) );

        //!(true == true) ---> !(true) ---> false
        // (false == !true ) ---> (false == False) ---> True
        // (false == true) ---> false


        //   char       2 bytes   Stores a single character/letter or ASCII values  'a'

        char c='a';
        char c1='2';
        char c2= '@';

        // char c3='hh'; // error char can only store a single character

        System.out.println(c);
        System.out.println(c2);

        // ascii table
        // from ascii table number 97 is small a
        // from ascii number 65 as A

        int i=97; // this stroes numbers
        char ch=97; // store characters

        System.out.println(i); //97
        System.out.println(ch); // a

        System.out.println(i + ch); // 194
        // since we have int number and we want to sun with char
        // java will take char ascii number

        int i2= 'c'; // c will have 99 from ascii table
        System.out.println(i2);





    }




}
