package _00_Intro_To_Arrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/* Run the FindHiddenButton.jar to see the finished product. */

public class _03_FindTheHiddenButton implements ActionListener{
    JFrame window;
    JPanel panel;
int numinputi;
boolean validInt = false;
    // 1. create an array of JButtons. Don't initialize it yet.
JButton[] jba;
    // 2. create an integer variable called hiddenButton
int hiddenbutton;
    public static void main(String[] args) {
        new _03_FindTheHiddenButton().start();
    }

    public void start() {
        window = new JFrame("Find the Button");
        panel = new JPanel();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 3. Ask the user to enter a positive number and convert it to an int
        while (validInt == false) {
        	String numinputs = JOptionPane.showInputDialog("Enter a POSITIVE integer.");
        	int numinputi;
        	numinputi = Integer.parseInt(numinputs);
	if(numinputi>666|numinputi <1) {
		JOptionPane.showMessageDialog(null, "Sorry, Invalid Integer. Try Another.");
System.exit(0);
	}
	else {
		validInt = true;
		jba = new JButton[numinputi];

	
	

	
	
	

	
	


        // 4. Initialize the array of JButtons to be the size of the int
        //    created in step 3
for (int i = 0; i < jba.length; i++) {
	jba[i] = new JButton();
	jba[i].addActionListener(this);
	panel.add(jba[i]);
}
        // 5. Make a for loop to iterate through the JButton array
        
            // 6. initialize each JButton in the array
        
            // 7. add the ActionListener to each JButton
        
            // 8. add each JButton to the panel

        // 9 add the panel to the window
window.add(panel);
        // 10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
window.setExtendedState(JFrame.MAXIMIZED_BOTH);
        // 11. set the JFrame to visible.
window.setVisible(true);
        // 12. Give the user the instructions for the game.
JOptionPane.showMessageDialog(null, "To play find the hidden button, enter a number.\n This will be the amount of buttons to search.");
        // 13. initialize the hiddenButton variable to a random number less than
        //     the int created in step 3
Random randn = new Random();
hiddenbutton =randn.nextInt(numinputi);


        // 14. Set the text of the JButton located at hiddenButton to read "ME"
jba[hiddenbutton].setText("ME");
        // 15. Use Thread.sleep(100); to pause the program.
try {
	Thread.sleep(100);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
        // 16. Set the text of the JButton located at hiddenButton to be blank.
jba[hiddenbutton].setText("");
	}
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton buttonClicked = (JButton)e.getSource();
if (buttonClicked == jba[hiddenbutton]) {
	JOptionPane.showMessageDialog(null, "You Did it!!!");
	System.exit(0);
}
else {
	JOptionPane.showMessageDialog(null, "You've failed, try again.");
	
}
        // 17. if the hiddenButton is clicked, tell the user that they win.
        // 18. else tell them to try again
    }
    

}
