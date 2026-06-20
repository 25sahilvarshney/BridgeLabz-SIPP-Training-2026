import java.io.*;
import java.util.*;

class SchoolResultPortal {
    public static void main(String[] args) {
        String inputFile = "students.txt";   
        String outputFile = "reportCard.txt"; 

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile, true))) {
                bw.write("----- Report Card -----\n");

                while ((line = br.readLine()) != null) {
                    String[] parts = line.split("\\s+");
                    String name = parts[0];

                    double sum = 0;
                    for (int i = 1; i < parts.length; i++) {
                        sum += Double.parseDouble(parts[i]);
                    }
                    double avg = sum / (parts.length - 1);

                    bw.write("Student: " + name + " | Average Marks: " + avg + "\n");
                }

                bw.write("-----------------------\n\n");
                System.out.println("Report card generated successfully!");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: Input file not found. Please check the file path.");
        } catch (IOException e) {
            System.out.println("Error reading or writing file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid marks format in input file.");
        }
    }
}
