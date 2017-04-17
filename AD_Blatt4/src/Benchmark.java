import java.math.BigInteger;

public class Benchmark {
 private static Counter counter= null;
 private static final int MAX_EXPONENT = 5;
  public static void main(String[] args) {
    counter = new Counter();
    doBenchMarktestsF();
    
  }

  

  private static void doBenchMarktestsF() {
   
  
   for(int i = 0; i<=MAX_EXPONENT; i++){
     //Rekursiv
   }
   for(int i = 0; i<=MAX_EXPONENT; i++){
     //Rekursiv
   }
   
   /**
    * Calculation with binomial coefficient
    */
   counter.setCounter(0);
   PascalBinomial binom = new PascalBinomial(counter); 
   System.out.println("Berechnung mit Binomialkoeffizient");
   for(int i = 0; i<=MAX_EXPONENT; i++){
     binom.dreieck(new BigInteger(String.valueOf((int)Math.pow(10, i))));
     System.out.println("10^"+i+"\t"+counter.getCounter());
   }
   
   
    
  }

}
