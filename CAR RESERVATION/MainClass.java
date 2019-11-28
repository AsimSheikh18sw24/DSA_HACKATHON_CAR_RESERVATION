import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
public class MainClass{
	private static int fQuantity,gliQuantity,civicQuantity,cultusQuantity;
	private static String fortuner = "Fortuner";
	private static String corolla = "Corolla";
	private static String civic = "Civic";
	private static String cultus = "Cultus";
	private static Scanner sc = new Scanner(System.in);
	private static int carId;
	public static void main(String[] args) {
	fQuantity=10;gliQuantity=10;civicQuantity=10;cultusQuantity=10;
	Queue<String> cars = new LinkedList<>();
// adding cars to the queue
	cars.add(fortuner);
	cars.add(corolla);
	cars.add(civic);
	cars.add(cultus);
	// asking the cars to be booked
	mainFunction();
	
	}
	public static void mainFunction(){
		int n;
		System.out.println("\n1.  Go to manu");
		n = sc.nextInt();
		if(n==1){
		System.out.println("Which car do you want to reserve...........?");
	new ShowCars();
	carId = sc.nextInt();
	if(carId==1){bookCar("Fortuner");mainFunction();}
	else if(carId==2){bookCar("Corolla");mainFunction();}
	else if(carId==3){bookCar("Civic");mainFunction();}
	else if(carId==4){bookCar("Cultus");mainFunction();}
	else if(carId==5){showQty();}
	else System.out.println("Insert Valid Number"); mainFunction();}
	else mainFunction();
	}
	public static int getQuantity(String car){
		String s = car.toUpperCase();
		if(car=="Fortuner"){return fQuantity;}
		if(car=="Corolla"){return gliQuantity;}
		if(car=="Civic"){return civicQuantity;}
		if(car=="Cultus"){return cultusQuantity;}
		else return -1;
	}
	public static void showQty(){
	System.out.println("Fortuner "+fQuantity);
	System.out.println("Corolla "+gliQuantity);
	System.out.println("civic "+civicQuantity);
	System.out.println("cultus "+cultusQuantity);		
	}
	public static void bookCar(String car){
		if(car=="Fortuner"){
			if(getQuantity(car)<1){
				System.out.println("Not Available");return;
			}else {
			fQuantity=reduceSize(fQuantity);System.out.println("booked");return;
			}
		} // end of if statement
		if(car=="Corolla"){
			if(getQuantity(car)<1){
				System.out.println("Not Available");return;
			}else {
			gliQuantity=reduceSize(gliQuantity);System.out.println("booked");return;
			}
		} // end of if statement
		if(car=="Civic"){
			if(getQuantity(car)<1){
				System.out.println("Not Available");return;
			}else {
			civicQuantity=reduceSize(civicQuantity);System.out.println("booked");return;
			}
		} // end of if statement
		if(car=="Cultus"){
			if(getQuantity(car)<1){
				System.out.println("Not Available");return;
			}else {
			cultusQuantity=reduceSize(cultusQuantity);System.out.println("booked");return;
			}
		} // end of if statement
		else System.out.println("car not found");
	}
	public static int reduceSize(int size){
		return size-=1;
	}
}