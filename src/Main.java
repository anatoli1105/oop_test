
public class Main {
    public static void main(String[] args) {
        Hogwars student1=new Griffindor("гари потер",34,
                23,12,56,12);
        Hogwars student2=new Griffindor("Гермиона Грейнджер",56,
                67,23,45,11);
        Hogwars student3=new Griffindor("Рон Уизли",55,
                88,12,77,33);
        Hogwars student4=new Slisaren("Драко Малфой",45,
                78,34,87,33,22,6 );
        Hogwars student5=new Slisaren("Грэхэм Монтегю",55,
                56,44,89,44,1,2);
        Hogwars student6=new Slisaren("Грегори Гойл",4,
                34,66,77,33,12,21);
        Hogwars student7=new Kogtewran("Чжоу Чанг",44,
                44,67,76,6,7);
        Hogwars student8=new Kogtewran("Падма Патил",90,
                9,5,45,41,4);
        Hogwars student9=new Kogtewran("Маркус Белби",2,
                22,56,71,72,73);
        Hogwars student10=new Puffenduy("Захария Смит",98,
                42,53,64,75);
        Hogwars student11=new Puffenduy(" Седрик Диггори",77,
                78,5,7,8);
        Hogwars student12=new Puffenduy("Джастин Финч-Флетчли",5,
                45,46,47,5);
        Griffindor.compareStudentsGrifindor((Griffindor) student1,(Griffindor) student2);
        System.out.println();
        Puffenduy.compareStudentsPuffenduy((Puffenduy) student10,(Puffenduy) student12);
        System.out.println();
        Kogtewran.compareStudentsKogtewran((Kogtewran) student7,(Kogtewran) student8);
        System.out.println();
        Slisaren.compareStudentsSlisarin((Slisaren) student4,(Slisaren) student5);
        System.out.println();

        //compareStudentsGrifindor((Griffindor) student2,(Griffindor) student1);
        compareStudents(student11,student2);

    }
    public  static void compareStudents(Hogwars student1,Hogwars student2){
        if(student1.getPowerMagic()+student1.getTeleport()>student2.getTeleport()+student2.getPowerMagic()){
            System.out.println(student1.getStudent()+ " обладает бОльшей мощностью магии, чем "+
                    student2.getStudent());
        }
        else {
            System.out.println(student2.getStudent()+ " обладает бОльшей мощностью магии, чем "+
                    student1.getStudent());
        }
    }
    public  static void compareStudentsGrifindor(Griffindor student1,Griffindor student2){
        if(student1.getBravery()+student1.getHonor()+student1.getNobility()
                >student1.getBravery()+student1.getHonor()+student1.getNobility()){
            System.out.println(student1.getStudent()+ " обладает бОльшей мощностью магии, чем "+
                    student2.getStudent());
        }
        else {
            System.out.println(student2.getStudent()+ " обладает бОльшей мощностью магии, чем "+
                    student1.getStudent());
        }
    }

}