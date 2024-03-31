class Teacher extends Person {
    private int numCourses = 0;
    private ArrayList<String> courses = new ArrayList<>();

    public Teacher(String name, String address) {
        super(name, address);
    }

    public boolean addCourse(String course) {
        if (courses.contains(course)) {
            return false;
        } else {
            courses.add(course);
            numCourses++;
            return true;
        }
    }

    public boolean removeCourse(String course) {
        if (!courses.contains(course)) {
            return false;
        } else {
            courses.remove(course);
            numCourses--;
            return true;
        }
    }

    public String toString() {
        return "Teacher: " + super.toString();
    }
}
