/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

import java.util.Scanner;

/**This class for
 * printing final salary including bonus
 * @author srinivsi
 */
public class PayrollPrint 
{
public static void main(String[] args) 
{
/* here assumed that 50 employee accounts can be created
 for the given bank */
Payroll ac[]=new Payroll[50];
Scanner sc=new Scanner(System.in);

System.out.println("Please enter the employee name:");
//add code
Payroll p1 = new Payroll();
String name= sc.nextLine();
p1.setEmp(name);
    System.out.println(p1.getEmp());
System.out.println("Please enter the salary: salary <=3000 " );

      double salary = sc.nextDouble();
p1.setSalary(salary);
      System.out.println(p1.getEmp() + " has this much salary " + p1.getSalary() );
    
System.out.println("The final Salary including bonus is: " + p1.finalSalary());      

 

}

}
