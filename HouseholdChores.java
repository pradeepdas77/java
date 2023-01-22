package MultiThread;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HouseholdChores {
	static DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

	public static void do_disks() {
		try {
			System.out.println("Started doing disks at " + LocalDateTime.now().format(format));
			Thread.sleep(5000);
			System.out.println("Finished doing disks at " + LocalDateTime.now().format(format));

		} catch (Exception e) {

			// catching the exception
			System.out.println(e);
		}
	}

	public static void clean_floor() {
		try {
			System.out.println("Started cleaning floor at " + LocalDateTime.now().format(format));
			Thread.sleep(10000);
			System.out.println("Finished cleaning floor at " + LocalDateTime.now().format(format));

		} catch (Exception e) {

			// catching the exception
			System.out.println(e);
		}
	}

	public static void do_laundry() {
		try {
			System.out.println("Started doing laundry  at " + LocalDateTime.now().format(format));
			Thread.sleep(5000);
			System.out.println("Finished doing laundry at " + LocalDateTime.now().format(format));

		} catch (Exception e) {

			// catching the exception
			System.out.println(e);
		}
	}

}
