package main;

public class CountingValley {
	public static void main(String[] args) {
		CountingValley countingValley = new CountingValley();
		
		int valleyCount = countingValley.getValleyCount("UDDDUDUU");
		
		System.out.println(valleyCount);
	}
	
	public int getValleyCount(String pathPattern) {
		int valley = 0;
		int level = 0;
		for (char c : pathPattern.toCharArray()) {
			if (c == 'D') {
				level--;
			}else if (c == 'U') {
				level++;
			}
			
			if (level == 0 && c == 'U') {
				valley++;
			}
		}
		
		return valley;
	}
}
