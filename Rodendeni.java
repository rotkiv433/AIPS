/*
Во заводот на статистика се прави ново истражување каде што се открива зависноста на месецот на раѓање со имињата на луѓето родени во тој месец. Ваша задача е за даден месец да ги прикажете сите различни имиња на луѓе родени во тој месец.


Влез: Во првиот ред од влезот е даден бројот на луѓе N (N<=10 000), а во секој нареден ред се дадени името на човекот и датумот на неговото раѓање разделени со празно место. 
Во последниот ред е даден месецот за кој треба да се прикажат сите различни имиња на луѓето родени во тој месец.

Излез: Листа со различни имиња на луѓе родени во дадениот месец. Доколку нема луѓе родени во тој месец да се испечати Nema.
Делумно решение: Задачата се смета за делумно решена доколку се поминати 3 тест примери.
Забелешка: При реализација на задачите не е дозволено да се користат помошни структури како низи или сл. 
На располагање од структурите имате само една хеш структура.

Име на класа (Јава):Rodendeni

Пример:
4 
Ivan 20.7.1976 
Ivan 16.7.1988
Ana 18.7.1966
Ivan 5.6.1988
7

Ivan Ana

*/



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
