import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
/*
 * Create the Student and Priorities classes here.
 */
class Student{
     int id;
     String name;
     double cgpa;
     public Student(int id, String name, double cgpa){

         this.id=id;
         this.name=name;
         this.cgpa=cgpa;

     }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getCgpa() {
        return cgpa;
    }

 }
 class Priorities {

   public  List<Student> getStudents(List<String> events) {
         PriorityQueue<Student> pq=new PriorityQueue(10,new MyComparator());
        


    int i=0;
    while(i < events.size())  {
            if (events.get(i).equals("SERVED")) {
                pq.poll();
            } else {
                String[] attributes = events.get(i).split("\\s");
                Student student = new Student(
                        Integer.parseInt(attributes[3]),
                        attributes[1],
                        Double.parseDouble(attributes[2])
                );
                pq.offer(student);
            }
            i++;
        }

// for(int i=0;i<events.size();i++){
//   Student s=(Student)events.get(i);
//   pq.add(s);
// }

   List<Student> l = new ArrayList<Student>();
   while (!pq.isEmpty()) {
            l.add(pq.poll());
  
   }
    return l;
   }

 }
 class MyComparator implements Comparator<Student>{
     public int compare(Student s1,Student s2){
         Double cgpa1=s1.getCgpa();
         Double cgpa2=s2.getCgpa();
         String n1=s1.getName();
         String n2=s2.getName();
         Integer i1=s1.getId();
         Integer i2=s2.getId();
         if(Double.compare(s2.getCgpa(),s1.getCgpa())==0){
             if(n1.compareTo(n2)==0)
             {
                 return i1.compareTo(i2);
             }
             else{
                 return n1.compareTo(n2);
             }
         }
         else{
            return Double.compare(s2.getCgpa(),s1.getCgpa());
             }



     }



 }

public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}