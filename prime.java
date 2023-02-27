public class prime{
 public static void main(String[] args){
 System.out.println(isPrime(3));
 System.out.println(isPrime(8));
 System.out.println(isPrime(24));
 System.out.println(isPrime(37));

  }
   public static boolean isPrime(int number){
   
      if(number%2==0 || number%2!=1){
         return false;
     }
      return true;
   }
}
   
