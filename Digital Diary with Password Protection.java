import java.util.ArrayList;
import java.util.Scanner;

class DiaryEntry {

    private String date;
    private String title;
    private String note;

    public DiaryEntry(String date, String title, String note) {
        this.date = date;
        this.title = title;
        this.note = note;
    }

    public void display() {
        System.out.println("------------------------------");
        System.out.println("Date  : " + date);
        System.out.println("Title : " + title);
        System.out.println("Note  : " + note);
    }
}

public class DigitalDiary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<DiaryEntry> diary = new ArrayList<>();

        final String PASSWORD = "1234";

        System.out.println("===== Digital Diary =====");
        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        if (!password.equals(PASSWORD)) {
            System.out.println("Access Denied!");
            sc.close();
            return;
        }

        System.out.println("Login Successful!");

        int choice;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Add Diary Entry");
            System.out.println("2. View All Entries");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Date (DD-MM-YYYY): ");
                    String date = sc.nextLine();

                    System.out.print("Title: ");
                    String title = sc.nextLine();

                    System.out.print("Write Note: ");
                    String note = sc.nextLine();

                    diary.add(new DiaryEntry(date, title, note));

                    System.out.println("Diary entry saved successfully.");
                    break;

                case 2:

                    if (diary.isEmpty()) {
                        System.out.println("No diary entries found.");
                    } else {
                        for (DiaryEntry entry : diary) {
                            entry.display();
                        }
                    }

                    break;

                case 3:

                    System.out.println("Diary closed.");
                    break;

                default:

                    System.out.println("Invalid choice.");
            }

        } while (choice != 3);

        sc.close();
    }
}
