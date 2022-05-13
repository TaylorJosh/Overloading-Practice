public class Counter {
        private int counterStart;
      
        public Counter(int startValue) {
        counterStart = startValue;
        }
      
        public Counter() {
          this.counterStart = 0;
        }
      
        public int value() {
          return counterStart;
        }
      
            
        public void increase() {
          this.counterStart += 1 ;
        }

        public void decrease() {
           this.counterStart -= 1;
          }


        public void increase(int increaseBy) {
            if (increaseBy > 0) {
            counterStart += increaseBy;
            }
          }
      
        public void decrease(int decreaseBy) {
          if (decreaseBy > 0) {
            counterStart -= decreaseBy;
          }
        }
      
        
      
        @Override
        public String toString() {
          return "Counter: " + counterStart;
        }
      }
    

