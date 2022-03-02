
public class IntegerToRomanNumber {
	
	public static void getRomanValue(int values[] , String romanValues[], int input) {
		if(input <= 0)
			return;
		StringBuilder sb = new StringBuilder(); 
		for(int i=0;i<values.length;i++) {
			while(input >= values[i]) {
				input -= values[i];
				sb.append(romanValues[i]);
			}
		}
		System.out.println("Roman Number : "+sb);
	}

	public static void main(String[] args) {
		int values[] = {500,400,100,90,50,40,10,9,5,4,1};
		String romanValues[] = {"D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		int input = 50;
		getRomanValue(values,romanValues,input);

	}

}
