import java.util.Scanner;


class FoodLog {
	String nameOfFood;
	String quantityOfFood;
	String date;
	String foodTime;
	FoodLog(String foodName, String foodQuantity, String date, String time) {
		this.nameOfFood = foodName;
		this.quantityOfFood = foodQuantity;
		this.date = date;
		this.foodTime = time;
	}
	public String getFoodName() {
		return this.nameOfFood;
	}
	public String getFoodQuantity() {
		return this.quantityOfFood;
	}
	public String getDate() {
		return this.date;
	}
	public String getFoodTime() {
		return this.foodTime;
	}
	public String toString() {
		return "Food" + "\n" + "Date:" + getDate() + "Time:" + getFoodTime() + "\n" + "Name:" +  getFoodName() +"\n" + "Quantity:" +  getFoodQuantity() + "\n";
	}
}
class WaterLog {
	String quantityOfWater;
	String date;
	String time;
	WaterLog(String waterQuantity, String date, String time) {
		this.quantityOfWater = waterQuantity;
		this.date = date;
	}
	public String getWaterQuantity() {
		return this.quantityOfWater;
	}
	public String getDate() {
		return this.date;
	}
	public String toString() {
		return "Water" + "\n" + "Date:" +  getDate() + "\n" + "Quantity:" + getWaterQuantity() + "\n";
	}
}
class PhysicalActivitiesLog {
	String nameOfActivity;
	String startTime;
	String endTime;
	String notes;
	String date;
	PhysicalActivitiesLog(String nameOfActivity,  String notes, String date, String startTime, String endTime) {
	 this.nameOfActivity  = nameOfActivity;
	 this.startTime = startTime;
	 this.endTime = endTime;
	 this.notes = notes;
	 this.date = date;
	}
	public String getActivityName() {
		return this.nameOfActivity;
	}
	public String getStartTime() {
		return this.startTime;
	}
	public String getEndTime() {
		return this.endTime;
	}
	public String getNotes() {
		return this.notes;
	}
	public void setNotes(String s) {
		notes = s;
	}
	public String getDate() {
		return this.date;
	}
	public String toString() {
		return "PhysicalActivity" + "\n" + "Name:" + getActivityName() + "\n" + "Notes:" + getNotes() + "\n" + "Date:" + getDate() + "\n" + "Starttime:" + getStartTime() + "\n" + "Endtime:" + getEndTime() + "\n";
	}
}
class WeightLog {
	String weight;
	String fat;
	String date;
	String time;
	WeightLog(String date, String time, String weight, String fat) {
		this.weight = weight;
		this.fat = fat;
		this.date = date;
		this.time = time;
	}
	public String getWeight() {
		return this.weight;
	}
	public String getFat() {
		return this.fat;
	}
	public String getDate() {
		return this.date;
	}
	public String getTime() {
		return this.time;
	}
	public String toString() {
		return "Weight" + "\n" + "Date:" + getDate() + "\n" + "Time:" + getTime() + "\n" + "Weight:" + getWeight() + "\n" + "Fat:" + getFat() + "\n";
	}
}
class SleepLog {
	String startTime;
	String endTime;
	String date;
	SleepLog(String date, String startTime, String endTime) {
		this.startTime = startTime;
		this.endTime = endTime;
		this.date = date;
	}
	public String getStartTime() {
		return this.startTime;
	}
	public String getEndTime() {
		return this.endTime;
	}
	public String getDate() {
		return this.date;
	}
	public String toString() {
		return "Sleep" + "\n" + "Date:" + getDate() + "\n" + "Starttime:" + getStartTime() + "\n" + "Endtime:" + getEndTime() + "\n";
	}
}


class DailyTracker {
	List<FoodLog> foodlist = new List<FoodLog>();
	List<WaterLog> waterlist = new List<WaterLog>();
	List<PhysicalActivitiesLog> physicalActivitieslist = new List<PhysicalActivitiesLog>();
	List<WeightLog> weightlist = new List<WeightLog>();
	List<SleepLog> sleeplist = new List<SleepLog>();
	DailyTracker() {

	}
	public void addFood(FoodLog foodparameters) {
		foodlist.add(foodparameters);
	}
	public void addWater(WaterLog waterparameters) {
		waterlist.add(waterparameters);
	}
	public void addPhysicalActivities(PhysicalActivitiesLog physicalActivities) {
		physicalActivitieslist.add(physicalActivities);
	}
	public void addWeight(WeightLog weightparameters) {
		weightlist.add(weightparameters);
	}
	public void addSleep(SleepLog sleepparameters) {
		sleeplist.add(sleepparameters);
	}
	public void foodlog() {
		if (foodlist.size() == 0) {
			System.out.println("None");
			System.out.println("\n");
		}
		for (int i = 0; i < foodlist.size(); i++) {
			System.out.println(foodlist.get(i).toString());
		}		
	}
	public void waterlog() {
		if (waterlist.size() == 0) {
			System.out.println("None");
			System.out.print("\n");

		}
		for (int i = 0; i < waterlist.size(); i++) {
			System.out.println(waterlist.get(i).toString());
		}		
	}
	public void physicalactivitylog() {
		if (physicalActivitieslist.size() == 0) {
			System.out.println("None");
			System.out.print("\n");
		}
		for (int i = 0; i < physicalActivitieslist.size(); i++) {
			System.out.println(physicalActivitieslist.get(i).toString());
		}		
	}
	public void weightlog() {
		if (weightlist.size() == 0) {
			System.out.println("None");
			System.out.print("\n");
		}
		for (int i = 0; i < weightlist.size(); i++) {
			System.out.println(weightlist.get(i).toString());
		}	
	}
	public void sleeplog() {
		if (sleeplist.size() == 0) {
			System.out.println("None");
			System.out.print("\n");
		}
		for (int i = 0; i < sleeplist.size(); i++) {
			System.out.println(sleeplist.get(i).toString());
		}
	}
	public void summary() {
		foodlog();
		waterlog();
		physicalactivitylog();
		weightlog();
		sleeplog();	
	}
	public void summary(String date) {
		for (int i = 0; i < foodlist.size(); i++) {
			if (date.equals(foodlist.get(i).getDate())){
				System.out.print(foodlist.get(i).toString());
			}
		}
		for (int i = 0; i < waterlist.size(); i++) {
			if (date.equals(waterlist.get(i).getDate())){
				System.out.print(waterlist.get(i).toString());
			}		
		}
		for (int i = 0; i < physicalActivitieslist.size(); i++) {
			if (date.equals(physicalActivitieslist.get(i).getDate())){
				System.out.print(physicalActivitieslist.get(i).toString());
			}		
		}
		for (int i = 0; i < weightlist.size(); i++) {
			if (date.equals(weightlist.get(i).getDate())){
				System.out.print(weightlist.get(i).toString());
			}		
		}
		for (int i = 0; i < sleeplist.size(); i++) {
			if (date.equals(sleeplist.get(i).getDate())){
				System.out.print(sleeplist.get(i).toString());
			}		
		}
	}
}
public class Client {
	protected Client() {

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DailyTracker d = new DailyTracker();
		while (sc.hasNext()) {
		String line = sc.nextLine();
		String[] tokens = line.split(" ");
		switch(tokens[0]) {
			case "Food":
			String[] items = tokens[1].split(",");
			FoodLog f = new FoodLog(items[0], items[1], items[2], items[3]);
			d.addFood(f); 
			break;
			case "Water":
			items = tokens[1].split(",");
			WaterLog water = new WaterLog(items[0], items[1], items[2]);
			d.addWater(water); //quantity, time.
			break;
			case "PhysicalActivity":
			items = tokens[1].split(",");
			PhysicalActivitiesLog p = new PhysicalActivitiesLog(items[0], items[1], items[2], items[3], items[4]);
			d.addPhysicalActivities(p);
			break;
			case "Weight":
			items = tokens[1].split(",");
			WeightLog weight = new WeightLog(items[0], items[1], items[2], items[3]);
			d.addWeight(weight);
			break;
			case "Sleep":
			items = tokens[1].split(",");
			SleepLog sleep = new SleepLog(items[0], items[1], items[2]);
			d.addSleep(sleep);
			break;
			case "Summary" :
			if (tokens.length == 1) {
				d.summary();
			} else {
				d.summary(tokens[1]);
			}
			break;
			case "Foodlog":
			d.foodlog();
			break;
			case "Waterlog":
			d.waterlog();
			break;
			case "PhysicalActivitylog":
			d.physicalactivitylog();
			break;
			case "Weightlog":
			d.weightlog();
			break;
			case "Sleeplog":
			d.sleeplog();
			break;
			default:
			}			
		}

	}
}
