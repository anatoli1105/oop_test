public class Griffindor extends  Hogwars {

    private String facultet;
    String nameFacultet = "грифиндор";
    private int honor;
    private int bravery;
    private int nobility;

    public Griffindor(String student, int powerMagic, int teleport, int honor, int bravery, int nobility) {
        super(student, powerMagic, teleport);
        this.honor = honor;
        this.bravery = bravery;
        this.nobility = nobility;
        this.facultet = nameFacultet;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public String getFacultet() {
        return facultet;
    }

    public void setFacultet(String facultet) {
        this.facultet = facultet;
    }

    public static void compareStudentsGrifindor(Griffindor student1, Griffindor student2) {
        if (student1.getBravery() + student1.getHonor() + student1.getNobility()
                > student2.getBravery() + student2.getHonor() + student2.getNobility()) {
            System.out.println(student1.getStudent() + " ,факультета " + student1.facultet +
                    ", обладает бОльшей мощностью магии, чем " +
                    student2.getStudent());
        } else {
            System.out.println(student2.getStudent() + " ,факультета " + student1.facultet +
                    " ,обладает бОльшей мощностью магии, чем " +
                    student1.getStudent());
        }
    }

    @Override
    public String toString() {
        return String.format("===========\nфакультет: %s\nученик: %s \nмагия: %d \nтелепорт:%d " +
                        "\nблагородство: %d\nчесть: %d \nхрабрость:%d\n===========",
                getFacultet(), getStudent(), getPowerMagic(), getTeleport(), honor, bravery, nobility);
    }
}

