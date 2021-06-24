package VebinarMuchThread;

import java.io.IOException;

public class ProcessTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        ProcessBuilder pb = new ProcessBuilder("notepad.exe");
        Process notepad = pb.start();
        notepad.waitFor();
        System.out.println(notepad.exitValue());
    }
}
