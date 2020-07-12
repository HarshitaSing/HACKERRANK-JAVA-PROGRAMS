import java.util.*;

class Student{
	private int id;
	private String fname;
	private double cgpa;
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
}

//Complete the code
public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0)
        {
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}

        Collections.sort(studentList,new Comparator<Student>(){
            @Override
            public int compare(Student a,Student b)
            {
                if(a.getCgpa() == b.getCgpa())
                {
                    int name = a.getFname().compareTo(b.getFname());
                    if(name == 0)
                        return (b.getId() - a.getId());
                    else
                        return name;
                }
                else
                    return (int) (b.getCgpa() * 1000 - a.getCgpa()*1000);
            }
        });
      
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}



