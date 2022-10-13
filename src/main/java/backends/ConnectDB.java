package backends;
import java.sql.*;

public class ConnectDB {
    private Connection conn = null;
    private Statement state = null;

    public void buildConnection() {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/UnivDB?useUnicode=true&characterEncoding=utf-8";
        String user = "";
        String password = "";
        try{
            Class.forName(driver);
            conn=DriverManager.getConnection(url,user,password);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    public int execute(String sqlSentence){
        try {
            if(state==null)
                state=conn.createStatement();
            return state.executeUpdate(sqlSentence);
        } catch (Exception ex) {
            ex.printStackTrace();
            return -1;
        }
    }

    public ResultSet query(String sqlSentence){
        try {
            if(state==null)
                state=conn.createStatement();
            return state.executeQuery(sqlSentence);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public void disconnection(){
        if(state!=null){
            try {
                state.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        if(conn!=null){
            try {
                conn.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}

