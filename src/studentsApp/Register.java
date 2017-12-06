package studentsApp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Register extends HttpServlet {
        protected void processRequest(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = response.getWriter()) {

                int student_id = Integer.parseInt(request.getParameter("student_id"));
                String f_name = request.getParameter("f_name");
                String l_name = request.getParameter("l_name");
                String gender = request.getParameter("gender");
                String program = request.getParameter("program");

                crudOps co = new crudOps();
                co.setStudent_id(student_id);
                co.setFirst_name(f_name);
                co.setLast_name(l_name);
                co.setGender(gender);
                co.setProgram(program);
                boolean success =co.save();
                if(success){
                    out.println("Record saved");
                }else{
                    out.println("Record not saved! There was an error!");
                }
            }
        }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
}
