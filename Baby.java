public class Baby{
    public static void main(String[]args){
        Demo ob1=new Demo();
        ob1.a=10;
        ob1.b=20;
        Demo ob2=new Demo();
        ob2.a=1;
        ob2.b=2;
        ob1.display();
        ob2.display();
    }
}
class Demo{
    static int a;
    int b;
    void display(){
        System.out.println(a+" "+b);
    }
}