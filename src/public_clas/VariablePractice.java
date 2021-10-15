package public_clas;

public class VariablePractice {
    public static void main(String[] args) {

        String result = "";
        for( int i=1; i<51; i++){
            if(i%2==0 && i%3==0){
                result +="JAVA " ;



            } else if(i%3==0){
                result += "VA ";
            }else if(i%2==0){
                result += "JA ";
            }else{
                result += i + "";
            }
        }
        System.out.println(result);







    }
}











