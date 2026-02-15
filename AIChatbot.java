import java.util.Scanner;

public class AIChatbot {

    public static String getResponse(String input) {

        input = input.toLowerCase();

        if (input.contains("hello") || input.contains("hi")) {
            return "Hello! How can I assist you today?";
        }

        else if (input.contains("your name")) {
            return "I am a Java-based AI Chatbot.";
        }

        else if (input.contains("stock")) {
            return "You can trade stocks using the Stock Trading Platform system.";
        }

        else if (input.contains("help")) {
            return "I can answer basic questions. Try asking about stocks or greetings.";
        }

        else if (input.contains("bye")) {
            return "Goodbye! Have a great day!";
        }

        else {
            return "I'm not sure about that. Can you rephrase?";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("AI Chatbot Started. Type 'bye' to exit.");

        while (true) {
            System.out.print("You: ");
            String userInput = sc.nextLine();

            String response = getResponse(userInput);
            System.out.println("Bot: " + response);

            if (userInput.equalsIgnoreCase("bye")) {
                break;
            }
        }

        sc.close();
    }
}
