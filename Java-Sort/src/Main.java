import java.util.*;

class Student implements Comparator<Student> {
    private int id;
    private String fname;
    private double cgpa;

    public Student() {

    }

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.cgpa > o2.cgpa) {
            return -1;
        } else if (o1.cgpa < o2.cgpa) {
            return 1;
        } else if (o1.cgpa == o2.cgpa && !o1.fname.equals(o2.fname)) {
            return o1.fname.compareTo(o2.fname);
        } else {
            return Integer.compare(o2.id, o1.id);
        }
    }
}

//Complete the code
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        Collections.sort(studentList, new Student());
        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}



