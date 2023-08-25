import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        // init
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        bw.write("test\n");

        bw.flush();

        br.close();
        bw.close();
    }

}
