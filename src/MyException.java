import java.util.Date;

public class MyException extends Exception {
   private int detail;

    MyException(int a) {
        detail = a;
    }

    public String toString() {
        return "MyException" + detail + "]";
    }
}

class ExceptoinDemo {
    static void start3(int a) throws MyException{
        System.out.println("\nИсключение собственного класса");
        System.out.println("Названипе метода MyException(" + a + ")");
        if(a>10)
            throw new MyException(a);
        System.out.println("Нормальное завершение");
    }
}


