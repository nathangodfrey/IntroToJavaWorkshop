package day3;

import java.io.IOException;

import javax.swing.JOptionPane;

public class StephenHawking {

	// 1. make a main method and put steps 2, 3 & 4 inside it
public static void main(String[] args) {
	// Put this sentence in a pop up:
	// If you find yourself having to cross a piranha-infested river, here's how to do it...
speak( "If you find yourself having to cross a piranha infested river, here's how to do it" );
	// Get the user to enter an adjective
String adjective=JOptionPane.showInputDialog("please enter an adjective");
	// Get the user to enter a type of liquid
String liquid=JOptionPane.showInputDialog("please enter a type of liquid");
	// Get the user to enter a body part
String bodypart=JOptionPane.showInputDialog("please enter a body part");
	// Get the user to enter a verb
String verb=JOptionPane.showInputDialog("please enter a verb");
	// Get the user to enter a place
String place=JOptionPane.showInputDialog("please enter a place ");
speak( "Piranhas are more "+ adjective);
speak( "Piranhas are attracted to fresh"+ liquid+ "and will most likely take a bite out of your"+bodypart+"if you"+verb);
speak( "Whatever you do,if you have an open wound,try to find another way to get to the"+place);
	// Fit the user's words into this sentence, and save it in a String:
	// Piranhas are more [adjective] during the day, so cross the river at
	// night. Piranhas are attracted to fresh [type of liquid] and will most
	// likely take a bite out of your [body part] if you [verb]. Whatever
	// you do, if you have an open wound, try to find another way to get
	// back to the [place]. Good luck!
	
	// Make a pop-up for the final story. You can use \n to go to the next line.

speak("hello");}
	// 2. ask the user for a sentence
	// 3. call the speak method below and send it the sentence
	// 4. repeat steps 2 and 3 a lot of times

	/* Don’t change this…. */
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
