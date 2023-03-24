package javaapplication30;

public class JavaApplication30 {
    static boolean isPalindrom(int number){
        int temp=number, tutucu=0, gecici;
        
        while(temp!=0){
            gecici=temp%10;
            tutucu=(tutucu * 10) +gecici;
            temp/=10;
        }
        if(number==tutucu)
            return true;
        else
            return false;
        
    }
   public static void main(String[] args) {
       
       System.out.println(isPalindrom(99));
    }
    
}
