package youtubesubscrption;

public class Subscription {
	
	private String emailAddress;
	private String name;
	private String subscription;
	public Subscription(String emailAddress, String name, String subscription) {
		super();
		this.emailAddress = emailAddress;
		this.name = name;
		this.subscription = subscription;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubscription() {
		return subscription;
	}
	public void setSubscription(String subscription) {
		this.subscription = subscription;
	}
	
	
	
	
	
	

}
