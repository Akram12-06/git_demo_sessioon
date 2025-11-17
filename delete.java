interface  car{
    // int age;
    abstract void run();
}

class benz implements car{
    @Override
    public void run(){
        System.out.println("running safely");
    }
     
}

public class delete{
    public static void main(String[] args) {
        int[] arr = new int[10];

        for(int i=0;i<10;i++){
            arr[i] = i+1;
        }
        for(int i=0;i<10;i++){
            System.out.print(arr[i]+" ");
        }
    }
}