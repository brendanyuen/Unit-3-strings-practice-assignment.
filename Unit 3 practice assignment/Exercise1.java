class Exercise1{
    
 public static void main(String[] args){
     System.out.println("I have a pen, I have a apple");
     ppap("I have a pen, I have a apple"); 
     System.out.println("I have a pointer, I have a null");
     ppap("I have a pointer, I have a null");
     
     
    }
    
    
   public static void ppap(String str){
       String pen="";
       String apple="";
       
       int obj1=str.indexOf(",");
       int obj2=str.lastIndexOf(" ");
       
       apple=str.substring(obj2);
       pen=str.substring(9,obj1);
       apple=str.substring(obj2,obj2+1).toUpperCase()+str.substring(obj2+1);
       System.out.println("Uh!"+apple + " "+ pen);
       
    }
    
}