import java.math.BigInteger;

public class PascalBinomial {
  private int[] result;
  
  
  
  public int[] dreieck(BigInteger N){
    result = new int[N.intValue()+1];
   
    Binomialkoeffezient binom = new Binomialkoeffezient();
    for(int i = 0; i<=N.intValue(); i++){
      result[i]=binom.binomialCoefficient(N, BigInteger.valueOf(i)).intValue();
    }
    return result;
  }
}
