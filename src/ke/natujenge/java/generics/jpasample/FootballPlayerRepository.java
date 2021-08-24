package ke.natujenge.java.generics.jpasample;

import ke.natujenge.java.generics.jpasample.dto.FootballPlayer;

import java.util.HashMap;
import java.util.Map;

public class FootballPlayerRepository {
    private final Map<Integer, FootballPlayer> map = new HashMap<>();

    public void save(Integer jerseyNumber, FootballPlayer footballPlayer){
        map.put(jerseyNumber, footballPlayer);
    }
}
