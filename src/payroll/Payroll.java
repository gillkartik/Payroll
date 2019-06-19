/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

/** This code calculates the salary including bonus.
 * bonus is 10% of salary and applied to the employees whose salary is <=3000
 * @author srinivsi
 */
public class Payroll 
{

   private double Salary;
   private double bonus;
   private String emp;
 
     /**constructor that takes the salary and employee name
      * 
      */
   public Payroll(double Sal,String givenUser)
        {
            Salary=Sal;
            emp=givenUser;
                 
        }

    Payroll() {
        
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setEmp(String emp) {
        this.emp = emp;
    }
         /**The method for calculating salary including bonus.Bonus is 10% of salary 
      */ 
        
        
     /**The getter for the Salary
     * @return the Salary
     */
        public double getSalary() 
        {
        return Salary;
        }

    /*The getter for bonus
     * @return the bonus*/
     
        public double getBonus() 
        {
            return bonus;
        }

    /**user is the read only field
     * @return the user
     */
    public String getEmp() {
        return emp;
    }
    
    public double finalSalary() {
        if(this.Salary<=3000) {
            this.bonus= this.Salary/10;
            System.out.println("the bonus is : " + this.bonus );
        }
        else {
            this.bonus=0;
        }
        double finalSalary = this.Salary + this.bonus;
        System.out.println("the bonus is : " + this.bonus );
        return finalSalary;
        
       
    }
}
