package quantum.core;

import quantum.llm.QuantumLLM;

public class QuantumCore {
    private final Memory memory;
    private final IntentParser intentParser;
    private final QuantumLLM llm;

    public QuantumCore() {
        memory = new Memory();
        intentParser = new IntentParser();
        llm = new QuantumLLM(memory);
    }

    public String processInput(String input) {
        String intent = intentParser.parseIntent(input);
        memory.storeInteraction(input, response);
        return response;
    }
}