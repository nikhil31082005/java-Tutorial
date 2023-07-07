import java.io.*;

public class bufferInput {
    public static void main(String[] args) throws IOException {
        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter string :");
        String str = bfn.readLine();
        System.out.println(str);
    }
}
