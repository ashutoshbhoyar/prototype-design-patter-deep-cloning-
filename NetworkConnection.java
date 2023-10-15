package prototype_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable {
	private String id;
	private String ImpornatntData;
	private List<String> domains = new ArrayList<String>();

	// imp data
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getImpornatntData() {
		return ImpornatntData;
	}

	public void setImpornatntData(String impornatntData) {
		ImpornatntData = impornatntData;
	}

	public List<String> getDomains() {
		return domains;
	}

	public void setDomains(List<String> domains) {
		this.domains = domains;
	}

	public void loadImortantData() {
		this.ImpornatntData = "very very imp data";

		domains.add("web page application");
		domains.add("single page application");
		domains.add("dynamic page application");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		// logic for deep cloning

		NetworkConnection networkConnection = new NetworkConnection();
		networkConnection.setId(this.getId());
		networkConnection.setImpornatntData(this.getImpornatntData());

		for (String d : this.getDomains()) {
			networkConnection.getDomains().add(d);
		}

		return networkConnection;
	}

	@Override
	public String toString() {
		return "NetworkConnection [id=" + id + ", ImpornatntData=" + ImpornatntData + ", domains=" + domains + "]";
	}

}
