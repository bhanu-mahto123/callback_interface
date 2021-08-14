 public class B{
         IA inter;
         
         
         public void setIA(IA intf){
             this.inter = intf;
         }
         
         public void print(){
            //  System.out.println("Hello World B");
            // inter = new A();
            int sum =0;
            for(int i=0;i<5;i++){
                sum += 1;
            }
            inter.printIA(sum);
         }
}