package word;

public class WordPreprocessor {

    public WordPreprocessor() {

    }

    public static WordpreprocessorInstance getInstance() {
        return WordpreprocessorInstance.wordpreprocessorInstance;
    }

    public int WordsGenerate() {
        return 1;
    }

    private static class WordpreprocessorInstance {
        private static WordpreprocessorInstance wordpreprocessorInstance = new WordpreprocessorInstance();
    }

}
