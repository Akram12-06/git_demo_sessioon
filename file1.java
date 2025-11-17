// import tools.calc;
import tools.*;
abstract class human{
    String name;
    int age;
    
    void dispaly(){
        System.out.println("In the parent ");
    }

}

class person  extends human{
     
    void dispaly(){
        System.out.println("In the child");
    }
    

   
}

public class file1{
    static public void main(String[] args){
        
        calc cal = new calc();

        int res = cal.add(1,2);
        System.out.println(res);
    }
    
}