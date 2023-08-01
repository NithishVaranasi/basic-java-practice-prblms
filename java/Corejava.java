/*import java.util.*;
class Corejava
{
	public static void main(String a[])
	{
		int charcount=0;
		int whitecnt=0;
		Scanner sc =new Scanner(System.in);
		String text=sc.nextLine();
		for(int i=charcount;i<text.length();i++)
		{
			if(text.charAt(i)!=' ')
			{
				charcount++;
			}
		}
		for(int i=whitecnt;i<text.length();i++)
		{
			if(text.charAt(i)==' ')
			{
				whitecnt++;
			}
		}
		String char1[]=text.split("\\s");
		int length=char1.length;
		//System.out.println("ELLORUM NALAM...");
		System.out.println("total no.of words: "+length);
		System.out.println("total no.of charcters: "+charcount);
		System.out.println("total no.of charcters: "+whitecnt);
	}
}	*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CoreJavaGUI extends JFrame implements ActionListener {
    private JTextField inputTextField;
    private JLabel wordsLabel;
    private JLabel charLabel;
    private JLabel whitespaceLabel;

    public CoreJavaGUI() {
        setTitle("Character and Word Counter");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create components
        inputTextField = new JTextField(20);
        JButton countButton = new JButton("Count");
        wordsLabel = new JLabel("Total number of words: ");
        charLabel = new JLabel("Total number of characters: ");
        whitespaceLabel = new JLabel("Total number of whitespace characters: ");

        // Set layout
        setLayout(new FlowLayout());

        // Add components to the frame
        add(inputTextField);
        add(countButton);
        add(wordsLabel);
        add(charLabel);
        add(whitespaceLabel);

        // Attach ActionListener to the button
        countButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = inputTextField.getText();
        int wordCount = text.split("\\s+").length;
        int charCount = text.replaceAll("\\s+", "").length();
        int whitespaceCount = text.length() - charCount;

        wordsLabel.setText("Total number of words: " + wordCount);
        charLabel.setText("Total number of characters: " + charCount);
        whitespaceLabel.setText("Total number of whitespace characters: " + whitespaceCount);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CoreJavaGUI gui = new CoreJavaGUI();
            gui.setVisible(true);
        });
    }
}
	