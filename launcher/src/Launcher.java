// import java.net.URL;
// import java.net.URLClassLoader;
// import java.lang.reflect.Method;
// import java.io.*;

public class Launcher {
    public static void main(String[] args) {
        try {
            ProcessBuilder frontend = new ProcessBuilder("notepad");
            frontend.start();
        } catch (Exception e) {
            System.out.println("error");
        }
        
            //     System.out.println("error");
            // }
        
        // try {
        //     ProcessBuilder frontend = new ProcessBuilder("app/frontend/frontend.exe");
        //     frontend.start();

        //     File jarFile = new File("app/java/Main.jar");
        //     URLClassLoader classLoader = new URLClassLoader(
        //         new URL[]{jarFile.toURI().toURL()}, Launcher.class.getClassLoader()
        //     );

        //     Class<?> mainClass = classLoader.loadClass("Main");
        //     Method mainMethod = mainClass.getMethod("main", String[].class);
        //     mainMethod.invoke(null, (Object) new String[]{});
        //     classLoader.close();
        
        // } catch (Exception e) {
        
        //     System.out.println("error");
        // }
    }
}
