
public class Parser {

	private String inString;
	
//	public String comp = "";
//	public String dest = "";
//	public String jump = "";
//	public Parser(String inst)
//	{
//		String[] temp = inst.split("=");
//		dest = temp[0];
//	}
	
	public Parser(String inString) {
		this.inString = inString;
	}
	
	public String commandType() {
		String type;
		char c = inString.charAt(0);
		if(c == '@') {
			type = "A";
		} 
		else if(c == '(') {
			type = "L";
		}
		else {
			type = "C";
		}
		return type;
	}
	
	public String symbol() {
		String sym;
		if(this.commandType().equals("A")) {
			sym = inString.substring(1);
		}
		else if(this.commandType().equals("L")) {
			sym = inString.substring(1, inString.length() - 1);
		}
		else {
			sym = "Not Allowed";
		}
		
		return sym;
	}
	
	public String dest() {
		String dest = "";
		if(this.commandType().equals("C")) {
			if(inString.contains("=")) {
				String[] temp = inString.split("=");
				dest = temp[0];
			}
		}
		return dest;
	}
	
	public String comp() {
		String comp = "";
		if(this.commandType().equals("C")) {
			if(inString.contains("=")) {
				String[] temp = inString.split("=");
				comp = temp[0];
			}
		}
		return comp;
	}
	
	public String jump() {
		return "";
	}
	
}
