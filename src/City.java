public class City {
    private String cityname;
    public City(String cityname) {
        this.cityname = cityname;
    }

    public String getCityname() {
        return cityname;
    }
    public String getCityName(){return cityname;}

    @Override
    public String toString() {
        return "city:";
    }


}
