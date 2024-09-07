public class Student {
    void m(){
        System.out.println("method is invoked");
    }
    void n(){
        this.m();
    }
    void p(){
        n();
    }

    public static void main(String[] args) {
       Student s = new Student();
       s.p();



    }
}