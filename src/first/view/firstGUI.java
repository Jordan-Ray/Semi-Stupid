package first.view;

import javax.swing.JOptionPane;
import first.model.Thingy;
import first.model.Friend;


public class firstGUI
{
	private Thingy myGUIThingy;
	private Friend Palmer;
	private Friend Karman;
	private Friend Jordan;
	private Friend Manuel;
	private Friend Michael;
	
	
	public firstGUI()
	{
		myGUIThingy = new Thingy();
		Friend Palmer = new Friend();
		Friend Karman = new Friend();
	 	Friend Jordan = new Friend();
	 	Friend Manuel = new Friend();
	 	Friend Michael = new Friend();
		
		
	}
	
	public void start()
	{
//		JOptionPane.showMessageDialog(null, "");
//		JOptionPane.showMessageDialog(null, "");
//		JOptionPane.showMessageDialog(null, "");
		
		makeFriend();
		findOutAboutFriends();
		showAndTell();
		
		
		
		
	}
	
	private void findOutAboutFriends()
	{
		Palmer.setName("Palmer");
		
	}
	
	private void makeFriend()
	{
		Palmer = new Friend("Palmer", "clever", 18, "Rock climbing", true, 150);
		Karman = new Friend("Karman", "Communist", 16, "Anime", true, 500);
		Jordan = new Friend("Jordan", "Sadistic", 16, "Winning", true, 200); 
		Manuel = new Friend("Manuel", "Pokemon", 12, "Red", false, 1295);
		Michael = new Friend("Michael", "Funny Stuff", 16, "Gaming", true, 150.3);
	}
	
	private void showAndTell()
	{
		JOptionPane.showMessageDialog(null, "His name is " + Palmer.getName() + "\n" + "His humor type is " + Palmer.getHumorStyle()  + "\n" + "He is " + Palmer.getAge() + "\n" + "His interest is " + Palmer.getInterest() + "\n" + "He like Pineapple True"  + "\n" + "He weighs " + Palmer.getweight());
		JOptionPane.showMessageDialog(null, "His name is " + Karman.getName() + "\n" + "His humor type is " + Karman.getHumorStyle()  + "\n" + "He is " + Karman.getAge() + "\n" + "His interest is " + Karman.getInterest() + "\n" + "He like Pineapple True"  + "\n" + "He weighs " + Karman.getweight() );
		JOptionPane.showMessageDialog(null, "His name is " + Jordan.getName() + "\n" + "His humor type is " + Jordan.getHumorStyle()  + "\n" + "He is " + Jordan.getAge() + "\n" + "His interest is " + Jordan.getInterest() + "\n" + "He like Pineapple True"  + "\n" + "He weighs " + Jordan.getweight() );
		JOptionPane.showMessageDialog(null, "His name is " + Manuel.getName() + "\n" + "His humor type is " + Manuel.getHumorStyle()  + "\n" + "He is " + Manuel.getAge() + "\n" + "His interest is " + Manuel.getInterest() + "\n" + "He like Pineapple False"  + "\n" + "He weighs " + Manuel.getweight() );
		JOptionPane.showMessageDialog(null, "His name is " + Michael.getName() + "\n" + "His humor type is " + Michael.getHumorStyle()  + "\n" + "He is " + Michael.getAge() + "\n" + "His interest is " + Michael.getInterest() + "\n" +  "He like Pineapple True"  + "\n" + "He weighs " + Michael.getweight() );
	}

//	private void meetTheThingyGUI()
//	{
//		String answer;
//		JOptionPane.showMessageDialog(null, "Hello I am The Thingy Of Destiny");
//		answer = JOptionPane.showInputDialog("Whats your Name?");
//		JOptionPane.showMessageDialog(null, "Ok " + answer + " ,if that is your real name.");
//		JOptionPane.showMessageDialog(null, "Is it your real name?");
//		
//		String newName = JOptionPane.showInputDialog("Type yes or no");
//		
//		if (newName.equalsIgnoreCase("yes"));
//		JOptionPane.showMessageDialog(null, "Ok, " + answer + " I gess that your name could be that");
//		JOptionPane.showMessageDialog(null, ", but if I found out that you lied to me");
//		JOptionPane.showMessageDialog(null, " You would regret it.");
//		
//		
//	}
//	
//	private void checkWrapper()
//	{
//		int age;
//		
//		JOptionPane.showMessageDialog(null, "Hi, let get your age now?");
//		String temp = JOptionPane.showInputDialog("How old are You");
//		
//		age = Integer.parseInt(temp);
//		JOptionPane.showMessageDialog(null, "You are " + age + " years old. Next will be " + (age+1) + " years old" );
//		
//		
//	}
	
/**	private void meetTheThingy()
*		System.out.println("here is a Thingy" + testThingy.getName());
*		System.out.println("What do you want to change my name to?");
*
*		String newName = wordScanner.nextLine();
*
*		System.out.print("Are you really sure my name should be: " + newName
*				+ "Reeaallly?");
*		System.out.println("Type Yes or No");
*
*		String answer = wordScanner.nextLine();
*
*		if (answer.equalsIgnoreCase("yes"))
*		{
*			System.out.println("I love my new name");
*			testThingy.setName(newName);
*		System.out.println("My new name is: " + testThingy.getName());
*
*		}
*		else if (answer.equals("no"))
*		{
*			System.out.println(" I never liked the name of: " + newName
*					+ " anyway ");
*		}
*
*		else
*		{
*			System.out.println(" stop typing gibberish");
*			meetTheThingy();
*		}
*
*/	
	
//	private void interact()
//	{
//		String answer;
//		JOptionPane.showMessageDialog(null, "Let's Chat");
//		answer = JOptionPane.showInputDialog("What is your Name?");
//		//if i do not type an answer null will be stored in my variable.
//		//cancel is the same as pressing the red x in the corner
//		JOptionPane.showMessageDialog(null, "Hullo there " + answer);
//		
//	}
	}
