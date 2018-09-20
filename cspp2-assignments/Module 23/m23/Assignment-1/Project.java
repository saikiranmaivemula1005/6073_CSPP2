import java.util.*;
import java.lang.Math.*;
import java.io.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class Document {
	String text1;
	String text2;
	Document(String t1, String t2) {
		this.text1 = t1;
		this.text2 = t2;
	}
	public Map removewords(String text) {
		text = text.toLowerCase();
		String[] words = text.replaceAll("[!@#$%^&*()<>,.:;?/]", "").split(" ");
		Map <String, Integer> map = new HashMap<>();
		for (int i = 0; i  < words.length; i++) {
			if(!map.containsKey(words[i])) {
				map.put(words[i], 1);
			} else {
				map.put(words[i],map.get(words[i]) + 1);
			}
		}
		// for (Map.Entry m:map.entrySet()) {
		// 	System.out.println(m.getKey() + " " + m.getValue());
		// }
		return map;
	}
	public void compare(String textOne, String textTwo) {
		float numerator = 0;
		double denominator = 0;
		float firstSum = 0;
		float secondSum = 0;
		Map <String,Integer> mapOne = removewords(textOne);
        Map <String,Integer> mapTwo = removewords(textTwo);
        for (String inmapOne : mapOne.keySet()) {
        	for (String inmapTwo : mapTwo.keySet()) {
        		if (inmapOne.equals(inmapTwo)) {
        			numerator += mapOne.get(inmapOne) * mapTwo.get(inmapTwo);
        		}
        	}
        }
        for (String inmapOne : mapOne.keySet()) {
        	firstSum += mapOne.get(inmapOne) ^ 2;
        }
        for (String inmapTwo : mapTwo.keySet()) {
        	secondSum += mapTwo.get(inmapTwo) ^ 2;
        }
        denominator = Math.sqrt(firstSum) * Math.sqrt(secondSum);
        System.out.println(numerator / denominator);
	}
	
}
class Project {
	Project() {

	}
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String fileOne = reader.next();
		String fileTwo = reader.next();
		try {
		String stringOne = new String(Files.readAllBytes(Paths.get(fileOne)));
		String stringTwo = new String(Files.readAllBytes(Paths.get(fileTwo)));
		Document d = new Document(stringOne, stringTwo);
		d.compare(stringOne, stringTwo);
	} catch (NoSuchElementException ee) {
		System.out.println("found");
	}  
	catch (IOException e) {
		System.out.println("Exception");
	}

	}
}