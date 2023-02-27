public class alternative{
  public static void main(String[] args){
    int number = 30;
    int remainder = number%2;
    boolean isPrime=true;
    
    if(number==1){
      System.out.println("1 is not a prime number");
    }
    if(number<1){
      System.out.println("Invalid number");
    }
    for(int i=2;i<number;i++){
      if(number%i==0){
        isPrime=false;
      }
    }
    
    if(isPrime){
      System.out.println("It is a prime number);
     }
     else{
       System.out.println("It is not a prime numberé);
     }
 }
