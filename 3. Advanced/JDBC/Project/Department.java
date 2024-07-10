package project;

public class Department {
    private int depid;
    private String depname;
    private String deplocation;

    public Department(int depid, String depname, String deplocation) {
        this.depid = depid;
        this.depname = depname;
        this.deplocation = deplocation;
    }

    public int getDepId() {
        return depid;
    }

    public void setDepId(int depid) {
        this.depid = depid;
    }

    public String getDepName() {
        return depname;
    }

    public void setDepName(String depname) {
        this.depname = depname;
    }

    public String getDepLocation() {
        return deplocation;
    }

    public void setDepLocation(String deplocation) {
        this.deplocation = deplocation;
    }
}
