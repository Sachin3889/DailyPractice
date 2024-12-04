package continueDailyPractice;

public class InternInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string1 = new String("Sachin");
		String string2 = new String("Sachin");
		System.out.println("Output without using intern and with new operator : " + (string1 == string2));
		
		//using intern method
		String string3 = new String("Sachin").intern();
		String string4 = new String("Sachin").intern();
		System.out.println("Output using intern method is                     : " + (string3 == string4));
		
		/*
		 * intern method insure that all strings having the same content share the same memory.
		 * As soon as a string object is invoked with intern(), it first checks if the string value of 
		 * the string object is already present in the string pool and if it is available, then the reference
		 * to that string from the string constant pool is returned.
		 */
		
		
		//using equals method
		
		String string5 = new String("Sachin");
		String string6 = new String("Sachin");
		System.out.println("Output using equal method                         : " + (string5.equals(string6)));
		
		//without using new operator
		
		String string7 = "Sachin";
		String string8 = "Sachin";
		System.out.println("Output without using new operator                 : " + (string7 == string8));
	}

}
