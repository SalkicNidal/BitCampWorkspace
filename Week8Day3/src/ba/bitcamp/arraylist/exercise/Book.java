package ba.bitcamp.arraylist.exercise;

public class Book {

	private String name;
	private String author;
	private Integer year;

	public Book(String name, String author, Integer year) {
		super();
		this.name = name;
		this.author = author;
		this.year = year;
	}

	public Book(String name, String author) {
		this(name, author, 0);
	}

	public Book(String name) {
		this(name, "", 0);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (year == null) {
			if (other.year != null)
				return false;
		} else if (!year.equals(other.year))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book name is " + name + ", author is " + author
				+ ", year of publish " + year + "]";
	}

}
