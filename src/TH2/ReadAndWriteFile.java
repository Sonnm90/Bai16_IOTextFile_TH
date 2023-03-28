package TH2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {


    public List<Integer> readFile(String path) {
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(path);
            if (!file.exists())
                throw new FileNotFoundException();
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = br.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
            br.close();
        } catch (Exception e) {
            System.err.println("File khong ton tai or co noi dung loi");
        }
        return numbers;
    }

    public void writeFile(String filePath, int max){
        try {
            FileWriter writer=new FileWriter(filePath,true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Gia tri lon nhat la : "+max);
            bufferedWriter.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
