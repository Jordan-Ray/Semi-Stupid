package first.view;

import first.model.Thingy;
import java.util.Scanner;

public class ConsoleView
{
	// declare a scanner object to use in the console
	private Scanner wordScanner;
	/**
	 * 
	 */
	private Thingy testThingy;

	public void start()
	{
		reallyMeetTheThingy();
	}

	private void meetTheThingy()
	{
		System.out.println("here is a Thingy" + testThingy.getName());
		System.out.println("What do you want to change my name to?");

		String newName = wordScanner.nextLine();

		System.out.print("Are you really sure my name should be: " + newName
				+ "Reeaallly?");
		System.out.println("Type Yes or No");

		String answer = wordScanner.nextLine();

		if (answer.equalsIgnoreCase("yes"))
		{
			System.out.println("I love my new name");
			testThingy.setName(newName);
			System.out.println("My new name is: " + testThingy.getName());

		}
		else if (answer.equals("no"))
		{
			System.out.println(" I never liked the name of: " + newName
					+ " anyway ");
		}

		else
		{
			System.out.println(" stop typing gibberish");
			meetTheThingy();
		}

	}

	private void reallyMeetTheThingy()
	{
		System.out.println("Hullo, I am the Thingy of Destiny!");
		System.out.println("I am going to ask you a couple of questions. ");
		System.out.println("What is your favorite food?");

		String newFood = wordScanner.nextLine();

		System.out.println("I love " + newFood + " too! What are the odds.");
		System.out.println("Ok, What is your favorite Movie?");

		String newMovie = wordScanner.nextLine();

		System.out.println("Oh, My, Gosh, I love " + newMovie + " too!");
		System.out.println("Now, for the final question. What is your name?");

		String newName = wordScanner.nextLine();

		System.out
				.println("You are not going to beleive me when I say this but, "
						+ newName + " is my name also.");  
		System.out.     
				println("I didn't tell you my real name because i was scared you would make fun of it.");
		System.out.println("Well, now you know me.");

	}

	public ConsoleView()
	{
		wordScanner = new Scanner(System.in);
		testThingy = new Thingy();
	}

	public void questionsToAsk()
	{

		System.out.println(" Hullo, what is your name?");

		getWords();
		System.out.println(" Whats your favorite color?");
		getWords();
		System.out
				.println(" Fine, lets stump you. What is the Capital of Great Britain?");
		getWords();
		System.out
				.println(" Not bad, What is the AirSpeedc Velocity of an Unladen Swallow?");
		getWords();
	}

	private void getWords()
	{
		String test = wordScanner.nextLine();
		System.out.print("yout typed this to me: ");
		System.out.println(test);

	}

	/**
	 * Ask the User Four Questions. Print their answers.
	 */

}
