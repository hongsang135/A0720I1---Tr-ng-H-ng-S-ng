package b16_io_text_file.bai_tap.doc_file_csv;

import java.io.*;

public class ReadFileCsv {
    public static final String PATH_FILE = "src/b16_io_text_file/bai_tap/doc_file_csv/nation.csv";

    public static void main(String[] args) {
        File file = new File(PATH_FILE);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try{
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null){
                String[] splitData = line.split(",");
                for (String data:splitData){
                    System.out.print(data+ ", ");
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
