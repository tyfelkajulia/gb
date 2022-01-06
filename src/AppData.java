import java.util.Arrays;

public class AppData {

    private String [] header;
    private int [][] data;

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public AppData() {
    }

    public String[] getHeader() {
        return header;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public int[][] getData() {
        return data;
    }

    public void setData(int[][] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        String result = "AppData{" +
                "header=" + Arrays.toString(header) + "  data: ";
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                result += data[i][j] + ",";
            }
            result += ";";
        }
        return result + "}";
    }
}
