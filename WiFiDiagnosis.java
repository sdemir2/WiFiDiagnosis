/**
 * Class: CMSC203-25800
 * Description: This problem can assist someone
 * who might not have wifi connection during covid.
 * Simply, one can open this program and answer the
 * questions and follow the suggestion laid out on
 * the program.
 * 
 * Today's date:	09/06/2020
 * Programmer: 		Samet Demir
 * 
 * PSEUDOCODE:
 *   Start
 *   Initializing variables
 *   Give a clear explanation
 *   Display firstStep
 *   Ask the user yes/no question
 *    If yes, print problemSolved
 *    If no, jump to the next try
 *   Display secondStep
 *   Ask the user yes/no question
 *    If yes, print problemSolved
 *    If no, jump to the next try
 *   Display thirdStep
 *   Ask the user yes/no question
 *    If yes, print problemSolved
 *    If no, jump to the next try
 *   Display fourthStep
 *   Ask the user yes/no question
 *    If yes, print problemSolved
 *    If no, jump to the next try
 *   Display fifthStep
 *    Recommend the user contacting ISP
 *    Explain he/she needs to connect router
 *   End
*/

//Insert Scanner feature
import java.util.Scanner;

//Insert class type 
public class WiFiDiagnosis {

	public static void main(String[] args) {

		// Initializing the steps
		String	firstStep = "reboot your computer", 
				secondStep = "reboot your router",
				thirdStep = "make sure the cables " + 
							"to your router are " + 
							"plugged in firmly and " +
							"your router is getting power",
				fourthStep = "move your computer " + 
							"closer to your router", 
				fifthStep = "contact your ISP";

		// Initializing useful string variables
		String problemSolved = "seemed to work";
		String answer; //Input variable

		// Explanation of what this program does
		System.out.println(
				"If you have a problem with " + 
				"internet connectivity, " + 
				"this WiFi Diagnosis might work.\n");

		////////////////
		// FIRST STEP //
		////////////////
		
		System.out.println("First step: " + firstStep);
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		System.out.println(	"Are you able to connect with "+
							"the internet (yes or no)");
		answer = keyboard.nextLine();
		if (answer.equalsIgnoreCase("yes")) {
			System.out.println(	"Rebooting your computer " + 
								problemSolved);
		} else {
			System.out.println(	"Second step: " + 
								secondStep);
			System.out.println(	"Now are you able to connect with" + 
								" the internet? (yes or no)");
			answer = keyboard.nextLine();

			/////////////////
			// SECOND STEP //
			/////////////////
			
			if (answer.equalsIgnoreCase("yes")) {
				System.out.println("Rebooting your router " + 
									problemSolved);
			} else {
				System.out.println(	"Third step: " + 
									thirdStep);
				System.out.println(	"Now are you able to connect with" + 
									" the internet? (yes or no)");
				answer = keyboard.nextLine();

				////////////////
				// THIRD STEP //
				////////////////
				
				if (answer.equalsIgnoreCase("yes")) {
					System.out.println("Checking the router's cables " + 
										problemSolved);
				}

				else {
					System.out.println(	"Fourth step: " + 
										fourthStep);
					System.out.println(	"Now are you able to connect with" + 
										" the internet? (yes or no)");
					answer = keyboard.nextLine();

					/////////////////
					// FOURTH STEP //
					/////////////////
					
					if (answer.equalsIgnoreCase("yes")) {
						System.out.println(	"Moving your computer " + 
											problemSolved);
					}
					
						/////////////////////
						// FIFTH STEP: END //
						/////////////////////

					else {
						System.out.println(
								"Fifth step: " + fifthStep + 
								"\nMake sure your ISP is hooked up" + 
								" to your router.");
					}
				}
			}
		}
		
	}

}
