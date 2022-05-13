public class CounterMain {


    public static void main(String[] args) {
      //Starting Counter Method
      var counter = new Counter();
      System.out.println(counter);
      
  
      //Create new counter with value of 150
      counter = new Counter(150);
      System.out.println(counter);
       
  
      //Increase counter by (1) 
      counter.increase();
      System.out.println(counter);
      
      //Decrease counter by (1)
      counter.decrease();
      System.out.println(counter);
      
      //Increase counter by 'increaseBy' number
      counter.increase(200);
      System.out.println(counter);


      //Decrease counter by 'increaseBy' number
      counter.decrease(75);
      System.out.println(counter);
      
    }
  }
