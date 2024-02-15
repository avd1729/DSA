package FileHandling;

import java.io.*;

public class Main {
    public static void main(String[] args) {
//        try (InputStreamReader isr = new InputStreamReader(System.in)) {
//            System.out.print("Enter some letters:");
//            int letters = isr.read();
//            while(isr.ready()) {
//                System.out.println((char) letters);
//                letters = isr.read();
//            }
//            // isr.close();
//            System.out.println();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
        try (FileReader fr = new FileReader("C:\\Users\\Aravind\\SandBox\\src\\FileHandling\\note.txt")) {
            int letters = fr.read();
            while(fr.ready()) {
                System.out.println((char) letters);
                letters = fr.read();
            }
            // fr.close();
            System.out.println();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // byte to char stream and then reading char stream
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("You typed: " + br.readLine());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Aravind\\SandBox\\src\\FileHandling\\note.txt"))){
            while (br.ready()){
                br.readLine();
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        OutputStream os = System.out;
        // os.write(😂); range is exceeded

        try (OutputStreamWriter osw = new OutputStreamWriter(System.out)){
            osw.write("Hello World");
            osw.write(90);
            osw.write(90);
        } catch(IOException e){
            System.out.println(e.getMessage());
        }

        try (FileWriter fw = new FileWriter("C:\\Users\\Aravind\\SandBox\\src\\FileHandling\\note.txt" , true)){
            fw.write(" nice to meet you");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
