class Employee {

   int empId;  
   String empName;  
	    
   Employee(int id, String name){  
       empId = id;  
       empName = name;  
   }  
   void info(){
        System.out.println("Id: "+empId+" Name: "+empName);
   }  
	   
   public static void main(String args[]){  
	Employee e = new Employee(1,"ABC");  
	Employee e1 = new Employee(2,"XYZ");  
	e.info();  
	e1.info();  
   }  
}