import java.io.*;
import java.util.Scanner;

public class Solution {

    public void solution() throws IOException {

        String[] head;
        int result = 0;
        try (Scanner scanner = new Scanner(new FileInputStream("C:\\Users\\ferfe\\IdeaProjects\\module_10\\src\\text.txt"));
             FileWriter writer = new FileWriter(new File("C:\\Users\\ferfe\\IdeaProjects\\module_10\\src\\test111.txt"), false)) {

            head = scanner.nextLine().split(";");

            while (scanner.hasNextLine()) {
                String[] buy = scanner.nextLine().split(";");
                result += Integer.parseInt(buy[1]) * Integer.parseInt(buy[2]);
            }

            writer.write(result);
            writer.flush();
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println("Проблема с файлами: " + e.getMessage());
        }
    }
}
