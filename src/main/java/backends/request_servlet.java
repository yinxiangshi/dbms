package backends;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;

public class request_servlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ConnectDB connector = new ConnectDB();
        connector.buildConnection();
        String button = request.getParameter("button");

        if ("createTable".equals(button)) {
            CreateTables creator =  new CreateTables(connector);
            creator.construct();
            connector.disconnection();
            request.getRequestDispatcher("/CreateTablesResult.jsp").forward(request, response);
        } else if ("insertRecords".equals(button)){
            InsertRecords insertor = new InsertRecords(connector);
            insertor.Insert();
            connector.disconnection();
            request.getRequestDispatcher("/InsertResult.jsp").forward(request, response);
        } else if ("modify".equals(button)){
            connector.execute("update students set name = 'Scott' where ssn = 746897816;");
            connector.disconnection();
            request.getRequestDispatcher("/ModifyResults.jsp").forward(request, response);
        } else if ("egg".equals(button)){
            request.getRequestDispatcher("/WEB-INF/Easteregg.jsp").forward(request, response);
        }
    }
}
