/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankSystem;

import java.util.*;

/**
 *
 * @author User
 */
public class BankSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many number of customers do you want to input ?");
        int n = scan.nextInt();
        ATM [] obj = new ATM[n];
    for(int i = 0;i<obj.length;i++){
    obj[i] = new ATM();
    obj[i].openAccount();
}
    int ch;
    do{
        System.out.println("\n ***Banking System Application***");
        System.out.println("1. Display all account details \n 2. Search by Account number\n 3. Deposit the amount \n 4. Withdraw the amount \n 5.Exit ");  
        System.out.println("Enter your choice: ");  
  ch = scan.nextInt();  
                switch (ch) {  
                    case 1:  
                        for (int i = 0; i < obj.length; i++) {  
                            obj[i].showAccount();  
                        }  
                        break;  
                    case 2:  
                        System.out.print("Enter account no. you want to search: ");  
                        String ac_no = scan.next();  
                        boolean found = false;  
                        for (int i = 0; i < obj.length; i++) {  
                            found = obj[i].search(ac_no);  
                            if (found) {  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("Search failed! Account doesn't exist..!!");  
                        }  
                        break;  
                    case 3:  
                        System.out.print("Enter Account no. : ");  
                        ac_no = scan.next();  
                        found = false;  
                        for (int i = 0; i < obj.length; i++) {  
                            found = obj[i].search(ac_no);  
                            if (found) {  
                                obj[i].desposit();  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("Search failed! Account doesn't exist..!!");  
                        }  
                        break;  
                    case 4:  
                        System.out.print("Enter Account No : ");  
                        ac_no = scan.next();  
                        found = false;  
                        for (int i = 0; i < obj.length; i++) {  
                            found = obj[i].search(ac_no);  
                            if (found) {  
                                obj[i].withdraw();  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("Search failed! Account doesn't exist..!!");  
                        }  
                        break;  
                    case 5:  
                        System.out.println("See you soon...");  
                        break;  
                }  
            }  
            while (ch != 5);  
        }  
    }  