public class Exercise7 {
    public static void main(String[] args) {
        City Paris = new City("Paris", 800.10, 1200000);
        City London = new City("London", 1200.10, 1400000);
        City Maynooth = new City("Maynooth", 30.10, 30000);
        City Dublin = new City("Dublin", 150.10, 140000);
        City Clane = new City("Clane", 13.10, 2000);

        City[] City = new City[] { Paris, London, Maynooth, Dublin, Clane };
        bubbleSortCity(City);
    }

    public static void bubbleSortCity(City data[]) {
        City temp;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {

                if (data[j].population < data[i].population) {
                    temp = data[j];
                    data[j] = data[i];
                    data[i] = temp;
                }
            }
        }
        for (int i = 0; i < data.length; i++) {
            System.out.println("City Name: " + data[i].name + "\nCity Area: " + data[i].area + "\nCity Population: " + data[i].population);
        }
    }
}

class City {
    String name;
    Double area;
    int population;

    public City(String name, Double area, int population) {
        this.name = name;
        this.area = area;
        this.population = population;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return this.area;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getPopulation() {
        return this.population;
    }
}