public class Kogtewran extends Hogwars{

    private  String facultet;
    String nameFacultet="когтевран";
    private int intellect;
    private int wisdom;
    private int wit ;
    private int creation;
    public Kogtewran(String student, int powerMagic, int teleport,int intellect,
                     int wisdom, int wit, int creation) {
        super(student, powerMagic, teleport);
        this.intellect=intellect;
        this.wisdom=wisdom;
        this.wit=wit;
        this.creation=creation;
        this.facultet=nameFacultet;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getIntellect() {
        return intellect;
    }

    public int getCreation() {
        return creation;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    public String getFacultet() {
        return facultet;
    }

    public void setFacultet(String facultet) {
        this.facultet = facultet;
    }
    public static void compareStudentsKogtewran(Kogtewran student1,Kogtewran student2) {
        if (student1.getCreation() + student1.getIntellect() + student1.getWisdom()+student1.wit
                > student2.getCreation() + student2.getIntellect() + student2.getWisdom()+student2.wit) {
            System.out.println(student1.getStudent() + ",факультета "+student1.facultet+
                    " ,обладает бОльшей мощностью магии, чем " +
                    student2.getStudent());
        } else {
            System.out.println(student2.getStudent() +" ,факультета "+student1.facultet+
                    ", обладает бОльшей мощностью магии, чем " +
                    student1.getStudent());
        }
    }

    @Override
    public String toString() {
        return String.format("===========\nфакультет: %s\nученик: %s \nмагия: %d \nтелепорт:%d " +
                        "\nум: %d\nмудрость: %d \nостроумие:%d\nтворчество:%d\n===========", getFacultet(),
                getStudent(),getPowerMagic(),getTeleport(),intellect, wisdom, wit, creation);
    }





}
