/*
 * Marcox C. Mediran
 * BSCS2_1
 * Object Oriented Programming
*/

package mmediran.oop.lesson02;

public class Activity3 {
	public static void main(String[] args) {
		// Personal Information (8)
		String name = "Marcox C. Mediran";
		String nick = "Macmac";
		String gender = "Male";
		String birthday = "September 23, 2003";
		int age = 20;
		String address = "Cavite, Philippines";
		String school = "PUP Sta. Mesa";
		String course = "BS Computer Science";

		// Facts about me (5)
		String petInfo = "African Lovebird (Green)";
		String petName = "Bird";
		String phoneOs = "Android";
		String desktopOs = "Linux";
		String hobies = "Robotics, Programming, Electronics";

		// Favorites (7)
		String favSeries = "Mr. Robot";
		String favMovie = "Morbius (2022)";
		String favBook = "Konosuba";
		String favColor = "Green";
		String favGames = "Team Fortress 2, Tetris";
		String favSong = "San Francisco Street - Sun Rai";
		String favBand = "PREP";


		// Print
		System.out.printf("-----------------------------------\n");
		System.out.printf("|     Know something about me     |\n");
		System.out.printf("-----------------------------------\n");
		System.out.printf("Name: %s\t\tPet: %s\t\t\tFavorite Series: %s\n", name, petInfo, favSeries);
		System.out.printf("Nickname: %s\t\tPet Name: %s\t\t\t\t\tFavorite Movie: %s\n",nick, petName, favMovie);
		System.out.printf("Gender: %s\t\t\tPhone: %s\t\t\t\t\tFavorite Book: %s\n",gender, phoneOs,favBook);
		System.out.printf("Birthday: %s\tDesktop: %s\t\t\t\t\tFavorite Color: %s\n", birthday, desktopOs, favColor);
		System.out.printf("Age: %d\t\t\t\tHobies: %s\tFavorite Games: %s\n", age, hobies, favGames);
		System.out.printf("Address: %s\t\t\t\t\t\t\tFavorite Song: %s\n", address, favSong);
		System.out.printf("School: %s\t\t\t\t\t\t\t\tFavorite: Band: %s\n", school, favBand);
		System.out.printf("Course: %s\n", course);

	}
}
