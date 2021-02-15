package cscie88a.week2;

public class Toy {

	private boolean isSqueaky = true;
	private boolean isBouncy = true;
	private boolean hasFeathers = false;
	
	public Toy() {}
	
	public Toy(boolean isSqueaky, boolean isBouncy, boolean hasFeathers) {
		super();
		this.isSqueaky = isSqueaky;
		this.isBouncy = isBouncy;
		this.hasFeathers = hasFeathers;
	}

	public static String doFunStuff() {
		return "I'm doing fun stuff!";
	}

	@Override
	public String toString() {
		return "Toy [isSqueaky=" + isSqueaky + ", isBouncy=" + isBouncy + ", hasFeathers=" + hasFeathers + "]";
	}

	public boolean isSqueaky() {
		return isSqueaky;
	}

	public void setSqueaky(boolean isSqueaky) {
		this.isSqueaky = isSqueaky;
	}

	public boolean isBouncy() {
		return isBouncy;
	}

	public void setBouncy(boolean isBouncy) {
		this.isBouncy = isBouncy;
	}

	public boolean isHasFeathers() {
		return hasFeathers;
	}

	public void setHasFeathers(boolean hasFeathers) {
		this.hasFeathers = hasFeathers;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (hasFeathers ? 1231 : 1237);
		result = prime * result + (isBouncy ? 1231 : 1237);
		result = prime * result + (isSqueaky ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Toy other = (Toy) obj;
		if (hasFeathers != other.hasFeathers)
			return false;
		if (isBouncy != other.isBouncy)
			return false;
		if (isSqueaky != other.isSqueaky)
			return false;
		return true;
	}
	
}
