import java.io.*;

public class HomeWorkApp {

    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:/GIT/gb/src/file.csv"))) {
            writer.write("Value 100,Value 200,Value 300\n");
            writer.write("100,200,300\n");
            writer.write("200,250,350\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        AppData appData = new AppData();
        int [][] data = new int[2][3];
        int index = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader("C:/GIT/gb/src/file.csv"))) {
            String str;
            while ((str = reader.readLine()) != null) {
                System.out.println(str);

                String[] arr = str.split(",");
                if(index == 0) {
                    appData.setHeader(arr);
                }else{
                    int[] result = new int[arr.length];
                    for (int i = 0; i < arr.length; i++) {
                        result[i] = Integer.parseInt(arr[i]) - 100;
                    }
                    data[index - 1] = result;
                }
                index++;
            }
            appData.setData(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(appData);
        save(appData);
        System.out.println(appData);
    }

    public static void save(AppData appData){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:/GIT/gb/src/file.csv"))) {
            writer.write(String.join(",", appData.getHeader()) + "\n");
            int[][] data = appData.getData();
            for(int i = 0; i < 2; i++){
                String line = "";
                for(int j = 0; j < 3; j++){
                    line += data[i][j] + (j != 2 ? "," : "");
                }
                writer.write(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}



