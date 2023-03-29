package Test;

public class CustomString {
	
	private String name;
	
	CustomString(String name){
		this.name = name;
	}
	public int charIndex(char checkChar) {
		int length = this.name.length();
		
		for(int i = 0;i<length;i++) {
			if(this.name.charAt(i)==checkChar) {
				return i;
				
			}
		
		}
		
	return -1;	
	}
	
	
	public static void main(String[] args) {
		
		CustomString newString= new CustomString("dev");
	
		System.out.println("The position of the character is: "+newString.charIndex('h'));
		
		
	}
}
