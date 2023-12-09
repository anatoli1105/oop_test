public class Slisaren extends Hogwars {

    private  String facultet;
    String nameFacultet="слизарин";
    private int cunning;
    private int resoluteness;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slisaren(String student, int powerMagic, int teleport, int cunning, int resoluteness, int ambition
            , int resourcefulness, int lustForPower) {
        super(student, powerMagic, teleport);
        this.cunning = cunning;
        this.resoluteness = resoluteness;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
        this.facultet=nameFacultet;
    }
    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getCunning() {
        return cunning;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public int getResoluteness() {
        return resoluteness;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public void setResoluteness(int resoluteness) {
        this.resoluteness = resoluteness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public String getFacultet() {
        return facultet;
    }

    public void setFacultet(String facultet) {
        this.facultet = facultet;
    }
    public static void compareStudentsSlisarin(Slisaren student1,Slisaren student2) {
        if (student1.getAmbition() + student1.getCunning() + student1.getResoluteness()+student1.getLustForPower()+
                student1.getResourcefulness()
                > student2.getAmbition() + student2.getCunning() + student2.getResoluteness()+student2.getLustForPower()+
                student2.getResourcefulness() ){
            System.out.println(student1.getStudent() + ",факультета "+student1.facultet+
                    " ,обладает бОльшей мощностью магии, чем " +
                    student2.getStudent());
        }
        else {
            System.out.println(student2.getStudent() +" ,факультета "+student1.facultet+
                    ", обладает бОльшей мощностью магии, чем " +
                    student1.getStudent());
        }
    }

    @Override
    public String toString() {
        return String.format("===========\nфакультет: %s\nученик: %s \nмагия: %d \nтелепорт:%d "+
                        "\nхитрость: %d\nрешительность: %d \nамбициозность: %d\nнаходчивость: %d\nвласть: %d\n===========",
                getFacultet(),getStudent(),getPowerMagic(),getTeleport(),
                cunning, resoluteness, ambition, resourcefulness, lustForPower);
    }





}
