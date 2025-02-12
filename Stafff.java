package university-management;

public class Stafff {
    private String name;
    private String email;
    private String status;
    private String room;

    public Staff(String name, String email, String status, String room) {
        setName(name);
        setEmail(email);
        setStatus(status);
        setRoom(room);
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    
    void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    void setStatus(String status) {
        this.status= status;
    }

    public String getRoom() {
        return room;
    }

    void setRoom(String room) {
        this.room = room;
    }

    public static void main(String[] args) {
     Staff s = new Staff(null, null, null, null);
    }
}
