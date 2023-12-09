public class Puffenduy extends  Hogwars{

    private  String facultet;
    String nameFacultet="пуфендуй";
    private int hardWork;
    private int loyalty;
    private int honesty;
    public Puffenduy(String student, int powerMagic, int teleport,int hardWork,int loyalty,int honesty) {
        super(student, powerMagic, teleport);
        this.hardWork=hardWork;
        this.honesty=honesty;
        this.loyalty=loyalty;
        this.facultet=nameFacultet;
    }

    public int getHardWork() {
        return hardWork;
    }

    public int getHonesty() {
        return honesty;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public String getFacultet() {
        return facultet;
    }

    public void setFacultet(String facultet) {
        this.facultet = facultet;
    }
    public static void compareStudentsPuffenduy(Puffenduy student1,Puffenduy student2) {
        if (student1.getHonesty() + student1.getHardWork() + student1.getLoyalty()
                > student2.getHonesty() + student2.getHardWork() + student2.getLoyalty()) {
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
                        "\nтрудолюбиу: %d\nверны: %d \nчестность:%d\n===========",getFacultet(),
                getStudent(),getPowerMagic(),getTeleport(),hardWork,loyalty,honesty );
    }






}
