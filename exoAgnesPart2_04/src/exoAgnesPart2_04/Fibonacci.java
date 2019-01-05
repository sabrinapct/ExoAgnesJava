package exoAgnesPart2_04;



public class Fibonacci {

	// fonction qui calcule F(n) par iteration
	
	  static long fibo(int n) {
	    long fn, fp, fpp;
	    int i;
	    
	    fn = 1; // F(1)
	    fp = 1; // F(0)
	    for ( i = 2; i <= n; i++ ) {
	      fpp = fp;      // F(n-2)
	      fp = fn;       // F(n-1)
	      fn = fpp + fp; // F(n)
	    }
	    return fn;
	  } 

	  public static void main(String[] args) {
	    int n;
	    
	    if ( args.length > 0 ) {
	      n = Integer.parseInt(args[0]);
	      System.out.println("F("+n+") = "+fibo(n));
	    }
	  } 

	} 