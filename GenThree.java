public class GenThree {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int randOne = (int) (Math.random() * (b - a)) + a;
        int randTwo = (int) (Math.random() * (b - a)) + a;
        int randThree = (int) (Math.random() * (b - a)) + a;
        System.out.println(randOne);
        System.out.println(randTwo);
        System.out.println(rand3);
        
        int min = Math.min(randOne, Math.min(randTwo, randThree));
        System.out.println("The minimal generated number was " + min);

    }
}
