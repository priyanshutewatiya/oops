public class Room {
    int roomNumber;
    String roomType;
    double roomArea;
    boolean acMachine;

    public void setData(int roomNumber, String roomType, double roomArea, boolean acMachine) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.roomArea = roomArea;
        this.acMachine = acMachine;
    }
    public void displayData() {
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Room Type: " + roomType);
        System.out.println("Room Area: " + roomArea + " sq. meters");
        System.out.println("AC Machine: " + (acMachine ? "Yes" : "No"));
    }
    public static void main(String[] args) {
        Room room = new Room();
        room.setData(101, "Deluxe", 25.5, true);
        room.displayData();
    }
}
