public class Main {
    public static void main(String[] args) {
        Landline l1 = new Landline("1234");
        Landline l2 = new Landline("5678");

        l1.callNumber("5678");
        l2.receiveCall("5678");
        System.out.println(l2.answerCall());
    }
}