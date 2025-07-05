package ATB_EXJAVA01;

public class multipleinheritance {
    public static void main(String[] args){

        fatherinheritance f1=new fatherinheritance();
        f1.gold();
        f1.bhk3();

        fatherinheritance f2= new soninheritance();// multiple level inheritance
        f2.f1();
        f2.gold();
        f2.property();

    }
}
