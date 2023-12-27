
public class ReservationDetails {

	
	private String trainNumber;
	private String trainName;
	private int PNRNumber;

	public ReservationDetails(String trainNumber, String trainName, int pNRNumber) {
		super();
		this.trainNumber = trainNumber;
		this.trainName = trainName;
		PNRNumber = pNRNumber;
	}
	public String getTrainNumber() {
		return trainNumber;
	}
	public void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public int getPNRNumber() {
		return PNRNumber;
	}
	public void setPNRNumber(int pNRNumber) {
		PNRNumber = pNRNumber;
	}
	@Override
	public String toString() {
		return "ReservationDetails [trainNumber=" + trainNumber + ", trainName=" + trainName + ", PNRNumber="
				+ PNRNumber + "]";
	}
	
	
	
}
