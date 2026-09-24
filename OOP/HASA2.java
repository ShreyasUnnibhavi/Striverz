package OOP;

class MenuItem {
    String name;
    String description;

    void displayMenuItemDetails() {
        System.out.println("MenuItem Name: " + name);
        System.out.println("MenuItem Description: " + description);
    }
}

class Restaurant {
    MenuItem specialOfTheDay = new MenuItem();

    void displaySpecialOfTheDay() {
        specialOfTheDay.displayMenuItemDetails();
    }
}

public class HASA2 {
    public static void main(String[] args) {
        Restaurant myRestaurant = new Restaurant();
        myRestaurant.specialOfTheDay.name = "Caesar Salad";
        myRestaurant.specialOfTheDay.description = "Crisp romaine lettuce, croutons, and Parmesan cheese tossed with Caesar dressing.";
        myRestaurant.displaySpecialOfTheDay();
    }
}