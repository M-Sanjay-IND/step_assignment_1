public class Level1_5 {
    public static void main(String[] args) {
        int pen_available = 14;
        int students = 3;
        int pen_remain = pen_available % students;
        int pen_per_student = pen_available / students;
        System.out.println("The Pen Per Student is " + pen_per_student + " and the remaining pen not distributed is "
                + pen_remain);
    }
}