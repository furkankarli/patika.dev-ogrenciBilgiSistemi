public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;

    }
    void addBulkExamNote(int note1, int note2, int note3) {
        if(note1 >= 0 && note1 <= 100){
            this.c1.note = note1;
        }
        if(note2 >= 0 && note2 <= 100){
            this.c2.note = note2;
        }
        if(note3 >= 0 && note3 <= 100){
            this.c3.note = note3;
        }

    }
    void addBulkExaNote(int enote1, int enote2, int enote3) {
        if(enote1 >= 0 && enote1 <= 100){
            this.c1.exaNote = enote1;
        }
        if(enote2 >= 0 && enote2 <= 100){
            this.c2.exaNote = enote2;
        }
        if(enote3 >= 0 && enote3 <= 100){
            this.c3.exaNote = enote3;
        }

    }
    void isPass() {
        System.out.println("============================");
        this.avarage = (((this.c1.note * 0.8 + this.c1.exaNote * 0.2) + (this.c2.note * 0.8 + this.c2.exaNote * 0.2) + (this.c3.note * 0.8 + this.c3.exaNote * 0.2)) / 3);
        if (this.avarage > 55) {
            System.out.println("Sınıfı Geçtiniz!!");
            this.isPass = true;
        } else {
            System.out.println("Sınıfta Kaldınız :(");
            this.isPass = false;
        }
        printNote();
    }
    void printNote(){
        System.out.println(this.c1.name + " Notu\t:" + c1.note);
        System.out.println(this.c2.name + " Notu\t:" + c2.note);
        System.out.println(this.c3.name + " Notu\t:" + c3.note);
        System.out.println(this.c1.name + " SNotu\t:" + c1.exaNote);
        System.out.println(this.c2.name + " SNotu\t:" + c2.exaNote);
        System.out.println(this.c3.name + " SNotu\t:" + c3.exaNote);
        System.out.println("Ortalamanız :" + this.avarage);
    }

}
