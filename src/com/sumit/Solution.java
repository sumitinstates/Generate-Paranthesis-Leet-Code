package com.sumit;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
	public static List<String> generateParanthesis(int n){
		List<String> res = new ArrayList<String>();
		
		backtrack(res,"",0, 0, n);
		return res;
	}
	
	public static void backtrack(List<String> res, String combination, int open, int close, int n) {
		if(combination.length()==2*n) {
			res.add(combination);
			return;
		}
		
		if(open<n) {
			backtrack(res, combination+"(", open+1, close, n);
		}
		if(close<open) {
			backtrack(res, combination+")", open, close+1, n);
		}
	}
	
	public static void main(String[] args) {
		int n = 3;
		System.out.println(Solution.generateParanthesis(n));
	}

}
