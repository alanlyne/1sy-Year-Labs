
public class Exercise6 {
    public static void main(String[] args) {
        County Mayo = new County("Mayo", 5585.25, 3);
        County Wexford = new County("Wexford", 2352.65, 5);
        County Meath = new County("Meath", 2342.0, 7);
        County Cavan = new County("Cavan", 1931.57, 6);
        County Derry = new County("Derry", 2074.26, 1);

        County[] county = new County[] { Mayo, Wexford, Meath, Cavan, Derry };
        bubbleSortCounty(county);
    }

    public static void bubbleSortCounty(County data[]) {
        County temp;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {

                if (data[j].footballWins > data[i].footballWins) {
                    temp = data[j];
                    data[j] = data[i];
                    data[i] = temp;
                }
            }
        }
        for (int i = 0; i < data.length; i++) {
            System.out.println("County Name: " + data[i].name + "\nCounty Area: " + data[i].area + "\nFootball Wins: " + data[i].footballWins);
        }
    }
}

class County {
    String name;
    Double area;
    int footballWins;

    public County(String name, Double area, int footballWins) {
        this.name = name;
        this.area = area;
        this.footballWins = footballWins;
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

    public void setFootballWins(int footballWins) {
        this.footballWins = footballWins;
    }

    public double getFoorballWins() {
        return this.footballWins;
    }
}