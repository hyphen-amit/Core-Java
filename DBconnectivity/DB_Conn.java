package DBconnectivity;

import java.sql.*;
public class DB_Conn {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cnn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employee","root","");// password is blank because we are using xampp mysql
            Statement st=cnn.createStatement();
//            String insert="INSERT INTO emp_data VALUES(11, 'Morgan', 'Stark','Developer', 23, 60000, 'New York')";
            ResultSet rs=st.executeQuery("SELECT * FROM emp_data");
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+ rs.getString(2)+" "+ rs.getString(3)+" "+rs.getString(4)+" "
                        +rs.getInt(5)+" "+rs.getInt(6)+" "+rs.getString(7) );
               // cnn.close();
            }
//            st.execute(insert);
//            cnn.close();
//            System.out.println("Query executed...");
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
