package study.schema.beans;

import java.util.List;

public class MobileList {

	private List<Mobile> mobiles = null;
	
	public MobileList() {
		
	}

	public List<Mobile> getMobiles() {
		return mobiles;
	}

	public void setMobiles(List<Mobile> mobiles) {
		this.mobiles = mobiles;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MobileList [mobiles=");
		builder.append(mobiles);
		builder.append("]");
		return builder.toString();
	}

}
