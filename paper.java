public class paper
{
    private String paper_Title;
    private String paper_id_Num;
    private String course_Code;
    private String course_Incharge;
    private int semster_num;
    private String program_Name;
    private int date;
    private int time;
    private String type_of_Exam;
    private String invigilator;
    private String location;
    private String num_Student;
    private boolean collected;
	

    public paper(String paper_Title, String paper_id_Num, String course_Code, String course_Incharge, int semster_num, String program_Name, int date, int time, String type_of_Exam, String invigilator, String location, String num_Student, boolean collected) {
        this.paper_Title = paper_Title;
        this.paper_id_Num = paper_id_Num;
        this.course_Code = course_Code;
        this.course_Incharge = course_Incharge;
        this.semster_num = semster_num;
        this.program_Name = program_Name;
        this.date = date;
        this.time = time;
        this.type_of_Exam = type_of_Exam;
        this.invigilator = invigilator;
        this.location = location;
        this.num_Student = num_Student;
        this.collected = collected;
    }

    public void setPaper_Title(String paper_Title) {
        this.paper_Title = paper_Title;
    }

    public void setPaper_id_Num(String paper_id_Num) {
        this.paper_id_Num = paper_id_Num;
    }

    public void setCourse_Code(String course_Code) {
        this.course_Code = course_Code;
    }

    public void setCourse_Incharge(String course_Incharge) {
        this.course_Incharge = course_Incharge;
    }

    public void setSemster_num(int semster_num) {
        this.semster_num = semster_num;
    }

    public void setProgram_Name(String program_Name) {
        this.program_Name = program_Name;
    }
    public String getDate()
    {
        return "2"+"/"+"3"+"/"+"2020";
    } 
    public String getTime()
    {
        return "2"+":"+"30";
    }
    
    public void setDate(int date) {
        this.date = date;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setType_of_Exam(String type_of_Exam) {
        this.type_of_Exam = type_of_Exam;
    }

    public void setInvigilator(String invigilator) {
        this.invigilator = invigilator;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setNum_Student(String num_Student) {
        this.num_Student = num_Student;
    }

    public void setCollected(boolean collected) {
        this.collected = collected;
    }

    public String getPaper_Title() {
        return paper_Title;
    }

    public String getPaper_id_Num() {
        return paper_id_Num;
    }

    public String getCourse_Code() {
        return course_Code;
    }

    public String getCourse_Incharge() {
        return course_Incharge;
    }

    public int getSemster_num() {
        return semster_num;
    }

    public String getProgram_Name() {
        return program_Name;
    }

   

    public String getType_of_Exam() {
        return type_of_Exam;
    }

    public String getInvigilator() {
        return invigilator;
    }

    public String getLocation() {
        return location;
    }

    public String getNum_Student() {
        return num_Student;
    }

    public boolean isCollected() {
        return collected;
    } 

    @Override
    public String toString() {
        return "Paper" + "\nPaper_Title is=" + paper_Title + "\n paper  ID number is =" + paper_id_Num + "\n The course code of the paper is =" + course_Code + "\n Course Incharge are =" + course_Incharge + "\n Semester  number is =" + semster_num + "\nprogram Name is =" + program_Name + "\ntody date is =" + getDate() + "\n time =" + getTime() + "\n type of Examination is =" + type_of_Exam + "\n invigilator name is =" + invigilator + "\n location of the hall is =" + location + "\nnumber Student  in the hall are =" + num_Student + "\n collected=" + collected ;
    }
    
    
}