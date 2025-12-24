package quantum.core;

import java.util.HashMap;
import java.util.Map;

public class Memory {
    private final Map<String, String> interactions;

    public Memory() {
        interactions = new HashMap<>();
    }

    public void storeInteraction(String input, String response) {
        interactions.put(input, response);
    }

    public String retrieveResponse(String input) {
        return interactions.getOrDefault(input, "I don't have a response for that.");
    }
}