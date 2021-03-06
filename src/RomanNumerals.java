
public class RomanNumerals {
	

	
	public int convertToInteger(String romanNum) {
		

		//two-letter groups
		if (romanNum.length() == 1){
			return convertSingleRoman(romanNum);}

		if (romanNum.length() == 2) {
			if (romanNum.substring(0,1).equals(romanNum.substring(1))){	
				return 2*convertSingleRoman(romanNum.substring(0, 1));}}
		else if ((convertSingleRoman(romanNum.substring(0,1))) < convertSingleRoman((romanNum.substring(1)))){
			return convertSingleRoman(romanNum.substring(1)) - convertSingleRoman(romanNum.substring(0,1));}
		else if ((convertSingleRoman(romanNum.substring(0,1))) > convertSingleRoman((romanNum.substring(1)))){
			return convertSingleRoman(romanNum.substring(1)) + convertSingleRoman(romanNum.substring(0,1));
		}
		//three-letter groups
		if (romanNum.length() == 3) {
			if (romanNum.substring(0,1).equals(romanNum.substring(1,2)) && (romanNum.substring(1,2).equals(romanNum.substring(2,3))))	
				return 3*convertSingleRoman(romanNum.substring(0,1));
		}

		if (romanNum.length() == 4) {
			if (romanNum.substring(0,1).equals(romanNum.substring(1,2)) && (romanNum.substring(1,2)).equals(romanNum.substring(2,3))&& (romanNum.substring(2,3)).equals(romanNum.substring(3,4)))
				//if (romanNum.substring(0,1).equals(romanNum.substring(1)) && (romanNum.substring(1,2).equals(romanNum.substring(3)) && (romanNum.substring(3,4).equals(romanNum.substring(4))))))	
						return 4*convertSingleRoman(romanNum.substring(0, 1));
		}
	else if (romanNum == "III"){
		return 1 + 1 + 1;

	}else if (romanNum == "VII"){
		return 5 + 1 + 1;
	}else if (romanNum == "VIII"){
		return 5 + 1 + 1 + 1;


	}else if (romanNum == "XXX"){
		return 10 + 10 + 10;

	}else if (romanNum == "LXX"){
		return 50 + 10 + 10;
	}else if (romanNum == "LXXX"){
		return 50 + 10 + 10 + 10;

	}else if (romanNum == "CCC"){
		return 100 + 100 + 100;

	}else if (romanNum == "DCC"){
		return 500 + 100 + 100;
	}else if (romanNum == "DCCC"){
		return 500 + 100 + 100 + 100;}
	return 0;
		
		
	}


	
	private int convertSingleRoman(String roman) {
		if (roman.equals("I"))
			return 1;
		else if (roman.equals("V"))
			return 5;
		else if (roman.equals("X"))
			return 10;
		else if (roman.equals("L"))
			return 50;
		else if (roman.equals("C"))
			return 100;
		else if (roman.equals("D"))
			return 500;
		else if (roman.equals("M"))
			return 1000;
		else
			return 0;
				
	}
	
}
