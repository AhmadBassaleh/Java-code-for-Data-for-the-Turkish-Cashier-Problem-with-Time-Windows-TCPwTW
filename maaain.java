import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//DON'T MIND THIS CLASS
public class maaain {

    public static  void main(String [] args){

       /* FileReader fileReader;
        try {
            fileReader = new FileReader("twoA");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            //skip first row

            String line = bufferedReader.readLine();

            System.out.print("{");
            while (line != null) {


                String[] info = line.split("\t");

                for (int i = 0; i <50; i++) {
                    if (i==0){
                        System.out.print("{"+info[i]+",");
                    }else if (i==49){
                        System.out.print(info[i]);
                    }else {
                        System.out.print(info[i]+",");
                    }
                }
                System.out.println("},");
                line = bufferedReader.readLine();
            }
            System.out.println("} ;");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/


    }
}
