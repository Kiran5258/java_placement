/*
/*✅ Discount Slabs (based on number of tickets):
Number of Tickets	Discount Applied
Less than 50	❌ No discount
50 – 100	✅ 10% off
101 – 200	✅ 20% off
201 – 400	✅ 30% off
401 – 500	✅ 20% off
Above 500	✅ 50% off

⚠️ Minor Correction:
In the first condition (if(noticket<50)), you’re not assigning to discount correctly. This:

java
Copy
Edit
discount = ticketprize * noticket + discount;
can be simplified to:

discount = ticketprize * noticket;
✅ Corrected Code Snippet:

if(noticket < 50){ 
    discount = ticketprize * noticket;  // just assign directly
}
✅ Sample Inputs and Outputs
🔹 Input 1:

ticketprize = 100
noticket = 30
No discount.

Total = 100 × 30 = 3000

Output:

3000.0
🔹 Input 2:

ticketprize = 100
noticket = 80
10% discount

Total = 100 × 80 = 8000

Discount = 8000 × 10% = 800

Final = 8000 - 800 = 7200

Output:


7200.0
🔹 Input 3:

ticketprize = 200
noticket = 150
20% discount

Total = 200 × 150 = 30000

Discount = 6000

Final = 24000

Output:

24000.0
🔹 Input 4:

ticketprize = 150
noticket = 250
30% discount

Total = 150 × 250 = 37500

Discount = 11250

Final = 26250

Output:

26250.0
🔹 Input 5:

ticketprize = 120
noticket = 600
50% discount

Total = 120 × 600 = 72000

Discount = 36000

Final = 36000

Output:

36000.0

 * 
 * 
 */

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