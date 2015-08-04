package ba.bitcamp.recap.exercises;

public class Message {

	private String name;
	private String timestamp;
	private String message;

	public Message() {

		name = null;
		timestamp = null;
		message = null;
	}

	public Message(String name, String timestam, String message) {
		super();
		this.name = name;
		this.timestamp = timestam;
		this.message = message;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTimestam() {
		return timestamp;
	}

	public void setTimestam(String timestam) {
		this.timestamp = timestam;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
