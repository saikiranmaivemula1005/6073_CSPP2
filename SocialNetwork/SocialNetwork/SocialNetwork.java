import java.util.Scanner;
import java.util.Arrays;
class User {
	private String nameOfUser;
	private List<String> followers;
	User(String nameOfUser) {
		this.nameOfUser = nameOfUser;
		followers = new List<String>();
	}
	public String getUsername() {
		return this.nameOfUser;
	}
	public void addFollower(String follower) {
		followers.add(follower);
	}
	public List<String> getFollowers() {
		return followers;
	}
	public String toString() {
		String str = this.nameOfUser+": "+followers.toString();
		return str;
	}
}
class Database {
	private List<User> usernameslist;
	Database() {
		usernameslist = new List<User>();
	}
	public void addConnections(String user, String follower) {
		for (int i = 0; i < usernameslist.size(); i++) {
			if (user.equals(usernameslist.get(i).getUsername())) {
				usernameslist.get(i).addFollower(follower);
			}
		}
	}
	public void addConnections(User userobject) {
		usernameslist.add(userobject);
	}
	public String getConnections(String user) {
		for (int i = 0; i < usernameslist.size(); i++) {
			if (user.equals(usernameslist.get(i).getUsername())) {
				return usernameslist.get(i).toString();
			}
		}
		return "Not a user in Network";
	}
	public void getCommonConnections(String userOne, String userTwo) {
		List<String> listOne = new List<String>();
		List<String> listTwo = new List<String>();
		List<String> resultList = new List<String>();
		for (int i = 0; i < usernameslist.size(); i++) {
			if (userOne.equals(usernameslist.get(i).getUsername())) {
				listOne = usernameslist.get(i).getFollowers();
				break;
			}
		}
		for (int i = 0; i < usernameslist.size(); i++) {
			if (userTwo.equals(usernameslist.get(i).getUsername())) {
				listTwo = usernameslist.get(i).getFollowers();
				break;
			}
		}
		for (int i = 0; i < listOne.size(); i++) {
			if (listTwo.contains(listOne.get(i))) {
				resultList.add(listOne.get(i));
			}
		}
		System.out.println(resultList.toString());
	}
	public void network() {
		String[] names = new String[usernameslist.size()];
		for (int i = 0; i < usernameslist.size(); i++) {
			names[i] = usernameslist.get(i).toString();
		}
		Arrays.sort(names);
		String result = Arrays.toString(names);
		System.out.println(result.substring(1,result.length()-1));
	}
}


class SocialNetwork {
	SocialNetwork() {

	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Database d = new Database();
		while(scan.hasNext()) {
			String line = scan.nextLine();
			if (line.contains(" is connected to ")) {
				String[] tokens = line.split(" is connected to ");
				String[] items = tokens[1].replace(".","").split(", ");
				User user = new User(tokens[0]);
				for (int i = 0; i < items.length; i++) {
					user.addFollower(items[i]);
				}
				d.addConnections(user);
			} else {
				String[] listOne = line.split(" ", 2);
				switch(listOne[0]) {
					case "addConnections":
						String[] listTwo = listOne[1].split(" ");
						d.addConnections(listTwo[0], listTwo[1]);
						break;
					case "getConnections":
					System.out.println(d.getConnections(listOne[1]));
						break;
					case "CommonConnections":
						String[] listThree = listOne[1].split(" ");
						d.getCommonConnections(listThree[0], listThree[1]);
						break;
					case "Network":
						d.network();
					default: break;
				}
			}
		}
	}
}
