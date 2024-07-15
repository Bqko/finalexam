package finalexam.task4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AgriculturalCompany implements LegalEntity {
    private String address;
    private String vatNumber;
    private List<Crop> crops = new ArrayList<>();

    public AgriculturalCompany(String address, String vatNumber) {
        this.address = address;
        this.vatNumber = vatNumber;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getVatNumber() {
        return vatNumber;
    }

    public void addCrop(Crop crop) {
        crops.add(crop);
    }

    public boolean deleteCrop(Crop crop) {
        return crops.remove(crop);
    }

    public List<Crop> getCrops() {
        return crops;
    }

    public void saveCropsToFile(String filename) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(crops);
        }
    }

    public void loadCropsFromFile(String filename) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            crops = (List<Crop>) ois.readObject();
        }
    }
}
