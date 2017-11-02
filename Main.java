import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		
//		String inst = "M=M+1;JMP";
//		Parser parser = new parser(inst);
//		System.out.println(comp);
//		System.out.println(dest);
//		System.out.println(jump);
			
		Scanner scan = new Scanner(new File("input.txt"));
		
		Parser parse;
		Code code = new Code();
		SymbolTable st = new SymbolTable();
		
		while(scan.hasNextLine()) {
			String inCode = scan.nextLine();	
			parse = new Parser(inCode);
		}
		
	}

}
