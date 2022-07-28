public class Student {
    private final String firstName;
    private final String lastName;
    private final String group;
    private final double averageMark;


    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public double getSholarShip() {
        if (this.averageMark == 5.0) {
            return 150;
        }
        return 100;
    }

    public String getLastName() {
        return lastName;
    }

    public double getAverageMark() {
        return averageMark;
    }
}

