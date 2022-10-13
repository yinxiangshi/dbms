package backends;

import java.util.logging.*;

public class InsertRecords {
    private ConnectDB connector;
    private Logger logger;

    String studentsInfo = "INSERT INTO students (`snum`,`ssn`,`name`,`gender`,`dob`,`c_addr`,`c_phone`,`p_addr`,`p_phone`) VALUES ";
    String studentsInfo1 = "(1002,123097834,'Victor','M','2000-05-06 00:00:00','270 W Hall','5151234578','702 Walnut','7080366333');";
    String studentsInfo2 = "(1005,186032894,'Nicole','F','2001-04-01 00:00:00','178 S Hall','5158891155','13 Gray','5157162071');";
    String studentsInfo3 = "(1007,432609519,'Kevin','M','2000-08-12 00:00:00','75 E Hall','5157082497','89 National','7182340772');";
    String studentsInfo4 = "(1006,534218752,'Becky','F','2001-05-16 00:00:00','12 N Hall','5157083698','189 Clark','2034367632');";
    String studentsInfo5 = "(1001,654651234,'Randy','M','2000-12-01 00:00:00','301 E Hall','5152700988','121 Main','7083066321');";
    String studentsInfo6 = "(1004,746897816,'Seth','M','1998-12-30 00:00:00','199 N Hall','5158891504','21 Green','5154132907');";
    String studentsInfo7 = "(1003,978012431,'John','M','1999-07-08 00:00:00','201 W Hall','5154132805','888 University','5152012011');";

    String deptInfo = "INSERT INTO departments (`code`,`name`,`phone`,`college`) VALUES ";
    String deptInfo1 = "(401,'Computer Science','5152982801','LAS');";
    String deptInfo2 = "(402,'Mathematics','5152982802','LAS');";
    String deptInfo3 = "(403,'Chemical Engineering','5152982803','Engineering');";
    String deptInfo4 =  "(404,'Landscape Architect','5152982804','Design');";

    String degreeInfo = "INSERT INTO degrees (`name`,`level`,`department_code`) VALUES ";
    String degreeInfo1 = "('Computer Science','BS',401);";
    String degreeInfo2 = "('Computer Science','MS',401);";
    String degreeInfo3 = "('Computer Science','PhD',401);";
    String degreeInfo4 = "('Software Engineering','BS',401);";
    String degreeInfo5 = "('Applied Mathematics','MS',402);";
    String degreeInfo6 = "('Chemical Engineering','BS',403);";
    String degreeInfo7 = "('Landscape Architect','BS',404);";

    String courseInfo ="INSERT INTO courses (`number`,`name`,`description`,`credithours`,`level`,`department_code`) VALUES ";
    String courseInfo1 = "(101,'Calculus','Limit and Derivative',4,'Undergraduate',402);";
    String courseInfo2 = "(113,'Spreadsheet','Microsoft Excel and Access',3,'Undergraduate',401);";
    String courseInfo3 = "(228,'Special Topics','Interesting Topics about CE',3,'Undergraduate',403);";
    String courseInfo4 = "(311,'Algorithm','Design and Analysis',3,'Undergraduate',401);";
    String courseInfo5 = "(363,'Database','Design Principle',3,'Undergraduate',401);";
    String courseInfo6 = "(412,'Water Management','Water Management',3,'Undergraduate',404);";
    String courseInfo7 = "(531,'Theory of Computation','Theorem and Probability',3,'Graduate',401);";

    String regInfo = "INSERT INTO register (`snum`,`course_number`,`regtime`,`grade`) VALUES ";
    String regInfo1 = "(1001,363,'Fall2020',3);";
    String regInfo2 = "(1002,311,'Fall2020',4);";
    String regInfo3 = "(1003,228,'Fall2020',4);";
    String regInfo4 = "(1004,363,'Spring2021',3);";
    String regInfo5 = "(1005,531,'Spring2021',4);";
    String regInfo6 = "(1006,363,'Fall2020',3);";
    String regInfo7 = "(1007,531,'Spring2021',4);";

    String majorInfo = "INSERT INTO major (`snum`,`name`,`level`) VALUES ";
    String majorInfo1 = "(1006,'Applied Mathematics','MS');";
    String majorInfo2 = "(1003,'Chemical Engineering','BS');";
    String majorInfo3 = "(1001,'Computer Science','BS');";
    String majorInfo4 = "(1005,'Computer Science','MS');";
    String majorInfo5 = "(1007,'Computer Science','PhD');";
    String majorInfo6 = "(1004,'Landscape Architect','BS');";
    String majorInfo7 = "(1002,'Software Engineering','BS');";

    String minorInfo = "INSERT INTO minor (`snum`,`name`,`level`) VALUES ";
    String minorInfo1 = "(1005,'Applied Mathematics','MS');";
    String minorInfo2 = "(1007,'Applied Mathematics','MS');";
    String minorInfo3 = "(1001,'Software Engineering','BS');";

    public InsertRecords(ConnectDB connector){
        this.connector = connector;
        this.logger = Logger.getGlobal();
    }

    public void Insert(){
        this.logger.info("Start inserting records");
        this.connector.execute(studentsInfo+studentsInfo1);
        this.connector.execute(studentsInfo+studentsInfo2);
        this.connector.execute(studentsInfo+studentsInfo3);
        this.connector.execute(studentsInfo+studentsInfo4);
        this.connector.execute(studentsInfo+studentsInfo5);
        this.connector.execute(studentsInfo+studentsInfo6);
        this.connector.execute(studentsInfo+studentsInfo7);

        this.connector.execute(deptInfo+deptInfo1);
        this.connector.execute(deptInfo+deptInfo2);
        this.connector.execute(deptInfo+deptInfo3);
        this.connector.execute(deptInfo+deptInfo4);

        this.connector.execute(degreeInfo+degreeInfo1);
        this.connector.execute(degreeInfo+degreeInfo2);
        this.connector.execute(degreeInfo+degreeInfo3);
        this.connector.execute(degreeInfo+degreeInfo4);
        this.connector.execute(degreeInfo+degreeInfo5);
        this.connector.execute(degreeInfo+degreeInfo6);
        this.connector.execute(degreeInfo+degreeInfo7);

        this.connector.execute(courseInfo+courseInfo1);
        this.connector.execute(courseInfo+courseInfo2);
        this.connector.execute(courseInfo+courseInfo3);
        this.connector.execute(courseInfo+courseInfo4);
        this.connector.execute(courseInfo+courseInfo5);
        this.connector.execute(courseInfo+courseInfo6);
        this.connector.execute(courseInfo+courseInfo7);

        this.connector.execute(regInfo+regInfo1);
        this.connector.execute(regInfo+regInfo2);
        this.connector.execute(regInfo+regInfo3);
        this.connector.execute(regInfo+regInfo4);
        this.connector.execute(regInfo+regInfo5);
        this.connector.execute(regInfo+regInfo6);
        this.connector.execute(regInfo+regInfo7);

        this.connector.execute(majorInfo+majorInfo1);
        this.connector.execute(majorInfo+majorInfo2);
        this.connector.execute(majorInfo+majorInfo3);
        this.connector.execute(majorInfo+majorInfo4);
        this.connector.execute(majorInfo+majorInfo5);
        this.connector.execute(majorInfo+majorInfo6);
        this.connector.execute(majorInfo+majorInfo7);

        this.connector.execute(minorInfo+minorInfo1);
        this.connector.execute(minorInfo+minorInfo2);
        this.connector.execute(minorInfo+minorInfo3);

        this.logger.info("End inserting process");
    }
}
