public class StartUp
{
    public static void main(String args[])
    { 
        // ファイルを指定
        File file = new File("C:\\tmp\\sample.txt");

        // ファイル読み込み
        FileReader file_reader = new FileReader(file);
        file_reader.close(); 

        // ファイル書き込み
        FileWriter filewriter = new FileWriter(file);
        filewriter.write("こんにちは"); 

        // ディレクトリ指定もできる
        File dir = new File("C:\\tmp"); 
    }
}
