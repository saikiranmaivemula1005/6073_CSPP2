import java.util.HashMap;
import java.util.*;
import java.io.*;
class test {
	public static void main(String[] args) {
		// String text = "A map contains values on the basis of key i.e. key and value pair. Each key and value pair is known as an entry. Map contains only unique keys.";
		// String[] words = text.replaceAll("[!@#$%^&*()<>,.:;?/]", "").split(" ");
		// int count = 0;
		// Map <String, Integer> map = new HashMap<>();
		// for (int i = 0; i  < words.length; i++) {
		// 	if(!map.containsKey(words[i])) {
		// 		map.put(words[i], 1);
		// 	} else {
		// 		map.put(words[i],map.get(words[i])+1);
		// 	}
		// }
		// System.out.println(map);
		String path;
		Scanner scan = new Scanner(System.in);
		path = scan.nextLine();
		File folder = new File(path);
		File[] list = folder.listFiles();
		for(File t : list) {
			System.out.println(t);
		}

	}
}