import java.math.BigInteger;

public class PascalBinomial {
  private int[] result;
  /** The counter. */
  private Counter  counter = null;
  
  
  
  
  public PascalBinomial() {
    super();
  }

  
  public PascalBinomial(Counter c) {
    this();
    this.counter = c;
  }


  public int[] dreieck(BigInteger N){
    result = new int[N.intValue()+1];
   
    for(int i = 0; i<=N.intValue(); i++){
      result[i]=binomialCoefficient(N, BigInteger.valueOf(i)).intValue();
      count();
    }
    return result;
  }
  
  private void count() {
    if(counter != null){
        counter.counterUp(1);
    }
  }
    
    
    
    public  BigInteger binomialCoefficient(BigInteger n,BigInteger k){
      
      BigInteger n_minus_k=n.subtract(k);
      if(n_minus_k.compareTo(k)<0){
          BigInteger temp=k;
          k=n_minus_k;
          n_minus_k=temp;
      }
      
      BigInteger numerator=BigInteger.ONE;
      BigInteger denominator=BigInteger.ONE;
      
      for(BigInteger j=BigInteger.ONE; j.compareTo(k)<=0; j=j.add(BigInteger.ONE)){
        count();
          numerator=numerator.multiply(j.add(n_minus_k));
          denominator=denominator.multiply(j);
          BigInteger gcd=numerator.gcd(denominator);
          numerator=numerator.divide(gcd);
          denominator=denominator.divide(gcd);
      }
      
      return numerator;
  }
}

