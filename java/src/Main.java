import java.io.*;
public class Main {
    

    public static void main(String[] args) {
        try {
            Process process = new ProcessBuilder("notepad.exe").start();
            
            Thread.sleep(1000);
            
            String script = "hello world from Java";
            Runtime.getRuntime().exec("cmd /c echo " + script + " | clip");

            System.out.println("Opened Notepad and copied text to clipboard.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
