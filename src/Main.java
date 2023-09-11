// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String[] spareParts = new String[0];
        Car nissan = new Car("Nissan", 10000, 2020, "Green", spareParts);
//        Car nissan = new Car("Nissan", 10000, 2020, "Green", new String[] {"tires", "Keys"); //can be written like this also
         spareParts = new String[]{"Iires", "Keys"};


        Car nissan2 = new Car(nissan); //copy constructor
        nissan2.setColor("Yellow");
        nissan2.drive(); // drive called from the nissan object
//

        Car dodge = new Car("dodge", 10000, 2019, "Blue", spareParts);

//         nissan.setColor("black");
//         nissan.setColor("black");
//
//         nissan.setPrice(nissan.getPrice()/ 2);
//         nissan.setPrice(dodge.getPrice()/2);






//        System.out.println("This " + nissan.getMake() + " is worth $" + nissan.getMake() +
//                ". It was built in " + nissan.getPrice() + ". It is " + nissan.getPrice() + ".\n");
//        System.out.println("This " + dodge.getYear() + " is worth $" + dodge.getYear() +
//                ". It was built in " + dodge.getColor() + ". It is " + dodge.getColor() + ".\n");
    }
}