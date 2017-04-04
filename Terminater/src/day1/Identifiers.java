package day1;

public class Identifiers {
	
	public static void main(String[] args) {
		
//	we can have upper case and lower case letters
//		int 123num=25;   //we cant have numbers at the begining of an identifier
		int num123=25; 
//		int num#=29;     //we cant have special characters except $ and _
		int num1$=100;   
		int num_id=199; 
		int $num=10;
		int _num=0;
		
		System.out.println("github");
//		literals are case sensitive
		int number=10;
		int Number=10;
		int numbeR=20;
		int NUMBER=22;
//		case sensitive end
// 	 	Though reserved words are not allowed we van use all inbuilt class names and interface names as identifiers.
		int String=10;
		int Runnable=100;
		int Int=22;
		int Integer=22;
//		int int=100;	//but not other reserved words
		System.out.println(String);
	}
	
	
}
