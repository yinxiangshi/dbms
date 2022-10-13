package backends;

import java.util.logging.*;

public class CreateTables {
    ConnectDB connector = new ConnectDB();
    Logger logger = null;
    private String studentTable = "create table students" +
            "(" +
            "snum integer," +
            "ssn  integer," +
            "name varchar(10)," +
            "gender varchar(1)," +
            "dob datetime," +
            "c_addr varchar(20)," +
            "c_phone varchar(10)," +
            "p_addr varchar(20)," +
            "p_phone varchar(10)," +
            "primary key (ssn)," +
            "UNIQUE (snum)" +
            ");";

    private String deptTable = "create table departments" +
            "(" +
            "code integer,"+
            "name varchar(50),"+
            "phone varchar(10),"+
            "college varchar(20),"+
            "primary key (code),"+
            "UNIQUE (name)"+
            ");";

    private String degreeTable = "create table degrees" +
            "("+
            "name varchar(50),"+
            "level varchar(5),"+
            "department_code integer,"+
            "primary key (name, level),"+
            "foreign key (department_code) references departments(code)"+
            ");";

    private String courseTable = "create table courses"+
            "("+
            "number integer,"+
            "name varchar(50),"+
            "description varchar(50),"+
            "credithours integer,"+
            "level varchar(20),"+
            "department_code integer,"+
            "primary key (number),"+
            "unique (name),"+
            "foreign key (department_code) references departments(code)"+
            ");";

    private String registerTable = "create table register"+
            "("+
            "snum integer,"+
            "course_number integer,"+
            "regtime varchar(20),"+
            "grade integer,"+
            "primary key (snum, course_number),"+
            "foreign key (snum) references students(snum),"+
            "foreign key (course_number) references courses(number)"+
            ");";

    private String majorTable = "create table major"+
            "("+
            "snum integer,"+
            "name varchar(50),"+
            "level varchar(5),"+
            "primary key (snum, name, level),"+
            "foreign key (snum) references students(snum),"+
            "foreign key (name, level) references degrees(name, level)"+
            ");";

    private String minorTable = "create table minor"+
            "("+
            "snum integer,"+
            "name varchar(50),"+
            "level varchar(5),"+
            "primary key (snum, name, level),"+
            "foreign key (snum) references students(snum),"+
            "foreign key (name, level) references degrees(name, level)"+
            ");";

    public CreateTables(ConnectDB connector){
        this.connector = connector;
        this.logger = Logger.getGlobal();
    }

    public void construct(){
        this.logger.info("---Start constructing database---");
        this.connector.execute(studentTable);
        this.logger.severe("---Successful construct students table---");
        this.connector.execute(deptTable);
        this.logger.severe("---Successful construct departments table---");
        this.connector.execute(degreeTable);
        this.logger.severe("---Successful construct degree table---");
        this.connector.execute(courseTable);
        this.logger.severe("---Successful construct courses table---");
        this.connector.execute(registerTable);
        this.logger.severe("---Successful construct register table---");
        this.connector.execute(majorTable);
        this.logger.severe("---Successful construct major table---");
        this.connector.execute(minorTable);
        this.logger.severe("---Successful construct minor table---");
        this.logger.info("---End construction process---");
    }
}
