class Student {
    private String name;
    private int age;
    private char gender;
    private String major;

    public Student(String name, int age, char gender, String major) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public String getMajor() {
        return major;
    }

    public void haveBirthday() {
        age++;
    }

    public double calculateScholarship(double baseAmount) {
        // Some logic to calculate scholarship
        return baseAmount + 200.0;
    }
}