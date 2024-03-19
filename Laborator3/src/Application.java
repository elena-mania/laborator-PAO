import model.*;
import service.*;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        StorageService meniu = new StorageService();

        while (true) { //bucla infinita pentru meniu
            System.out.println("\nAvailable commands:\n" +
                    "create\n" +
                    "read\n" +
                    "update\n" +
                    "delete\n" +
                    "quit\n" +
                    "Enter command:");
            String command = read.nextLine(); //citim comanda

            switch (command) {
                case "update":
                    meniu.Update();
                    break;
                case "create":
                    meniu.Create();
                    break;
                case "delete":
                    meniu.Delete();
                    break;
                case "read":
                    meniu.Read();
                    break;
                case "quit":
                    System.out.println("Quitting the program.");
                    return;
                default:
                    System.out.println("Invalid command!");
            }
        }
    }
}
