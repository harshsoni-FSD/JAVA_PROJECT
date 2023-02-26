public class Stringquestiontocountvovelsconsonets {
    

public class string {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //char c[]={'a','e','i','o','u'};
        String s="Hello have a good day";
        String s1="";
       int  vovelscount=0;
       int  consonetscount=0;
       int specialchar=0;
       // char chr[]=s.toCharArray();
        
       
        
     // String input = "Hi welc#ome to t$utori$alspoint";
    //   String regex = "([^aeiouAEIOU0-9\\W]+)";
    //   String result = s.replaceAll(regex, "");
    //   System.out.println("Result: "+result);

      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')){
            vovelscount++;
        }
        else if(ch==' '||ch=='@'||ch=='/'){
            specialchar++;
        }
        else{
            consonetscount++;
        }
      }
      System.out.println(vovelscount);
      System.out.println(specialchar);
      System.out.println(consonetscount);
   
  
        
        
        
       // System.out.println(s.equals(s1)); //true
    }
    
}

}
