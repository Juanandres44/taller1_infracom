import java.io.IOException;
import java.util.Scanner;


public class thread extends Thread {
    public String name;
    public static int maxNumber = 0;

    public thread(String name){
        this.name = name;
    }


    public static void main(String[] args) throws IOException{
         
        System.out.print("Please enter a Number :");
        Scanner userNumber= new Scanner(System.in);
        maxNumber = Integer.parseInt(userNumber.next());
        thread t1 = new thread("Thread"+1);
        thread t2 = new thread("Thread"+2);

        t1.start();
        t2.start();
       
       
    }

    public void run(){
        try{
            if(name.equals("Thread1"))
            {
                for(int i=1;i<=maxNumber; i++){
                    if(i%2 == 0){
                        System.out.println(i);
                        Thread.sleep(500);
                    }
                }
                Thread.sleep(20);
            }
            if(name.equals("Thread2")){
                Thread.sleep(2500);
                for(int i =1; i<=maxNumber; i++){
                    if(i%2 == 1){
                        System.out.println(i);
                    }
                }
            }
        }
        catch(Exception e){}
    }
}