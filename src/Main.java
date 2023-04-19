// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
         LandLine l1=new LandLine("123");
         LandLine l2=new LandLine("456");

         l1.callNumber("456");
         l2.receiveCall("456");
        System.out.println(l2.answerCall());


    }
}