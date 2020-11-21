class Exercise2{
    
 public static void main(String[] args){
    
     System.out.println("racecar is "+palindrome("racecar"));
     System.out.println("Amy,must I jujitsu my ma? is "+palindrome("Amy,must I jujitsu my ma?"));
     System.out.println("uwhdwuhcda is "+palindrome("uwhdwuhcda"));
    }
    
    
   public static boolean palindrome(String str){
      String ans="";
      String ans1="";
      str=str.toLowerCase();
      for(int i=str.length()-1;i>str.length()/2;i--){
          if(Character.isLetter(str.charAt(i))){
              ans+=str.charAt(i);
              
            }
              
          
          
        }
        
        
        for(int i=0;i<str.length()/2;i++){
          if(Character.isLetter(str.charAt(i))){
              ans1+=str.charAt(i);
              
            }
              
          
          
        }
        
        return ans1.equals(ans);
       
    }
    
    
}