class Employee {

   int empId;  
   String empName;  
	    
   Employee(int id, String name){  
       this.empId = id;  
       this.empName = name;  
   }  
   void info(){
        System.out.println("Id: "+empId+" Name: "+empName);
   }  
	   
   public static void main(String args[]){  
	Employee obj1 = new Employee(1,"ABC");  
	Employee obj2 = new Employee(2,"XYZ");  
	obj1.info();  
	obj2.info();  
   }  
}