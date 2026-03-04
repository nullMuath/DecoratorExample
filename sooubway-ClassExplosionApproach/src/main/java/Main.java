public class Main {
    public static void main(String[] args) {
        Sandwich chicken = new Chicken();
        Sandwich chickenWithGarlic = new ChickenWithGarlic();

        System.out.println(chicken.getDescription() + " " + chicken.getPrice() );
        System.out.println(chickenWithGarlic.getDescription() + " " + chickenWithGarlic.getPrice());
    }
}
z