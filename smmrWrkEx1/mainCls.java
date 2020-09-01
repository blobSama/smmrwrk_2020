import java.util.*;
/**
 * Write a description of class mainCls here.
 *
 * @author (A.Y.B)
 * @version (a version number or a date)
 */
public class mainCls
{
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args)
    {
        //2
        /*
        SchoolClass cls1 = new SchoolClass(3, "Geoffrey");
        SchoolClass cls2 = new SchoolClass(2, "George");
        
        for(int i = 0; i < 5; i++)
        {
            switch(i)
            {
                case 0: cls1.insertStudent("George");
                    break;
                case 1: cls1.insertStudent("Geoffrey");
                    break;
                case 2: cls1.insertStudent("Percy");
                    break;
                case 3: cls1.insertStudent("Blob");
                    break;
                case 4: cls1.insertStudent("Ariel");
                    break;
            }
        }
        
        for(int i = 0; i < 6; i++)
        {
            switch(i)
            {
                case 0: cls2.insertStudent("George");
                    break;
                case 1: cls2.insertStudent("Geoffrey");
                    break;
                case 2: cls2.insertStudent("Percy");
                    break;
                case 3: cls2.insertStudent("Blob");
                    break;
                case 4: cls2.insertStudent("Ariel");
                    break;
                case 5: cls2.insertStudent("Tomer");
                    break;
            }
        }
        //3
        System.out.println(cls1.getBigger(cls2));
        */
        //6
        SchoolClass[] School = new SchoolClass[5];
        String teachName, name;
        int classNum;
        for(int i = 0; i < 5; i++)
        {
            System.out.print("Please enter the teacher name: ");
            teachName = reader.next();
            System.out.print("Please enter the class number: ");
            classNum = reader.nextInt();
            School[i] = new SchoolClass(classNum, teachName);
            System.out.print("Please enter the student name: ");
            name = reader.next();
            while(!(name.equals("end")))
            {
                School[i].insertStudent(name);
                System.out.print("Please enter the student name: ");
                name = reader.next();
            }
        }
        
        int sumAll = 0;
        for(int i = 0; i < 5; i++)
        {
            sumAll += School[i].getNumOfStudents();
        }
        System.out.println("The average number of students in a class is: " + ((double)sumAll/School[0].getTotNumClass()) + ".");
        
    }

    
    //4
    public void addStudent(SchoolClass cls1, SchoolClass cls2, String name)
    {
        int n1 = cls1.getNumOfStudents();
        int n2 = cls2.getNumOfStudents();
        
        if(n1 <= n2 && n1 < 40)
            cls1.insertStudent(name );
        else
            if(n1 > n2 && n2 < 40)
                cls2.insertStudent(name );
            else
                System.out.println("Both classes are full.");
    }
    
    //5
    public void merge(SchoolClass cls1, SchoolClass cls2, String name)
    {
        String[] cls2Names = cls2.getStudNames();
        
        for(int i = 0; i < cls2.getNumOfStudents(); i++)
        {
            cls1.insertStudent(cls2Names[i]);
        }
    }
}
