public class Car {
    private String logo = "Audi";
    private String model = "A6";
    private double engineСapacity = 2.5;
    private int yearOfManufacture = 2000;

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }
    @Override
    public void compare(){

    }
}
