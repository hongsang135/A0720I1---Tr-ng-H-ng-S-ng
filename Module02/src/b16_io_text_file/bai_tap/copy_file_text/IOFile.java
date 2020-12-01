package b16_io_text_file.bai_tap.copy_file_text;

import java.io.*;

public class IOFile {
    public static final String SOURCE_PATH = "src/b16_io_text_file/bai_tap/copy_file_text/source_file.csv";
    public static final String TARGET_PATH = "src/b16_io_text_file/bai_tap/copy_file_text/target_file.csv";

    public static void copyFile(String sourcePath, String targetPath) {
        File sourceFile = new File(sourcePath);
        File targetFile = new File(targetPath);
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        int count = 0;
        try {
            fileReader = new FileReader(sourceFile);
            bufferedReader = new BufferedReader(fileReader);
            fileWriter = new FileWriter(targetFile);
            bufferedWriter = new BufferedWriter(fileWriter);
            int num = 0;
            char character;
            while ((num = bufferedReader.read()) != -1) {
                character = (char) num;
                bufferedWriter.append(character);
                count++;
            }
        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
                bufferedWriter.flush();
                bufferedWriter.close();
                System.out.println("Hoàn tất\nSố ký tự là: " + count);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args){
        copyFile(SOURCE_PATH, TARGET_PATH);
    }
}
