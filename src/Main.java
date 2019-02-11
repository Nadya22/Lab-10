public class Main {

    static void Division(){
        try{
            System.out.println(10/0);
        }catch (ArithmeticException  e){
            System.err.println("Деление на ноль невозможно!");
           // e.printStackTrace();
        }
    }

    static void Array(){
        int array[]={1,6,8,3};
        try{
            array[4]=5;
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Элемент вне границ данного массива!");
           // e.printStackTrace();
        }
    }

    static void ArrayDivision(){
        try{
            //ii=0;nt
            for(int i=1;i<3;i=i+1) {//i=0
                System.out.println("a=" +i);
                int d = 40/i;
                System.out.println(d);
            }
            int c[]={1,3};
            c[4]=155;
        }catch(ArithmeticException е){
            System.err.println("Деление на ноль.");
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Элемент вне границ массива.");
        }
    }

    static void MMyException(){
        try{
            throw new MyException();
        }catch (MyException e){
            System.err.println("Собственное исключение."+e);
        }
    }

    public static void main(String[] args) {
        Division();
        Array();
        ArrayDivision();
        MMyException();
    }
}