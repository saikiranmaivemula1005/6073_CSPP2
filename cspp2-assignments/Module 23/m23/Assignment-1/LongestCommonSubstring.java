import java.io.*;
class Substring {
	Substring() {

	}
	public String toString(File givenFile) {
		String result;
		try {
			Scanner s = new Scanner(new FileReader(givenFile));
			StringBuilder sb = new StringBuilder();
			while (s.hasNext()) {
				sb.append(s.next());
				sb.append(" ");
			}
			s.close();
			result = sb.toString();
		} catch(FileNotFoundException e) {
			System.out.println("no file");
		}
		return result;
	}
	public static Map removewords(String text) {
		text = text.toLowerCase();
		String[] words = text.replaceAll("[^a-zA-Z0-9\\s ]", "").split(" ");
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
	public int findLCS(String firstString, String secondString) {
		Map <String,Integer> firstMap = removewords(firstString);
        Map <String,Integer> secondMap = removewords(secondString);
	}

}


class LongestCommonSubstring{
	LongestCommonSubstring() {

	}
	public static void main(String[] args) {
		Substring s = new Substring();
		String path;
		Scanner scan = new Scanner(System.in);
		path = scan.nextLine();
		File folder = new File(path);
		File[] filesList = folder.listFiles();
		int length = list.length;
		int[][] matrix = new int[length][length];
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				matrix[i][j] = s.findLCS(s.DocumentToString(filesList[i]),s.DocumentToString(filesList[j]));
			}
		}
	}
}