/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ice3ningxin;

import java.util.Scanner;
 class PasswordValidator {
   private String password;

  
   /**
   * @param password
   */
   public PasswordValidator(String password) {
       this.password = password;
   }


   /**
   * @return the password
   */
   public String getPassword() {
       return password;
   }


   /**
   * @param password the password to set
   */
   public void setPassword(String password) {
       this.password = password;
   }


   public boolean isValidPassword() {
       int flag=0;
       if (password.length() >= 8) {
          
           flag=1;
       }

       int upperCnt = 0, specialCnt = 0;
       char ch;
       for (int i = 0; i < password.length(); i++) {
           ch = password.charAt(i);
           if (Character.isUpperCase(ch)) {
               upperCnt++;
           }
           if (!Character.isAlphabetic(ch) && !Character.isDigit(ch)) {
               specialCnt++;
           }
       }
      
       if(flag==0)
       {
           System.out.println("** Password length must be atleast 8 **");
       }
if(upperCnt<1)
{
   System.out.println("Must Contain atleast one uppercase letter.");
}
if(specialCnt<1)
{
   System.out.println("Must Contain atleast one special case letter.");
}
       if (upperCnt <1 || specialCnt < 1 || flag==0) {
           return false;
       } else
           return true;
   }
   public static void main(String[] args) {
        // TODO code application logic here
 

       String password = "";
       /*
       * Creating an Scanner class object which is used to get the inputs
       * entered by the user
       */
       Scanner sc = new Scanner(System.in);
       // Getting the input entered by the user
       System.out.print("\nEnter password :");
       password = sc.next();
       PasswordValidator pv = new PasswordValidator(password);
       while (true) {

           if (pv.isValidPassword()) {
               System.out.println("Valid password");
               break;
           } else {
               System.out.println("Invalid password");
           }
           // Getting the input entered by the user
           System.out.print("\nEnter password :");
           password = sc.next();

           pv.setPassword(password);
       }

   }

}
   
    
