package com.maths;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Duplicate {
	public static void duplicate_words() {
		String s1="we are learning java with java with selenium and we are completed java";
		String[] words=s1.split(" ");
		Map<String,Integer>map=new HashMap<String,Integer>();
		for (String w : words) {
			if(map.containsKey(w)) {
				Integer count = map.get(w);
				map.put(w, count+1);
			}
			else {
				map.put(w, 1);
			}
			
		}
		System.out.println("Occurances of each word: ");
		System.out.println(map);
	}
	
	public static void repeated_words_print() {
		String s1="we are learning java with java with selenium and we are completed java";
		String[] words=s1.split(" ");
		Map<String,Integer>map=new HashMap<String,Integer>();
		for (String w : words) {
			if(map.containsKey(w)) {
				Integer count = map.get(w);
				map.put(w, count+1);
			}
			else {
				map.put(w, 1);
			}
			
		}
		System.out.println("Occurances of each word: ");
		System.out.println(map);
	
		System.out.println("Repeated words are: ");
		Set<Entry<String,Integer>>entryset=map.entrySet();
		for(Entry<String,Integer>entry:entryset) {
			if(entry.getValue()>1) {
				Integer value = entry.getValue();
				String key = entry.getKey();
				System.out.println(key+"="+value);
			}
		}
	}
	public static void char_duplicate() {
		String s1="we are learning java with java with selenium and we are completed java";
		String[] words=s1.split(" ");
		Map<String,Integer>map=new HashMap<String,Integer>();
		for (String w : words) {
			if(map.containsKey(w)) {
				Integer count = map.get(w);
				map.put(w, count+1);
			}
			else {
				map.put(w, 1);
			}
			
			
		}
			
		
		System.out.println("Occurances of each word: ");
		System.out.println(map);
	
		//System.out.println("Repeated words are: ");
		Set<Entry<String,Integer>>entryset=map.entrySet();
		System.out.println(entryset);
	if(Key()>1)
		
	}
public static void main(String[] args) {
	//duplicate_words();
	//repeated_words_print();
	
}
}

