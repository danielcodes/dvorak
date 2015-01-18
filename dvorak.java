import java.util.Scanner;

public class dvorak {
	public static void main(String[] args) {  
   
	String input, output = "";
	String qwerty = "-=qwertyuiop[]asdfghjkl;'zxcvbnm,./ _+QWERTYUIOP{}ASDFGHJKL:\"ZXCVBNM<>?";
	String dvorak = "[]',.pyfgcrl/=aoeuidhtns-;qjkxbmwvz {}\"<>PYFGCRL?+AOEUIDHTNS_:QJKXBMWVZ";
	int location;

	//to retrieve user input
	Scanner in = new Scanner(System.in);

	System.out.print("Please enter QWERTY string: ");
	input = in.nextLine();

	System.out.println("QWERTY  INPUT: " + input);

	for(int i=0; i<input.length(); i++)
	{
		location = qwerty.indexOf(input.charAt(i));
		
		if(location == -1) //not found
			output += input.charAt(i);
		else
			output += dvorak.charAt(location);
	}

	System.out.println("DVORAK OUTPUT: " + output);
		  
   }
}