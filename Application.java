package second;

import java.util.ArrayList;
import java.util.Objects;

public class Application {

    private ArrayList<Student> arrayStudent;

    public Application(){

        this.arrayStudent = new ArrayList<Student>();

    }

    public void addStudent(Student student){

        this.arrayStudent.add(student);

    }

    public void printAllNote(){

        for(int i = 0; i < this.arrayStudent.size(); i += 1){

            this.arrayStudent.get(i).readNote();

        }

    }

    public void getAverage(int position){

        System.out.println(this.arrayStudent.get(position).getAverage());

    }

    public void addNote(int position, float note, String subject){

        Mark mark = new Mark(note, subject);
        this.arrayStudent.get(position).addNote(mark);


    }

    public int maxSubjectEval(){

        int max = this.arrayStudent.get(0).getComptSubject();

        for(int i = 1; i < this.arrayStudent.size(); i += 1){

            if(max < this.arrayStudent.get(i).getComptSubject()){

                max = this.arrayStudent.get(i).getComptSubject();

            }
        }

        return max;
    }

    public float[] getTabAvg(){

        float[] arrayAvg = new float[this.arrayStudent.size()] ;
        float temp;

        for(int i = 0; i < this.arrayStudent.size(); i += 1) {

            arrayAvg[i] = this.arrayStudent.get(i).getAverage();
        }

        for(int i = 0; i < arrayAvg.length; i += 1) {

            for(int j = i + 1; j < arrayAvg.length; j += 1 ){

                if(arrayAvg[j] < arrayAvg[i]){
                    temp = arrayAvg[j];
                    arrayAvg[j] = arrayAvg[i];
                    arrayAvg[i] = temp;
                }

            }
        }

        return arrayAvg;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Application)) return false;
        Application that = (Application) o;
        return Objects.equals(arrayStudent, that.arrayStudent);
    }


    @Override
    public String toString() {
        return "Application{" +
                "arrayStudent=" + arrayStudent +
                '}';
    }

    public static void main(String args[]) {

        Student one = new Student("Gaetan", "Corse", 2);
        Student two = new Student("Cyrano", "De Bergerac", 1);
        Student three = new Student("Joanne", "Mueller", 6);
        Student four = new Student("Agatha", "Moses", 5);
        Student five = new Student("cyrielle", "Fleur", 4);
        Student six = new Student("Adil", "Fahir", 3);

        Application application = new Application();

        application.addStudent(one);
        application.addStudent(two);
        application.addStudent(three);
        application.addStudent(four);
        application.addStudent(five);
        application.addStudent(six);

        //adding grades
        application.addNote(0, 17, "Francais");
        application.addNote(0, 13.5f, "Maths");
        application.addNote(0, 14.5f, "EPS");
        application.addNote(1, 14, "Francais");
        application.addNote(1, 17, "Maths");
        application.addNote(1, 18.1f, "Anglais");
        application.addNote(1, 8.5f, "Physique");
        application.addNote(2, 10, "Philosophie");
        application.addNote(3, 15.1f, "SVT");
        application.addNote(3, 17.75f, "Allemand");
        application.addNote(3, 6.75f, "Technologie");

        // printing the grades array
        System.out.println(" /n array of grades :");
        application.printAllNote();

        //avg of a student
        System.out.println(" /n avg of the student at pos 2 :");
        application.getAverage(1);


        //maximum of subjects
        System.out.println(" /n maximum of subjects : " + application.maxSubjectEval());

        //array of avg marks
        float arrayAvg[] = application.getTabAvg();

        for(int i = 0; i < arrayAvg.length ; i += 1 ){


            System.out.println(arrayAvg[i]);

        }


    }
}

