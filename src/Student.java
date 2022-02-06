public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }
    public void addBulkExamNote(int mat, int mathPerformanceGrade, int fizik, int physicPerformanceGrade, int kimya, int chemPerformanceGrade) {

        if (mat >= 0 && mat <= 100 && mathPerformanceGrade >= 0 && mathPerformanceGrade <= 100) {
            this.mat.note = mat;
            this.mat.performanceGrade = mathPerformanceGrade;
            this.mat.avr = (mat * this.mat.ratio + mathPerformanceGrade * (100 - this.mat.ratio)) / 100;
        }

        if (fizik >= 0 && fizik <= 100 && physicPerformanceGrade >= 0 && physicPerformanceGrade <= 100) {
            this.fizik.note = fizik;
            this.fizik.performanceGrade = physicPerformanceGrade;
            this.fizik.avr = (fizik * this.fizik.ratio + physicPerformanceGrade * (100 - this.fizik.ratio)) / 100;
        }

        if (kimya >= 0 && kimya <= 100 && chemPerformanceGrade <= 100 && chemPerformanceGrade >= 0) {
            this.kimya.note = kimya;
            this.kimya.performanceGrade = chemPerformanceGrade;
            this.kimya.avr = (kimya * this.kimya.ratio + chemPerformanceGrade * (100 - this.kimya.ratio)) / 100;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0 || this.mat.performanceGrade == 0 || this.fizik.performanceGrade == 0 || this.kimya.performanceGrade == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }
    public void calcAvarage() {
        this.avarage = (this.mat.avr + this.kimya.avr + this.fizik.avr) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Matematik Performans Notu : " + this.mat.performanceGrade);
        System.out.printf("Matematik Performans Notunun etkisi : %%%d%n", 100 - this.mat.ratio);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Fizik Performans Notu : " + this.fizik.performanceGrade);
        System.out.printf("Fizik Performans Notunun etkisi : %%%d%n", 100 - this.fizik.ratio);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Kimya Performans Notu : " + this.kimya.performanceGrade);
        System.out.printf("Kimya Performans Notunun etkisi : %%%d%n", 100 - this.kimya.ratio);
    }

}
