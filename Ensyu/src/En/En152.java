package En;
class CarEn152 implements Runnable
{
   private String name;

   public CarEn152(String nm)
   {
      name = nm;
   }
   public void run()
   {
      for(int i=0; i<5; i++){

         System.out.println(name + "の処理をしています。");

      } 
   }
}
class En152
{
   public static void main(String[] args)
   {
	   CarEn152 car1 = new CarEn152("1号車");
	   Thread th1 = new Thread(car1);
	   th1.start();
	  

      CarEn152 car2 = new CarEn152("2号車");
      Thread th2 = new Thread(car1);
      th2.start();

      for(int i=0; i<5; i++){

         System.out.println("main()の処理をしています。");

      } 
   }
}

