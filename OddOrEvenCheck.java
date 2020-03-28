package edu.study.lambdaexpr;

public class OddOrEvenCheck{	
	public static void main(String[] args){
		OddOrEvenCheck validatingObject = new OddOrEvenCheck();
		validatingObject.checkOddOrEvenForInteger((Integer i) -> (i%2 == 0), 8 );
		validatingObject.checkOddOrEvenForInteger((Integer i) -> (i%2 == 0), 9 );
	}
	
	public void checkOddOrEvenForInteger(Function<Integer> f, int num){
		String s = (f.check(num)?"EVEN":"ODD");		
		System.out.printf("Given number %d is %s",num,s);
		System.out.println();
	}
	
}