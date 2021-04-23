import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    private static final int CHECKPOINT_NUM = 1;
    private static final String QUESTIONS_FILE = "questions.txt";
    private static final String QUIZ_FILE = "quiz.txt";

    private static final String INTRO_TEXT1 = "\nQuiz Checkpoint %d\n";
    private static final String INTRO_TEXT2 = "\nPlease only use your memory to answer the %d questions.";
    private static final String INTRO_TEXT3 = "\nIf you're wrong about something, you can still edit the `%s` file at the end.\n";
    private static final String ANSWER_TEXT1 = "\nAnswer:";
    private static final String OUTRO_TEXT1 = "\nThe %s file has been generated, you can edit it manually if you want to change it.\n";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Path path = Paths.get(QUIZ_FILE);

        ArrayList<String> questions = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(QUESTIONS_FILE))) {
            while (br.ready()) {
                questions.add(br.readLine());
            }

            System.out.printf(INTRO_TEXT1, CHECKPOINT_NUM);
            System.out.printf(INTRO_TEXT2, questions.size());
            System.out.printf(INTRO_TEXT3, QUIZ_FILE);

            try (BufferedWriter init = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
                init.close();

                for (int i = 0; i < questions.size(); i++) {
                    try (BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8,
                            StandardOpenOption.APPEND)
                    ) {
                        String question = String.format("%d. %s", i + 1, questions.get(i));
                        System.out.print("\n" + question);
                        System.out.print(ANSWER_TEXT1);
                        String answer = scanner.nextLine();

                        writer.write(question + "\n" + answer + "\n\n");
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }

            System.out.printf(OUTRO_TEXT1, QUIZ_FILE);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}