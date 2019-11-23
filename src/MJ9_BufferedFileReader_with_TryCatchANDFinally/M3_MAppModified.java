package MJ9_BufferedFileReader_with_TryCatchANDFinally;


class MyClass implements AutoCloseable {

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
