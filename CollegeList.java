import java.util.Scanner;
public class CollegeList {
            public static void main(String []args){
            String choice;    
            Scanner input = new Scanner(System.in);
                   
            System.out.print("Press E for Employee, F for Faculty, or S for Student: ");
            choice = input.next();
            String contact_num;
            String name;

                                  
            switch(choice){
                case "e":
                case "E":
                {
                    double salary;
                    String department;
                    System.out.println("Type employee's name, contact number, salary, and department.\nPress Enter after every input. ");
                    input.nextLine();
                    name = input.nextLine();
                    contact_num = input.nextLine();
                    salary = input.nextDouble();
                    input.nextLine();
                    department = input.nextLine();
                    
                    Employee emp = new Employee();
                                                                                       
                    emp.setName(name);
                    emp.setContactNum(contact_num);
                    emp.setSalary(salary);
                    emp.setDepartment(department);
                
                    System.out.println("-------------------------------------------");
                    System.out.println("Name: " + emp.getName());
                    System.out.println("Contact Number: " + emp.getContactNum());
                    System.out.println("Salary: " + emp.getSalary());
                    System.out.println("Department: " + emp.getDepartment());
                                
                }                                      
                break; 
                
                case "f":
                case "F":
                {   
                    double salary;
                    String department;
                    String status;
                    System.out.println("Type faculty's name, contact number, salary, and department, and status(Y or N).\nPress Enter after every input. ");
                    input.nextLine();
                    name = input.nextLine();
                    contact_num = input.nextLine();
                    salary = input.nextDouble();
                    input.nextLine();
                    department = input.nextLine();
                    status = input.nextLine();
                      
                    Faculty fac = new Faculty();
                    
                    fac.setName(name);
                    fac.setContactNum(contact_num);
                    fac.setSalary(salary);
                    fac.setDepartment(department);
                    fac.setIsRegular(status.equals("Y") || status.equals("y"));
                                                   
                    System.out.println("-------------------------------------------");
                    System.out.println("Name: " + fac.getName());
                    System.out.println("Contact Number: " + fac.getContactNum());
                    System.out.println("Salary: " + fac.getSalary());
                    System.out.println("Department: " + fac.getDepartment());                             
                    System.out.println("Is Regular: " + fac.isRegular());
                }
                break;
                
                case "s":
                case "S":
                {                 
                    String program;
                    int yearLevel;
                    System.out.println("Type student's name, contact number, program, and year level(1-4).\nPress Enter after every input. ");
                    input.nextLine();
                    name = input.nextLine();
                    contact_num = input.nextLine();
                    program = input.nextLine();
                    yearLevel = input.nextInt();
                    input.nextLine();
                                        
                    Student stu = new Student();
                    stu.setName(name);
                    stu.setContactNum(contact_num);
                    stu.setProgram(program);
                    stu.setYearLevel(yearLevel);
                
                    System.out.println("-------------------------------------------");
                    System.out.println("Name: " + stu.getName());
                    System.out.println("Contact Number: " + stu.getContactNum());
                    System.out.println("Program: " + stu.getProgram());
                    
                    if(yearLevel < 4){
                    System.out.println("Year Level: " + stu.getYearLevel());
                    }else{
                    System.out.println("Invalid Input");
                    }
                }
                break;

                default:
                    System.out.println("Invalid Input");
                    break; 
            } 
            
            input.close();
    }
    
  }
    

        
        