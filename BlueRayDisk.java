public class BlueRayDisk {
    public String title;
    public String director;
    public int yearOfRelease;
    public double cost;
    public BlueRayDisk(String newTitle,String newDirector, int year, double money) {
        title = newTitle;
        director = newDirector;
        yearOfRelease = year;
        cost = money;
    }
    @Override
    public String toString() {
        return "$" + cost + " " + yearOfRelease + " " + title + ", " + director;
    }
}
