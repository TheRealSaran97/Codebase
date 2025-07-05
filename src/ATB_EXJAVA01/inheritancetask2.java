package ATB_EXJAVA01;

public class inheritancetask2 {
    public static void main(String[] args){

        SuperAdmin Test1= new SuperAdmin();
        User.methodlogin();
        AdminUser.accessAdminPanel();
        SuperAdmin.shutdownSystem();
    }
}
