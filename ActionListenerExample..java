import java.awt.*;  
import java.awt.event.*;  
//step2 implements ActionListenerInterface  
// ActionListenerExample class implements the ActionListener interface  
public class ActionListenerExample implements ActionListener {  
    public static void main(String[] args) {  
        // Create a Frame (window)  
        Frame f = new Frame("ActionListener Example");  
        // Create a TextField  
        final TextField tf = new TextField();  
        tf.setBounds(50, 50, 150, 20);  
        // Create a Button  
        Button b = new Button("Click Here");  
        b.setBounds(50, 100, 60, 30);  
        // Step 3: Register ActionListener with the Button  
        b.addActionListener(new ActionListenerExample());  
        // Add components to the Frame  
        f.add(b);  
        f.add(tf);  
        // Set Frame properties  
        f.setSize(400, 400);  
        f.setLayout(null);  
        f.setVisible(true);  
    }  
    // Step 4: Implement actionPerformed method  
    public void actionPerformed(ActionEvent e) {  
        // actionPerformed method is called when the button is clicked  
        // Set the text of the TextField to "Welcome to Javatpoint."  
        tf.setText("Welcome to Javatpoint.");  
    }  
}  