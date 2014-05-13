import java.io.*;

public class renameFastaHeader {
    public static void main(String[] args) {

        if(args.length==2){
            String fileName = new File(args[0]).getName();
            try {
                FileInputStream is = new FileInputStream(args[0]);
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);
                //br.readLine();
               System.out.println(br.readLine());

               FileOutputStream os = new FileOutputStream(args[1]);
               OutputStreamWriter osw = new OutputStreamWriter(os);
               BufferedWriter bw = new BufferedWriter(osw);

               bw.write("@");
               bw.write(fileName);
               bw.write("\n");
                int value=0;

                while((value = br.read()) != -1)
                {
                    char c = (char)value;
                    bw.write(c);
                }
               //System.out.println(((char) br.read()));

               bw.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}


//RandomAccessFile inputFile = new RandomAccessFile(s,"rws");
//BufferedReader inputReader = new BufferedReader(s,)
//inputFile