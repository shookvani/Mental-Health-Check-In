import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Main {
	static int score = 0;
	static JLabel question = new JLabel();
    static JButton bad = new JButton("bad");
    static JButton good = new JButton("good");
  	static  JLabel label = new JLabel();
  	static  JLabel label2 = new JLabel();
  	static String songh;
  	static String songs;
  	static String song;
  	static String input;
  	static Scanner scan = new Scanner(System.in);
	static JFrame frame = new JFrame("Check-in");
 	public static void main(String[] args) {

    
	    frame.setSize(1500, 1000);
	    frame.setLayout(null);

	    label.setBounds(50,100,600,500);
	    label.setFont(new Font("Arial", Font.PLAIN, 24));
	    label.setForeground(Color.BLACK);

	    label2.setBounds(50,200,1500,500);
	    label2.setFont(new Font("Arial", Font.PLAIN, 24));
	    label2.setForeground(Color.BLACK);

	  	frame.add(label);
	  	frame.add(label2);
	  
	    label.setText("THIS IS A DAILY CHECK-IN");

	    label2.setText("Answer the 3 questions in the terminal, then on the screen. The first question has a follow-up in the terminal.");
	    questionone();
    	frame.setVisible(true);

		System.out.println("A favorite happy song of yours:");
		songh=scan.nextLine();
		System.out.println("A sad song that makes you feel better:");
		songs=scan.nextLine();
		System.out.println("Just a random song you like:");
		song=scan.nextLine();

		System.out.println("");
		System.out.println("You can go to the screen now :)");
 
	}


	private static void questionone(){
		question.setBounds(200,200,600,50);
	    question.setFont(new Font("Arial", Font.PLAIN, 24));
	    question.setForeground(Color.BLUE);

		frame.add(question);

	    question.setText("How are you?");


	    good.setBounds(160, 160, 100, 50);
	    frame.add(good);


		bad.setBounds(260,160,100,50);
	    frame.add(bad);


	    good.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent e) {
	      	score++;
	      	question.setText("Why do you feel good?");
		    System.out.println("Explain here:");
		    input=scan.nextLine();

	     	questiontwo();

	   		 	      	

	    
	      }    });

	    bad.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent e) {
	      	score--;
	      	question.setText("Why do you feel bad?");
		    System.out.println("Explain here:");
		    input=scan.nextLine();
		    questiontwo();
		    
	   

	      	}});


	}



	private static void questiontwo() {
	    question.setText("How do you think your friends are treating you?");

	    good.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		score++;
      		 end();
      		 

      	}});
      	
      	bad.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		score--;      	
      		 end();
 
      }    });
	}


	private static void questionthree() {

		
	}


	private static void end() {
		System.out.println("For now, these are all the questions. Your score will be printed out.");
		System.out.println("If your score is less than 0, you aren't doing that great. If it is greater than 0, you are. If it is at 0, you are doing meh. I hope you can use these results to check-in on yourself.");
		System.out.println("");
   		System.out.println("Your score: "+score);
   		System.out.println("This is why you are feeling good/bad today. Perhaps you can reflect back on this. I recommend saving these enteries so you have a running list and you can always look back to see.          "+ input);
   		if (score>0) {
   			System.out.println("A happy song you would recommend to continue on your happy day: "+songh);
   			    	System.out.println("Have a nice day :)");
   		}
   		else if(score<0) {
   			System.out.println("A sad song you would recommend to continue on your sad day: "+songs);
   			System.out.println("Check-in / talk to someone if that helps!");
   			System.out.println("I hope you feel better!");

   		}
   		else {
   			System.out.println("A random song you would recommend to continue on your day: "+song);
    		System.out.println("Have a nice day :)");

   		}

    	System. exit(0);

	}


}