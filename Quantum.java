package quantum;

import quantum.core.QuantumCore;
import java.util.Scanner;

public class Quantum {
    public static void main(String[] args) {
        QuantumCore quantumCore = new QuantumCore();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Now Online");
        
        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("exit")) {
                break;
            }
            String response = quantumCore.processInput(userInput);
            System.out.println("Quantum: " + response);
        }
        
        scanner.close();
        System.out.println("Goodbye!");
    }
}