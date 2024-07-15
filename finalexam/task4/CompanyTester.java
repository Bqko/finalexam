package finalexam.task4;

import java.io.IOException;

public class CompanyTester {
    public static void main(String[] args) {
        AgriculturalCompany company = new AgriculturalCompany("123 Farm Lane", "VAT123456");

        Crop crop1 = new Crop("Wheat", "Grain", 20.5);
        Crop crop2 = new Crop("Corn", "Grain", 30.0);

        company.addCrop(crop1);
        company.addCrop(crop2);

        System.out.println("Crops after adding:");
        company.getCrops().forEach(System.out::println);

        try {
            company.saveCropsToFile("crops.dat");
            company.getCrops().clear();
            System.out.println("Crops after clearing:");
            company.getCrops().forEach(System.out::println);

            company.loadCropsFromFile("crops.dat");
            System.out.println("Crops after loading from file:");
            company.getCrops().forEach(System.out::println);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        company.deleteCrop(crop1);

        System.out.println("Crops after deleting Wheat:");
        company.getCrops().forEach(System.out::println);
    }
}
