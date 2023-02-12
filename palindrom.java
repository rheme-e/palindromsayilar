package Giris;

public class palindrom {
    static boolean isPalindrom(int number){
        int tempNumber,lastNumber=0,reverseNumber=0;
        tempNumber=number;
        while(tempNumber != 0){
            lastNumber= tempNumber % 10;
            reverseNumber=(reverseNumber*10+lastNumber);
            tempNumber/=10;

        } if(number == reverseNumber){
            return true;
        }else{
            return false;
        }

    }
    public static void main(String[] args) {
        System.out.println(isPalindrom(373));

    }
}
