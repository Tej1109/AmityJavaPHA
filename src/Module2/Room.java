package Module2;

public class Room {
    String roomNumber;
    String block;
    String type;

    Room(String roomNumber,String block, String type){
        this.roomNumber = roomNumber;
        this.block = block;
        this.type = type;
    }

    String getDetails(){
        return "Room : " + this.roomNumber + " " + this.block + " " + this.type;
    }
}
