public class HotelApp {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();

        System.out.println("--- Guest Checking In ---");
        frontDesk.valetService("XYZ-1234");
        frontDesk.cartService(2);

        System.out.println("\n--- Guest Stay Custom Request ---");
        frontDesk.houseKeepingService(302);
    }
}