
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
        return this.totNumClass;
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
        int i = 0;
        for(; i < names.length; i++)
        {
            this.studNames[i] = names[i];
        }
        
        if(i != 39)
        {
            for(i = i + 1; i < this.studNames.length; i++)
            {
                this.studNames[i] = "";
            }
        }
    }
    
    
    
    public int getNumOfStudents()
    {
        int counter = 0;
        for(int i = 0; i < studNames.length; i++)
        {
            if(studNames[i] != null)
                counter++;
        }
        String[] s1 = new String[counter];
        for(int i = 0; i < s1.length; i++)
        {
            s1[i] = studNames[i];
        }
        return (s1.length);
    }
    
    public void insertStudent(String student)
    {
        if(cntr == 39)
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
        for(int i = 0; i < studNames.length; i++)
        {
            if(this.studNames[i].length() >= 8)
                sum++;
        }
        return sum;
    }
    
    public String getBigger(SchoolClass cls)
    {
        if(this.studNames.length > cls.studNames.length)
            return this.getName();
        else
            if(this.studNames.length < cls.studNames.length)
                return cls.getName();
            else
                return "There is an equal number of students.";
    }
}
