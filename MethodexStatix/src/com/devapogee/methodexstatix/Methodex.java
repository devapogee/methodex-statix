package com.devapogee.methodexstatix;
public final class Methodex {
	public static void main(String [] args){
		try{
			
			if(args[0].equals("prime"))
				if(isPrime(Integer.parseInt(args[1])))
					System.out.println("Yes, number "+args[1]+ " is prime.");
				else
					System.out.println("No, number "+args[1]+ " is NOT prime.");
			else if(args[0].equals("decode"))
				System.out.println(binaryDecode(args[1]));
			else if(args[0].equals("encode"))
				System.out.println(binaryEncode(args[1]));
		
		}catch(Exception e){
			System.out.println("Sintax should be: prime 87" +
					"\n\t\t  decode 100010110" +
					"\n\t\t  encode \"hello world\"");
		}		
	}
	public static final String binaryEncode(String str){
		String parsed="";
		char[] chars=str.toCharArray();
		for(char c:chars){
			String eightbitChar=Integer.toBinaryString(c);
			while(eightbitChar.length()<8)
				eightbitChar="0".concat(eightbitChar);
			parsed=parsed.concat(eightbitChar);
		}
		return parsed;
	}
	public static final String binaryDecode(String bins) {
		String parsed="";
		for(int i=0;i<bins.length();i+=8){
			parsed=parsed.concat(""+(char)Integer.parseInt(bins.substring(i, i+8), 2));
		}
		return parsed;
	}
	public static final boolean isPrime(int no){
		if(no<2)
			return false;
		for(int i=2;i<no/2;i++)
			if(no%i==0)
				return false;
		return true;
	}
}
