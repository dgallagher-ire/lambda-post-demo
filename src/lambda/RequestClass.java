package lambda;

public class RequestClass {

	private String action;
	private String bucketName;
	private Boolean live;
	private Integer files;
	private Integer batch;
	private String redShift;
	
	public RequestClass(){
		
	}
	
	public final String toString() {
		return 
				this.getAction() + ":" + 
				this.getBucketName() + ":" + 
				this.getLive() + ":" + 
				this.getFiles() + ":" +
				this.getBatch() + ":" +
				this.getRedShift();
	}
	
	public final String getAction() {
		return action;
	}
	public final void setAction(String action) {
		this.action = action;
	}
	public final String getBucketName() {
		return bucketName;
	}
	public final void setBucketName(String bucketName) {
		this.bucketName = bucketName;
	}
	public final Boolean getLive() {
		return live;
	}
	public final void setLive(Boolean live) {
		this.live = live;
	}
	public final Integer getFiles() {
		return files;
	}
	public final void setFiles(Integer files) {
		this.files = files;
	}
	public final Integer getBatch() {
		return batch;
	}
	public final void setBatch(Integer batch) {
		this.batch = batch;
	}
	public final String getRedShift() {
		return redShift;
	}
	public final void setRedShift(String redShift) {
		this.redShift = redShift;
	}
	
	
}
