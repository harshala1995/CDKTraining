package ServletPackage;

import java.util.Date;

public class CricketData {
    String city;
    int runs;
    String type;
    Date date;
    String country1;
    String country2;

    public CricketData(String city, int runs, String type, Date date, String country1, String country2) {
        this.city = city;
        this.runs = runs;
        this.type = type;
        this.date = date;
        this.country1 = country1;
        this.country2 = country2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCountry1() {
        return country1;
    }

    public void setCountry1(String country1) {
        this.country1 = country1;
    }

    public String getCountry2() {
        return country2;
    }

    public void setCountry2(String country2) {
        this.country2 = country2;
    }

    @Override
    public String toString() {
        return "CricketData{" +
                "city='" + city + '\'' +
                ", runs=" + runs +
                ", type='" + type + '\'' +
                ", date=" + date +
                ", country1='" + country1 + '\'' +
                ", country2='" + country2 + '\'' +
                '}';
    }
}
