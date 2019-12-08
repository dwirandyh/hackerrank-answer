package main;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;

public class SockMerchant {
	public static void main (String[] args) {
	    System.out.println("Sock Merchant");
	    
	    SockMerchant obj = new SockMerchant();
	    int[] socks = {10,20, 20,10,10,30,50,10,20};
	    int matchingPairs = obj.sockMerchant(9, socks);
	    System.out.println(matchingPairs);
	}
	
	public int sockMerchant(int n, int[] ar) {
		HashMap<Integer, Integer> repititions = new HashMap<Integer, Integer>();
		for (int i = 0; i < ar.length; i++) {
			int item = ar[i];
			if (repititions.containsKey(item)) {
				repititions.put(item, repititions.get(item) + 1);
			}else {
				repititions.put(item, 1);
			}
		}
		
		int matchingPairs = 0;
		
		for (Map.Entry m : repititions.entrySet()) {
			int socksCount = (int) m.getValue();
			matchingPairs += (int) (socksCount / 2);
		}	
		
		return matchingPairs;
	}
}
