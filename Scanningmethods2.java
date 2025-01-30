import java.util.*;//(astrick) is used to import all the packages
public class Scanningmethods2 {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);//creating an object instance
        System.out.println("enter the name below:");
        String data = input.nextLine();// for string  data type
        System.out.println("welcome to java tutorial, " + data);
        input.close();//close the scanner
    }
}
