package word;

import util.ExcelUtil;

/**
 * @author bobzhang
 */
public class WordPreprocessor {

    public WordPreprocessor() {

    }

    public static WordPreprocessor getInstance() {
        return WordpreprocessorInstance.wordpreprocessorInstance;
    }

    public int WordsGenerate() {
        ExcelUtil excelUtil = ExcelUtil.getInstance();
        excelUtil.test();
        return 1;
    }

    private static class WordpreprocessorInstance {
        private static WordPreprocessor wordpreprocessorInstance = new WordPreprocessor();
    }

}
