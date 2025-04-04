import javax.swing.JOptionPane;

public class BurmaShave {
    public static void main(String[] args) {
        
        String[] rhyme = {
            "Shaving brushes",
            "You'll soon see 'em",
            "On a shelf",
            "In some museum",
            "Burma Shave"
        };

       
        for (String line : rhyme) {
            JOptionPane.showMessageDialog(null, line);
        }
    }
}