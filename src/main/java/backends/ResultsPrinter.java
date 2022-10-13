package backends;

import java.io.IOException;
import java.sql.*;
import java.util.*;
import javax.servlet.jsp.JspWriter;

public class ResultsPrinter {
    public static void printResultSet(ResultSet rs, JspWriter mount) throws SQLException, IOException {
        ResultSetMetaData resultSetMetaData = rs.getMetaData();
        int ColumnCount = resultSetMetaData.getColumnCount();
        int[] columnMaxLengths = new int[ColumnCount];
        ArrayList<String[]> results = new ArrayList<>();
        while (rs.next()) {
            String[] columnStr = new String[ColumnCount];
            for (int i = 0; i < ColumnCount; i++) {
                columnStr[i] = rs.getString(i + 1);
                columnMaxLengths[i] = Math.max(columnMaxLengths[i], (columnStr[i] == null) ? 0 : columnStr[i].length());
            }
            results.add(columnStr);
        }
        printSeparator(columnMaxLengths, mount);
        printColumnName(resultSetMetaData, columnMaxLengths, mount);
        printSeparator(columnMaxLengths, mount);
        Iterator<String[]> iterator = results.iterator();
        String[] columnStr;
        while (iterator.hasNext()) {
            columnStr = iterator.next();
            for (int i = 0; i < ColumnCount; i++) {
                mount.println("| "+columnStr[i]);
            }
            mount.print(" |");
            mount.print("<br>");
        }
        printSeparator(columnMaxLengths, mount);
    }

    private static void printColumnName(ResultSetMetaData resultSetMetaData, int[] columnMaxLengths, JspWriter mount) throws SQLException, IOException {
        int columnCount = resultSetMetaData.getColumnCount();
        for (int i = 0; i < columnCount; i++) {
            mount.print("| "+resultSetMetaData.getColumnName(i + 1));
        }
        mount.print(" |");
        mount.print("<br>");
    }
    private static void printSeparator(int[] columnMaxLengths, JspWriter mount) throws IOException {
        for (int columnMaxLength : columnMaxLengths) {
            mount.print("+");
            for (int j = 0; j < columnMaxLength; j++) {
                mount.print("-");
            }
        }
        mount.println("+");
        mount.print("<br>");
    }
}

