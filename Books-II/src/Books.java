public class Books {
    private String title;
    private int numOfPages;
    private int publicationYear;
  
    public Books(String title, int numOfPages, int publicationYear) {
      this.title = title;
      this.numOfPages = numOfPages;
      this.publicationYear = publicationYear;
    }

    public Books(String title, int publicationYear) {
      this.title = title;
      this.publicationYear = publicationYear;
    }

    public Books(String title) {
      this.title = title;
    }

    public Books(int publicationYear) {
      this.publicationYear = publicationYear;
    }

    public Books() {}
  
    public String getTitle() {
      return title;
    }
  
    public int getNumOfPages() {
      return numOfPages;
    }

    public int getPublicationYear() {
      return publicationYear;
    }
  
    @Override
    public String toString() {
        return getTitle() + ", " + getNumOfPages() + " pages, " + getPublicationYear();
    }
  }
