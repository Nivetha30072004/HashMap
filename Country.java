import java.util.HashMap;
import java.util.Scanner;

public class Country {
    private HashMap<String, String> countryMap;

    public Country() {
        countryMap = new HashMap<>();
    }

    public void add(String cname, String capname) {
        countryMap.put(cname.toLowerCase(), capname);
    }

    public String search(String cname) {
        if (countryMap.isEmpty()) {
            return "The map is empty";
        }
        String capital = countryMap.getOrDefault(cname.toLowerCase(), "Data not found");
        return capital;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Country country = new Country();

        while (true) {
            System.out.println("1.Add\n2.Search\n3.Exit");
            System.out.println("Enter your choice");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter the country name");
                    String countryName = scanner.nextLine();
                    System.out.println("Enter the capital name");
                    String capitalName = scanner.nextLine();
                    country.add(countryName, capitalName);
                    break;
                case 2:
                    System.out.println("Enter the country name");
                    String searchCountry = scanner.nextLine();
                    String result = country.search(searchCountry);
                    System.out.println(result);
                    break;
                case 3:
                    System.out.println("Thank you for using the application");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}