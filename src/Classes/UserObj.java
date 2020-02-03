package Classes;

public class UserObj {
    private String name;
    private String pass;
    private String grant;
    private int id;

    private String write = "false";
    private String read = "false";
    private String transfer = "false";
    private String full = "false";

    public String getWrite() {
        return write;
    }

    public String getRead() {
        return read;
    }

    public String getTransfer() {
        return transfer;
    }

    public String getFull() {
        return full;
    }

    public UserObj(String name, String write, String read, String transfer, String full) {
        this.name = name;
        this.write = write;
        this.read = read;
        this.transfer = transfer;
        this.full = full;
    }

    public UserObj(int id, String name, String pass, String grant) {
        this.id = id;
        this.name = name;
        this.pass = pass;
        this.grant = grant;
    }

    public String getName() {
        return name;
    }

    public String getPass() {
        return pass;
    }

    public String getGrant() {
        return grant;
    }

    public int getId() {
        return id;
    }
}
