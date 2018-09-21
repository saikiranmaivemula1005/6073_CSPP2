import java.util.*;
import java.lang.Math.*;
import java.io.*;
class Document {
	String text1;
	String text2;
	Document() {
		text1 = "";
		text2 = "";
	}
	public static String DocumentToString(File doc) {
		String fileToString = "";
		try {
			Scanner s = new Scanner(new FileReader(doc));
			StringBuilder sb = new StringBuilder();
			while (s.hasNext()) {
				sb.append(s.next());
				sb.append(" ");
			}
			s.close();
			fileToString = sb.toString();
		} catch(FileNotFoundException e) {
			System.out.println("no file");
		}
		return fileToString;
	}
	public static Map removewords(String text) {
		text = text.toLowerCase();
		String[] words = text.replaceAll("[0-9_;:''.,?!@#$%^&*()]", "").split(" ");
		Map <String, Integer> map = new HashMap<>();
		for (int i = 0; i  < words.length; i++) {
			if(!map.containsKey(words[i])) {
				map.put(words[i], 1);
			} else {
				map.put(words[i],map.get(words[i]) + 1);
			}
		}
		return map;
	}
	public static int compare(String stringOne, String stringTwo) {
		float numerator = 0;
		double denominator = 0;
		float firstSum = 0;
		float secondSum = 0;
		Map <String,Integer> firstMap = removewords(stringOne);
        Map <String,Integer> secondMap = removewords(stringTwo);
        for (String inmapOne : firstMap.keySet()) {
        	for (String inmapTwo : secondMap.keySet()) {
        		if (inmapOne.equals(inmapTwo)) {
        			numerator += firstMap.get(inmapOne) * secondMap.get(inmapTwo);
        		}
        	}
        }
        for (String inmapOne : firstMap.keySet()) {
        	firstSum += Math.pow(firstMap.get(inmapOne),2) ;
        }
        for (String inmapTwo : secondMap.keySet()) {
        	secondSum += Math.pow(secondMap.get(inmapTwo),2);
        }
        denominator = Math.sqrt(firstSum) * Math.sqrt(secondSum);
        double output = (numerator / denominator) * 100;
        return  (int) ((output * 100D) / 100D) ;
	}
	
}
class Project {
	Project() {

	}
	public static void main(String[] args) {
		try {
		Document d = new Document();
		String path;
		Scanner scan = new Scanner(System.in);
		path = scan.nextLine();
		File folder = new File(path);
		File[] list = folder.listFiles();
		for(File t : list) {
			// System.out.println(t);
		}
		int length = list.length;
		int[][] matrix = new int[length][length];
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				matrix[i][j] = Document.compare(Document.DocumentToString(list[i]),Document.DocumentToString(list[j]));
			}
		}
		System.out.print("      \t");
		for (int i = 0; i < list.length - 1; i++) {
			System.out.print("\t" + list[i].getName());
		}
		System.out.println("\t" + list[length - 1].getName());
		for (int i = 0; i < length; i++) {
			System.out.print(list[i].getName() + "\t");
			for (int j = 0; j < length; j++) {
				System.out.print(matrix[i][j] + "		");
			}
			System.out.println();
		}
	} catch (NoSuchElementException e) {
		System.out.println("empty directory");
	}
	
	}
}