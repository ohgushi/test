package En;

class CarEn153 implements Runnable 
{
   private String name;

   public CarEn153(String nm)
   {
      name = nm;
   }
   public  void run()
   {
      for(int i=0; i<5; i++){
         try{

        	 Thread.sleep(1000);
            System.out.println(name + "の処理をしています。");

         }
         catch(InterruptedException e){}
      } 
   }
}

class En153
{
   public static void main(String[] args) 
   {
	   CarEn153 car1 = new CarEn153("1号車");
	   Thread th1 = new Thread(car1);
	   th1.start();

      for(int i=0; i<5; i++){

         System.out.println("main()の処理をしています。");

      }
   }
}

