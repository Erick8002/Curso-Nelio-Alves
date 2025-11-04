package dataHora.getAvailableZoneIds;

import java.time.ZoneId;

public class ZoneIds {
    public static void main(String[] args) {
        for(String s : ZoneId.getAvailableZoneIds()){
            System.out.println(s);
        }
    }
}
