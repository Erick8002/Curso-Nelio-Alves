package cursoJavaNelioAlves.exercicioVetor.pensionato;

public class Room {
    private String name;
    private String email;
    private int roomNum;

    public Room(String name, String email, int roomNum){
        this.name = name;
        this.email = email;
        this.roomNum = roomNum;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public int getRoomNum() {
        return roomNum;
    }
    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

}
