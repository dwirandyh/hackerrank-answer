package main;

public class JumpingOnTheCloud {
	public static void main(String[] args) {
		JumpingOnTheCloud obj = new JumpingOnTheCloud();
		int[] input = {0,0, 0, 0, 1, 0};
		int result = obj.jumpingOnClouds(input);
		System.out.println("Jump count = " + result);
	}
	
	public int jumpingOnClouds(int[] c) {
		 int i = 0;
	        int jump = 0;

	        while(i < c.length - 1){
	            if ((i + 2) <= c.length -1 && c[i] == 0 && c[i + 1] == 0 && c[i + 2] == 0){
	                jump++;
	                i = i + 2;
	            }else if (c[i + 1] == 0){
	                jump++;
	                i++;
	            }else{
	                i++;
	            }
	        }

	        return jump;
	}
}
