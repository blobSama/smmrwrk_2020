
/**
 * Write a description of class SchoolClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SchoolClass
{
    // instance variables - replace the example below with your own
    private int num, cntr = 0;
    private String name;
    private String[] studNames = new String[40];
    static int totNumClass = 0;
    
    public SchoolClass(int num, String name)
    {
        this.name = name;
        this.num = num;
        totNumClass++;
    }
    
    //get
    public String getName()
    {
        return this.name;
    }
    
    public int getNum()
    {
        return this.num;
    }
    
    public int getTotNumClass()
    {
        return totNumClass;
    }
    
    public String[] getStudNames()
    {
        return this.studNames;
    }
    
    //set
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setNum(int num)
    {
        if(num <= 6 && num >= 1)
            this.num = num;
    }
    
    public void setTotNumClass(int num)
    {
        totNumClass = num;
    }
    
    public void setStudName(String[] names)
    {
        int i;
        for(i = 0; i < names.length; i++)
        {
            this.studNames[i] = names[i];
        }
        
        if(i != 39)
        {
            for(; i < this.studNames.length; i++)
            {
                this.studNames[i] = "";
            }
        }
        cntr = getNumOfStudents();
    }
    
    
    
    public int getNumOfStudents()
    {
        int counter = 0;
        for(int i = 0; i < studNames.length; i++)
        {
            if(studNames[i] != null)
                counter++;
        }
        return counter;
    }
    
    public void insertStudent(String student)
    {
        if(cntr == 40)
            System.out.println("Sorry, there is not enough room for another student.");
        else
        {
            this.studNames[cntr] = student;
            cntr++;
        }
    }
    
    public int getNameLength()
    {
        int sum = 0;
        for(int i = 0; i < getNumOfStudents(); i++)
        {
            if(this.studNames[i].length() >= 8)
                sum++;
        }
        return sum;
    }
    
    public String getBigger(SchoolClass cls)
    {
        if(this.getNumOfStudents() > cls.getNumOfStudents())
            return this.getName();
        else
            if(this.getNumOfStudents() < cls.getNumOfStudents())
                return cls.getName();
            else
                return "There is an equal number of students.";
    }
}
