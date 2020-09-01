import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Map {

    // n, s, e, w, ne, se, sw, nw
    public static int WIDTH = 6;
    public static int HEIGHT = 6;

    public static String map[] = new String[WIDTH*HEIGHT+1];

    // { "00000100", "01000000", "00000010", "00100000", "11111111", "00010000", "00001000", "10000000", "00000001" };

    public Map() {

        try {
            readMap();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    };

    public static void readMap() throws Exception {

        int j = 0;

        BufferedReader br = new BufferedReader(new FileReader("map.csv"));
        String line = null;
        try {
            while ((line = br.readLine()) != null) {

                String[] values = line.split(",");

                for (int k = 0; k < WIDTH; k++) {

                    map[j] = values[k];

                    
                    j++;
                }

                
                j = j -1;

                for (int i = 0; i < map.length; i++)
                    System.out.println("MAP " + map[i]);
                
               j++;
            }
            br.close();

        }

        catch (FileNotFoundException e) {
            System.out.println("ERROR: File not found ");
        } catch (Exception e) {
            System.out.println("ERROR: Could not read ");
        }

    }
}