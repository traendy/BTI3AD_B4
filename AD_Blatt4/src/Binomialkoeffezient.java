import java.math.BigInteger;

public class Binomialkoeffezient {

  public static BigInteger binomialCoefficient(BigInteger n,BigInteger k){
    
    BigInteger n_minus_k=n.subtract(k);
    if(n_minus_k.compareTo(k)<0){
        BigInteger temp=k;
        k=n_minus_k;
        n_minus_k=temp;
    }
    
    BigInteger numerator=BigInteger.ONE;
    BigInteger denominator=BigInteger.ONE;
    
    for(BigInteger j=BigInteger.ONE; j.compareTo(k)<=0; j=j.add(BigInteger.ONE)){
        numerator=numerator.multiply(j.add(n_minus_k));
        denominator=denominator.multiply(j);
        BigInteger gcd=numerator.gcd(denominator);
        numerator=numerator.divide(gcd);
        denominator=denominator.divide(gcd);
    }
    
    return numerator;
}

}
