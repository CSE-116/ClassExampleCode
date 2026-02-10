package topic10_graphs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class MovieGraph {

    private static ArrayList<ArrayList<String>> extractCastLists(String filename){
        ArrayList<ArrayList<String>> allCastLists = new ArrayList<>();
        try {
            for (String line : Files.readAllLines(Paths.get(filename))) {
                //Toy Story,Tom Hanks,Tim Allen,Don Rickles
                String[] splits = line.split(",");
                ArrayList<String> castList = new ArrayList<>(Arrays.asList(splits));
                castList.remove(0);
                allCastLists.add(castList);
            }
        }catch (IOException exp){}
        return allCastLists;
    }

    public static Graph<String> generateGraph(ArrayList<ArrayList<String>> allCastLists){
        Graph<String> graph = new Graph<>();

        for(ArrayList<String> castList : allCastLists){
            for (int i = 0; i < castList.size(); i++) {
                String member1 = castList.get(i);
                for (int j = i+1; j < castList.size(); j++) {
                    String member2 = castList.get(j);
                    graph.addBidirectionalEdge(member1, member2);
                }
            }
        }

        return graph;
    }


    public static void main(String[] args) {
        String filename = "data/movies.csv";
        Graph<String> graph = generateGraph(extractCastLists(filename));
    }

}
