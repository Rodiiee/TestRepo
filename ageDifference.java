class AgeDifference 
{      int age;     void age(int age) 
    {        if(age<18) 
       { 
        System.out.print("Child"); 
       } 
      else if(age>=18 && age<=50) 
       { 
          System.out.println("Adult"); 
       } 
      else if(age<65) 
      { 
        System.out.println("Senior"); 
      } 
     else if(age>=70 && age<=90) 
     { 
        System.out.println("Old"); 
     }      else 
     { 
       System.out.println("Inavlid");   
     }  } 
    public static void main(String[] args) 
    { 
       AgeDifference  AD=new AgeDifference(); 
       AD.age(25); 
       AD.age(58); 
       AD.age(75); 
       AD.age(95); 
    } 
} 

