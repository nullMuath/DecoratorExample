public class Main {
    public static void main(String[] args){
        Sandwich s = new Chicken();
        s.hasChipotleSauce();
        s.hasMayonnaise();

        System.out.println(s.getDescription()); // Chicken Sandwich, Chipotle, Mayonnaise
        System.out.println(s.getPrice());       // 21.8
        s.hasMayonnaise();
        s.hasBlueCheese();

        System.out.println(s.getDescription()); // Chicken Sandwich, Chipotle, Mayonnaise, Mayonnaise, Blue Cheese
        System.out.println(s.getPrice());       // 24.3
    }
}
