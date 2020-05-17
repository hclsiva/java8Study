package study.json.bean;

public class Mobile {

	private int mobileId;
	private String mobileCompanyName;
	private String osName;
	private int price;
	private String color;
	
	public Mobile() {		
	}

	public int getMobileId() {
		return mobileId;
	}

	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}

	public String getMobileCompanyName() {
		return mobileCompanyName;
	}

	public void setMobileCompanyName(String mobileCompanyName) {
		this.mobileCompanyName = mobileCompanyName;
	}

	public String getOsName() {
		return osName;
	}

	public void setOsName(String osName) {
		this.osName = osName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Mobile [mobileId=");
		builder.append(mobileId);
		builder.append(", mobileCompanyName=");
		builder.append(mobileCompanyName);
		builder.append(", osName=");
		builder.append(osName);
		builder.append(", price=");
		builder.append(price);
		builder.append(", color=");
		builder.append(color);
		builder.append("]");
		return builder.toString();
	}

}
