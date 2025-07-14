/* 
✅ Tariff (per unit) as per your logic:
Units Range	Rate (₹)
0 - 50	3.50
51 - 150	4.50
151 - 250	5.20
251 and above	6.75

Then, the total bill is increased by 20% surcharge (+ amount * 0.2).

✅ Sample Inputs and Outputs
🔹 Input 1:
ini
Copy
Edit
n = 45
Calculation:

45 units × ₹3.50 = ₹157.5

Surcharge = ₹157.5 × 0.2 = ₹31.5

Total = ₹157.5 + ₹31.5 = ₹189.0

Output:

Copy
Edit
189.0
🔹 Input 2:
ini
Copy
Edit
n = 120
Calculation:

First 50 units × ₹3.50 = ₹175

Next 70 units × ₹4.50 = ₹315

Subtotal = ₹490

Surcharge = ₹490 × 0.2 = ₹98

Total = ₹490 + ₹98 = ₹588.0

Output:

588.0

🔹 Input 3:

n = 220

Calculation:

First 50 units × ₹3.50 = ₹175

Next 100 units × ₹4.50 = ₹450

Next 70 units × ₹5.20 = ₹364

Subtotal = ₹989

Surcharge = ₹989 × 0.2 = ₹197.8

Total = ₹989 + ₹197.8 = ₹1186.8

Output:

1186.8
🔹 Input 4:

n = 300

Calculation:

First 50 × ₹3.50 = ₹175

Next 100 × ₹4.50 = ₹450

Next 100 × ₹5.20 = ₹520

Remaining 50 × ₹6.75 = ₹337.5

Subtotal = ₹1482.5

Surcharge = ₹296.5

Total = ₹1779.0

Output:

1779.0
*/

import java.util.*;
class Electric{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double amount=1;
        if(n<=50){
            amount=n*3.50;
        }
        else if(n>50 && n<=150){
            amount=(n-50)*4.50+50*3.50;
        }
        else if(n>150 && n<=250){
            amount=(n-150)*4.50+100*5.20+50*3.50;
        }
        else{
            amount=(n-250)*6.75+100*4.50+100*5.20+50*3.50;
        }
        amount=amount+amount*0.2;
        System.out.println(amount);
        sc.close();
    }
}