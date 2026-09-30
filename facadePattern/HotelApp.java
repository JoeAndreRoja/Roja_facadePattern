public class HotelApp {

    public static void main(String[] args) {

        FrontDesk frontDesk = new FrontDesk();

        System.out.println("=== Hotel Management System ===");

        frontDesk.pickUpVehicle("NTE-2026");

        frontDesk.cleanRoom(143);

        frontDesk.requestCart(2);
    }
}