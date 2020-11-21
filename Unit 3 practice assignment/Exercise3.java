class Exercise3{
    
 public static void main(String[] args){
    System.out.println(binary(4)+":4");
     System.out.println(binary(2)+":2");
     System.out.println(binary(40078)+":40078");
     
    }
    
    
   public static String binary(int n){
       String ans="";
       String ans1="";
       while(n>0){
         if(n%2==1)
         ans+="1";
         else 
         ans+="0";
         
           n=n/2;
           
        }
        
        for(int i=ans.length()-1;i>=0;i--){
          ans1+=ans.charAt(i); 
        }
       
       
       
       return ans1;
    }
    
}