public class StudentDet {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdet","root","root");
			Statement statement = connection.createStatement();
//			statement.execute("insert into student values(101, 'manoj', 23)");
//			statement.execute("insert into student values(103, 'neeraj', 24)");
//			statement.execute("insert into student values(104, 'sunil', 25)");
			statement.execute("insert into student values(105, 'madhav', 22)");
			statement.execute("insert into student values(106, 'manu', 26)");
			connection.close();
			System.out.println("data inserted");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
