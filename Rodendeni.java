import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Rodendeni {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashMap<String,String> map = new HashMap<>();
        for(int i=0;i<N;i++) {
            String input = br.readLine();
            String odvoeni[] = input.split(" ");
            String datum[] = odvoeni[1].split("\\.");
            if(!map.containsKey(datum[1])) {
                map.put(datum[1],odvoeni[0]);
                continue;
            }

            String tekoven = map.get(datum[1]);
            if(!tekoven.contains(odvoeni[0])) {
                map.put(datum[1], tekoven+" "+odvoeni[0]);
            }
        }

        String kluc = br.readLine();
        if(map.containsKey(kluc))
            System.out.println(map.get(kluc));
        else
            System.out.println("Nema");
    }
}
