package prototype_design_pattern;

public class Main {
	public static void main(String[] args) {
		NetworkConnection connection = new NetworkConnection();
		connection.setId("111.222.3.1114");
		connection.loadImortantData();

		System.out.println(connection);

		// we want new object of network connection
		NetworkConnection connection2 = null;
		NetworkConnection connection3 = null;
		try {

			connection2 = (NetworkConnection) connection.clone();
			System.out.println(connection2);
			connection2.getDomains().remove(0);
			connection3 = (NetworkConnection) connection.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println(connection2);
		System.out.println(connection3);

	}
}
