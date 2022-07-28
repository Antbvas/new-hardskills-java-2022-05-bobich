public class Aspirant extends Student {
    private final String aspirantWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String aspirantWork) {
        super(firstName, lastName, group, averageMark);
        this.aspirantWork = aspirantWork;
    }

    public double getSholarShip() {
        if (getAverageMark() == 5.0) {
            return 300;
        }
        return 200;
    }
}
