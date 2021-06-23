import java.sql.*;

public class Jdata {


	public static void main(String[] args) {
		try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://H://ADVANCE JAVA//Eclipse workspace 2//ONLINE//Student.accdb");
            Statement st = con.createStatement();
            System.out.println("Connection Established");
            st.execute("create table Stud_details(USN varchar(10), NAME varchar(30), CLASS varchar(30))");
            System.out.println("Table Created");
            st.executeUpdate("insert into Stud_details values('4AL18CS045','M MAHAMMAD ASIF','6B')");
            st.executeUpdate("insert into Stud_details values('4AL18CS900','KARAN','6C')");
            System.out.println("Records inserted");
            ResultSet rs = st.executeQuery("select * from Stud_details");
            System.out.println("The records in the table Stud_details are : ");
            while(rs.next()){
                String USN = rs.getString("USN");
                String NAME = rs.getString("NAME");
                String CLASS = rs.getString("CLASS");
                System.out.println(USN+ ", " +NAME + ", " +CLASS);
            }
        }
		catch(Exception e){
            System.out.println("Error");
        }

	}

}
