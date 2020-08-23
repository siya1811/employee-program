/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.util.Scanner;

/**
 *
 * @author KESHAV
 */
class Employee
{
    //attributes
    String name,address;
    int year;
    //stter
    public void setDetails(String ename , int yoj,String eadd){
        name = ename;
        address= eadd;
        year =yoj;
    }
    //getter
    public void getDetails()
    {
        System.out.println(name+" \t "+year+"\t\t\t"+address);
                }
    }

public class EmployeeRecords {
static final Scanner sc= new Scanner(System.in);

public static void prtf(String str){
    System.out.print(str);
}

 /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("\n *** Program to read and display detals of employee") ;
        prtf("\n Enter number of employees to record details: ");
        int n = sc.nextInt();
        Employee[] objEmp = new Employee[n];
int i =0 ,yoj =0;
String ename ,eadd;
while(i<n)
{
            sc.nextLine();
        prtf("\n No." +(i+1));
        prtf("\n Enter employee name : ");
        ename=sc.nextLine();
        prtf("Enter address :"); 
        eadd =sc.nextLine();
        prtf("Enter year of joining : ");
        yoj = sc.nextInt();
        
        objEmp[i]=new Employee();
        objEmp[i].setDetails(ename, yoj, eadd);
        ++i;
}
prtf("\n\n\t EMPLOYEE RECORDS");
prtf("\n Name \t Year of joining \t Address\n");
i=0;
while(i<n)
{
    objEmp[i].getDetails();
}    
    }        


}
