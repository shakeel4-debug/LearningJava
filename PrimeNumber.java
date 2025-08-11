public class PrimeNumber {
    public static void main(String[] args) {
        int number=11;
        boolean isPrime=false;
        for(int i=2;i<number;i++){
            if (number%i==0){
                isPrime=true;
                break;
            }
        }
        if (isPrime==true){
            System.out.println("It is not prime");
        }
        else {
            System.out.println("It is prime");
        }
    }
}
