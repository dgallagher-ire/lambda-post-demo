package lambda;

public class RequestClass {

	private String action;
	private String Bucket;
	private Boolean Live;
	private Integer Files;
	private Integer Batch;
	private String RedShift;
	
	public RequestClass(){
		
	}
	
	public final String toString() {
		return 
				this.getAction() + ":" + 
				this.getBucket() + ":" + 
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
	public final String getBucket() {
		return Bucket;
	}
	public final void setBucket(String Bucket) {
		this.Bucket = Bucket;
	}
	public final Boolean getLive() {
		return Live;
	}
	public final void setLive(Boolean Live) {
		this.Live = Live;
	}
	public final Integer getFiles() {
		return Files;
	}
	public final void setFiles(Integer Files) {
		this.Files = Files;
	}
	public final Integer getBatch() {
		return Batch;
	}
	public final void setBatch(Integer Batch) {
		this.Batch = Batch;
	}
	public final String getRedShift() {
		return RedShift;
	}
	public final void setRedShift(String RedShift) {
		this.RedShift = RedShift;
	}
	
	
}
