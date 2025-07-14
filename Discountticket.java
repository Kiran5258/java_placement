import java.util.*;
class Discountticket{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int ticketprize=sc.nextInt();
    int noticket=sc.nextInt();
    double discount=0;
    double prize=0;
    if(noticket<50){ 
        discount=ticketprize*noticket+discount;   
    }
    else if(noticket>=50 && noticket<=100){
        prize=ticketprize*noticket;
        discount=prize-(prize*0.1);
    }
    else if(noticket>=101 && noticket<=200){
        prize=ticketprize*noticket;
        discount=prize-(prize*0.2);
    }
    else if(noticket>=201 && noticket<=400){
        prize=ticketprize*noticket;
        discount=prize-(prize*0.3);
    }
    else if(noticket>=401 && noticket<=500){
        prize=ticketprize*noticket;
        discount=prize-(prize*0.2);
    }
    else{
        prize=ticketprize*noticket;
        discount=prize-(prize*0.5);
    }
    System.out.println(discount);
    sc.close();
    }
}