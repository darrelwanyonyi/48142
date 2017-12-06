package jdbcCon;

import java.sql.*;
import java.util.*;


public class CrudOperations {
    private int student_id;
    private String first_name, last_name, gender, program;
    //private Date admission_date;

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    //GETTERS

    public int getStudent_id() {
        return student_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getGender() {
        return gender;
    }

    public String getProgram() {
        return program;
    }
    //METHODS

    public int ProcessGender(String g) {
        if (g.equalsIgnoreCase("Male")) {
            return 1;
        }
        return 0;
    }

    public boolean saveRecord() {
        PreparedStatement pst = null;
        Connection con = new dbConnector().connector();
        try {
            pst = con.prepareStatement("INSERT INTO student_details(student_id, first_name, last_name, gender, degree_program) VALUES (?,?,?,?,?)");
            pst.setInt(1, getStudent_id());
            pst.setString(2, getFirst_name());
            pst.setString(3, getLast_name());
            pst.setInt(4, ProcessGender(getGender()));
            pst.setString(5, getProgram());
            pst.executeUpdate();

            return true;
        }
        catch (SQLException ex) {
            System.out.println("Error" + ex.getMessage());
        }
        return false;
    }

    public boolean removeRecord() {
        return true;
    }

    public boolean updateRecord() {
        return true;
    }

}


