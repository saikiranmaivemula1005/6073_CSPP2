import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Arrays;
class Show {
	private String nameOfTheMovie;
	private String dateAndTime;
	private String[] seatNumbers;
	Show(String m, String dt, String[] s) {
		this.nameOfTheMovie = m;
		this.dateAndTime = dt;
		this.seatNumbers = s;
	}
	public String getMovieName() {
		return this.nameOfTheMovie;
	}
	public String getDateAndTime() {
		return this.dateAndTime;
	}
	public String[] getSeatNumbers() {
		return this.seatNumbers;
	}
	public void setSeat(int index, String set) {
		seatNumbers[index] = set;
	}
	public String toString() {
		return this.nameOfTheMovie + " " + this.dateAndTime + " " + this.seatNumbers;
	}
}
class Patron {
	private String patronName;
	private String mobileNumber;
	Patron(String n, String mbnum) {
		this.patronName = n;
		this.mobileNumber = mbnum;
	}
	public String getName() {
		return this.patronName;
	}
	public String getMobileNumber() {
		return this.mobileNumber;
	}
}


class BookYourShow {
	List<Show> showDetails;
	List<String> bookedTickets;
	public BookYourShow() {
		//constructor
		showDetails = new List<Show>();
		bookedTickets = new List<String>();
	}
	// public void addAshow(Show obj) {
	// 	showDetails.add(obj);
	// }
	public Show getAShow(String movieName, String dateAndTime) {
		for (int i = 0; i < showDetails.size(); i++) {
			if (showDetails.get(i).getMovieName().equals(movieName)&&
				showDetails.get(i).getDateAndTime().equals(dateAndTime)) {
				return showDetails.get(i);
			}
		}
		return null;
	}
	public String bookAShow(String movieName, String dateAndTime, Patron obj, String[] seats) {
		Show movieData = getAShow(movieName, dateAndTime);
		if (movieData != null) {
			for (int i = 0; i < movieData.getSeatNumbers().length; i++) {
				for (int j = 0; j < seats.length; j++) {
					if (seats[j].equals(movieData.getSeatNumbers()[i])) {
						movieData.setSeat(i, "N/A");
						bookedTickets.add(obj.getMobileNumber() + " " + movieName + " " + dateAndTime);
					}
				}
			}
		}
		return "";
	}
	public void printTickets(String movieName, String dateAndTime, String mobileNumber) {
		//print the tickets
		for (int i = 0; i < bookedTickets.size(); i++) {
			if ((mobileNumber + " " + movieName + " " + dateAndTime).equals(bookedTickets.get(i))) {
				System.out.println(mobileNumber + " " + movieName + " " + dateAndTime);
			}
		}
		return;
	}
	public void showAll() {
		//print all the available shows
		for (int i = 0; i < showDetails.size(); i++) {
			System.out.println(showDetails.get(i).toString());
		}
	}
class Solution{
   public void main(final String[] args) {
        BookYourShow bys = new BookYourShow();
        Scanner scan = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < testCases; i++) {
            String[] tokens = scan.nextLine().
                replace("[", "").replace("]", "").split(",");
            String[] check = tokens[0].split(" ");
            switch (check[0]) {
                case "add":
                    int k = 2;
                    String[] seats = new String[tokens.length - 2];
                    for (int j = 0; j < seats.length; j++) {
                        seats[j] = tokens[k++];
                    }
                //     bys.addAShow(new Show(check[1], tokens[1], seats));
                // break;

                case "book":
                    k = 2 + 2;
                    seats = new String[tokens.length - 2 - 2];
                    for (int j = 0; j < seats.length; j++) {
                        seats[j] = tokens[k++];
                    }
                    bys.bookAShow(check[1], tokens[1],
                        new Patron(tokens[2], tokens[2 + 1]), seats);
                break;

                case "get":
                    Show show = bys.getAShow(check[1], tokens[1]);
                    if (show != null) {
                       System.out.println(show);
                    } else {
                        System.out.println("No show");
                    }
                break;

                case "print":
                    bys.printTickets(check[1], tokens[1], tokens[2]);
                break;

                case "showAll":
                    bys.showAll();
                break;

                default:
                break;
            }
        }
    }
}
}