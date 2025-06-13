package ATB_EXJAVA01;

public class operators {
    public static void main(String[] args){

        int a = 5;

        int b = a++;

        System.out.println("a: " + a + ", b: " + b);//Program1 a=6 b=5//

        //program2
        int x = 1;

        x = x++ + ++x;

        System.out.println(x);//program2 i=1+3 I=4

        //Program3
        int y = 5;

        System.out.println(y++ + ++y); //x=5+7=12

        //program4
        int z = 5;

        System.out.println(++z); // Output: 6

        System.out.println(z++); // Output: 6

        System.out.println(z);// Output:7

        //program5
        int c = 5;

        int d = c++ + ++c;

        System.out.println("c: " + c); // Output: 7

        System.out.println("d: " + d); // Output: 12

        //program6
        int e = 5;

        int f = e++ + ++e + e++ + ++e;// Output: 5+7+7+9=28

        System.out.println("e = " + e + ", f = " + f); //e=9 f=28

        //program7
        int s=5;
        int r = s++ + ++s + s++ + ++s; //Output:r=5+7+7+9=28 r=28,z=9

        System.out.println("s = " + s + ", r = " + r);



    }

}
