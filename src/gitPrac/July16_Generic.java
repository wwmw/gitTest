package gitPrac;

class July16_StudentInfo{
	public int grade;
	July16_StudentInfo(int grade){this.grade = grade;}
}

class July16_StudentPerson{
	public July16_StudentInfo info;
	July16_StudentPerson(July16_StudentInfo info){this.info = info;}
}

class July16_EmployeeInfo{
	public int rank;
	July16_EmployeeInfo(int rank){this.rank = rank;}
}

class July16_EmployeePerson{
	public July16_EmployeeInfo info;
	July16_EmployeePerson(July16_EmployeeInfo info){this.info = info;}
}

public class July16_Generic {
	public static void main(String[] args) {
		July16_StudentInfo si = new July16_StudentInfo(2);
		
	}
}
