class DisplayMessage extends Thread
{
   private String message;
   public DisplayMessage(String message)
   {
      this.message = message;
   }
   public void run()
   {

         System.out.println(message);
   }
}
public class ThreadTest
{
   public static void main(String [] args)
   {
      DisplayMessage thread1 = new DisplayMessage("Hello");
      System.out.println("Starting hello thread...");
      thread1.start();
      
      DisplayMessage thread2 = new DisplayMessage("hai");
      System.out.println("Starting hai thread...");
      thread2.start();

      DisplayMessage thread3 = new DisplayMessage("welcom");
      System.out.println("Starting welcome thread...");
      thread3.start();     

   }
}