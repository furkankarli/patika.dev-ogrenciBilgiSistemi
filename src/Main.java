public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut", "MAT", "555");
        Teacher t2 = new Teacher("Sefa", "FZK", "556");
        Teacher t3 = new Teacher("Sena", "TRK", "657");

        Course matematik = new Course("Matematik", "101", "MAT");
        matematik.addTeacher(t1);
        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);
        Course turkce = new Course("Türkçe", "103", "TRK");
        turkce.addTeacher(t3);

        Student s1 = new Student("Furkan", "212608", "BM2", matematik, turkce, fizik);
        s1.addBulkExamNote(50, 50, 50);
        s1.addBulkExaNote(50, 50, 50);
        s1.isPass();
        Student s2 = new Student("Mami", "212609", "BM2", matematik, turkce, fizik);
        s2.addBulkExamNote(100, 100, 100);
        s2.addBulkExaNote(100, 100, 100);
        s2.isPass();
    }
}