package ke.natujenge.java.generics.jpasample.dto;

public class FootballPlayer {
    private Integer jerseyNumber;

    private String details;

    public FootballPlayer(Integer jerseyNumber, String details) {
        this.jerseyNumber = jerseyNumber;
        this.details = details;
    }

    public Integer getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(Integer jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "FootballPlayer{" +
                "jerseyNumber=" + jerseyNumber +
                ", details='" + details + '\'' +
                '}';
    }
}
