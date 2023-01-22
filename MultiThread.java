package MultiThread;

import java.lang.Thread;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;

class DoDisksThread extends Thread {
	public void run() {
		HouseholdChores.do_disks();
	}
}

class DoLaundryThread extends Thread {
	public void run() {
		HouseholdChores.do_laundry();
	}
}

class CleanFloorThread extends Thread {
	public void run() {
		HouseholdChores.clean_floor();
	}
}

public class MultiThread {

	public static void main(String[] args) {

		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		LocalDateTime start = LocalDateTime.now();
		LocalDateTime finish = LocalDateTime.now();

		// without multiprocessing
		
		System.out.println("*** Start at " + start.format(format));
		HouseholdChores.do_disks();
		HouseholdChores.clean_floor();
		HouseholdChores.do_laundry();
		
		System.out.println("*** Finish at " + finish.format(format));
		System.out.println("Total time taken = " + start.until(finish, ChronoUnit.SECONDS));
		System.out.println("------------------------------");
		// with multiprocessing
		DoDisksThread disk = new DoDisksThread();
		DoLaundryThread laundry = new DoLaundryThread();
		CleanFloorThread floor = new CleanFloorThread();

		start = LocalDateTime.now();
		System.out.println("*** Start at " + start.format(format));
		disk.start();
		laundry.start();
		floor.start();
		finish = LocalDateTime.now();
		System.out.println("*** Finish at " + finish.format(format));
		System.out.println("Total time taken = " + start.until(finish, ChronoUnit.SECONDS));

		//SecondMostFrequentChar.second_most_frequent_char("Successes");
		
	}

}
