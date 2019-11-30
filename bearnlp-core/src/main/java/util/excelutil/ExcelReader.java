package util.excelutil;

/**
 * @author bobzhang
 */
public interface ExcelReader {

    static ExcelReader getInstance() {
        return ExcelReaderInstance.EXCEL_READER_INSTANCE;
    }

    class ExcelReaderInstance {
        private static final ExcelReader EXCEL_READER_INSTANCE = new ExcelReaderImpl();
    }

    /**
     * @author bobzhang
     */
    void test();
}
