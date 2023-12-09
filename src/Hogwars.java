public class Hogwars {
    private String student;
    private int powerMagic;
    private int teleport;


    public Hogwars(String student,int powerMagic,int teleport) {
        this.powerMagic = powerMagic;
        this.teleport=teleport;
        this.student=student;
    }

    public String getStudent() {
        return student;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public int getTeleport() {
        return teleport;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public void setPowerMagic(int powerMagic) {
        this.powerMagic = powerMagic;
    }

    public void setTeleport(int teleport) {
        this.teleport = teleport;
    }
}
