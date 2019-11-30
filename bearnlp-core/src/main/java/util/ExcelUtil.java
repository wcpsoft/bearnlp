package util;

import util.excelutil.ExcelReader;

/**
 * @author bobzhang
 */
public class ExcelUtil {

    private static ExcelReader excelReader = null;

    public ExcelUtil() {
        excelReader = ExcelReader.getInstance();
    }

    public static ExcelUtil getInstance() {
        return ExcelUtilInstance.excelUtilInstance;
    }

    private static class ExcelUtilInstance {
        private static ExcelUtil excelUtilInstance = new ExcelUtil();
    }

    public void test() {
        excelReader.test();
    }

}
