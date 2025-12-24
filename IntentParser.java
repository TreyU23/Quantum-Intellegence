package quantum.core;

public class IntentParser {
    public Intent parseIntent(String input) {
        String lowerInput = input.toLowerCase();
        if (lowerInput.contains("hello") || lowerInput.contains("hi")) {
            return Intent.GREETING;
        } else if (lowerInput.endsWith("?")) {
            return Intent.QUESTION;
        } else if (lowerInput.startsWith("please") || lowerInput.startsWith("do")) {
            return Intent.COMMAND;
        } else if (lowerInput.contains("bye") || lowerInput.contains("goodbye")) {
            return Intent.FAREWELL;
        } else {
            return Intent.UNKNOWN;
        }
    }
}