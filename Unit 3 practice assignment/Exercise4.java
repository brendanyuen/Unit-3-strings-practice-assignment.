class Exercise4{

    public static void main(String[] args){
        System.out.println("happy: "+piglatin("happy"));
        System.out.println("ha: "+piglatin("ha"));
        System.out.println("happy birthday: "+piglatin("happy birthday"));
        System.out.println("I love starcraft: "+piglatin("I love starcraft"));
        System.out.println("Good night: "+piglatin("Good night"));

    }

    public static String piglatin(String str){
        String ans="";
        if(str.length()<=2)
            return str;

        int i=0;
        while(i<str.length()-1){
            int space=str.indexOf(" ");

            if(Character.isLetter(str.charAt(i))&&str.contains(" ")){
                if(space>=2)
                    ans+=str.substring(i+1,space)+str.substring(i,i+1)+"ay"+" ";
                    

                
                else
                    ans+=str.substring(i,space)+ " "; 
                    str=str.substring(space+1);
            }
            if(!str.contains(" ")){
                ans+=str.substring(i+1)+str.substring(i,i+1)+"ay ";
                i=str.length()-1;
            }

          
        }
        return ans;
    }
}
