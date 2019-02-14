import java.io.*;
import java.util.*;
import javax.swing.*;

public class Knapsack {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of available employee work weeks: ");
        int workWeeks = input.nextInt();
        System.out.println("Please select a file.");
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            System.out.print("Please enter the name of the output file: ");
            String outputFileName = input.next();
            fillKnapsack(selectedFile, workWeeks, outputFileName);
        }
    }

    public static void fillKnapsack(File file, int weeks, String outputName) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            try {
                String st;
                while((st = br.readLine()) != null) {
                    System.out.println(st);
                }
            }
            catch (IOException ex) {
                System.out.println("Whoops");
            }

        }
        catch (FileNotFoundException ex) {
            System.out.println("Whoops");
        }
    }

}
