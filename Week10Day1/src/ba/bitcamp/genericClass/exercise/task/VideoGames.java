package ba.bitcamp.genericClass.exercise.task;

public class VideoGames extends Application {

	private String genre;
	private String nameOfStudio;
	private Integer numberOfSold;

	public VideoGames(String name, Integer year, Double version, Integer size,
			String genre, String nameOfStudio, Integer numberOfSold) {
		super(name, year, version, size);
		this.genre = genre;
		this.nameOfStudio = nameOfStudio;
		this.numberOfSold = numberOfSold;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getNameOfStudio() {
		return nameOfStudio;
	}

	public void setNameOfStudio(String nameOfStudio) {
		this.nameOfStudio = nameOfStudio;
	}

	public Integer getNumberOfSold() {
		return numberOfSold;
	}

	public void setNumberOfSold(Integer numberOfSold) {
		this.numberOfSold = numberOfSold;
	}

	@Override
	public String toString() {
		return "Video Games genre is: " + genre + ", Studio: " + nameOfStudio
				+ ", Sold of coppy is: " + numberOfSold + "]";
	}

}
