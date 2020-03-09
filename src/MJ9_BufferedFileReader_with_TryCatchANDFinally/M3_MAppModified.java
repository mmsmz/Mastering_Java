package MJ9_BufferedFileReader_with_TryCatchANDFinally;


class MyClass implements AutoCloseable {
 // if my class goes to the internet and database.. so finally everything is done it will be closing the
 // internet connection & database connection
    @Override
    public void close() throws Exception {
        System.out.println("Closing");
    }
}

public class M3_MAppModified {
    public static void main(String[] args) {
        try (MyClass var = new MyClass();) {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
