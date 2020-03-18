public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        paper E1 = new paper("null","null","null","null",0,"null",0,0,"null","null","null","null",false);
        E1.setPaper_Title("Computer Science");
        E1.setPaper_id_Num("12345");
        E1.setProgram_Name("BSCS");
        E1.setCollected(false);
        E1.setSemster_num(2);
        E1.setType_of_Exam("final Exam");
        E1.setNum_Student("421");
        E1.setLocation("Kohat University");
        E1.setInvigilator("Sir Roman");
        E1.setCourse_Code("102");
        E1.setCourse_Incharge("Sir Ali Zeb");
        System.out.println(E1.toString());
      
        
        Course E2 = new Course("null",0,"null","null");
		//E2.setcourse_Name("java");
		E2.setCourse_code(123);
		E2.setProgram_Name("BSCS");
		E2.setCourse_offered("Sir Ali Zeb");
		System.out.println(E2.toString());
		
        
    }
    
}
