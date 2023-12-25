public class GenThree {



    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
      //  double range 
//
        int rand1 = (int) (Math.random() * (b - a)) + a;
        int rand2 = (int) (Math.random() * (b - a)) + a;
        int rand3 = (int) (Math.random() * (b - a)) + a;
        System.out.println(rand1);
        System.out.println(rand2);
        System.out.println(rand3);
        
        int min = Math.min(rand1, Math.min(rand2, rand3));
        System.out.println("The minimal generated number was " + min);



    }



}
