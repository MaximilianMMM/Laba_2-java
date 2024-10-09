package zoo;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Section section = new Section("Savannah", "Africa Zone");
        HealthStatus healthyStatus = new HealthStatus("Healthy");

        Animal lion = new AnimalBuilder()
                .setName("Lion")
                .setGender("Male")
                .setBirthDate("2020-03-15")
                .setArrivalDate("2021-05-20")
                .setHealthStatus(healthyStatus)
                .setSection(section)
                .setFoodName("Meat")
                .build();

        Animal tiger = new AnimalBuilder()
                .setName("Tiger")
                .setGender("Female")
                .setBirthDate("2021-01-10")
                .setArrivalDate("2022-05-10")
                .setHealthStatus(healthyStatus)
                .setSection(section)
                .setFoodName("Meat")
                .build();

        Animal elephant = new AnimalBuilder()
                .setName("Elephant")
                .setGender("Male")
                .setBirthDate("2019-04-05")
                .setArrivalDate("2021-12-15")
                .setHealthStatus(healthyStatus)
                .setSection(section)
                .setFoodName("Vegetables")
                .build();

        List<Animal> animals = Arrays.asList(lion, tiger, elephant);

        AnimalService animalService = new AnimalService();

        System.out.println("Animals sorted by name:");
        animalService.sortAnimalsByName(animals).forEach(System.out::println);

        System.out.println("\nAnimals sorted by birth date:");
        animalService.sortAnimalsByBirthDate(animals).forEach(System.out::println);

        System.out.println("\nAnimals that eat meat:");
        animalService.filterAnimalsByFood(animals, "Meat").forEach(System.out::println);
    }
}
