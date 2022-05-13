public class TVShow {
    private String name;
    private String genre;
    private int numOfEpisodes;
  
    public TVShow(String name, int numOfEpisodes, String genre) {
      this.name = name;
      this.genre = genre;
      this.numOfEpisodes = numOfEpisodes;
    }

    public TVShow(String name, int numOfEpisodes) {
      this.name = name;
      this.numOfEpisodes = numOfEpisodes;
    }

    public TVShow(String name, String genre) {
      this.name = name;
      this.genre = genre;
    }

    public TVShow(int numOfEpisodes, String genre) {
      this.genre = genre;
      this.numOfEpisodes = numOfEpisodes;
    }

    public TVShow(int numOfEpisodes) {
      this.genre = genre;
      this.numOfEpisodes = numOfEpisodes;
    }

    public TVShow(String genre) {
      this.genre = genre;
      this.numOfEpisodes = numOfEpisodes;
    }

    public TVShow() {}
  
    public String getName() {
      return name;
    }
  
    public String getGenre() {
      return genre;
    }

    public int getNumOfEpisodes() {
      return numOfEpisodes;
    }
  
    @Override
    public String toString() {
        return "The name of the show is " + getName() + " with " + getNumOfEpisodes() + " episodes. The genre is " + getGenre();
    }
  }
