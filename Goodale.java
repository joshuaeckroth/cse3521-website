import java.util.HashMap;

class Goodale
{
    private HashMap<String, HashMap<String, Double>> distances;
    private HashMap<String, Double> lon;
    private HashMap<String, Double> lat;

    public static void main(String [] args)
    {
        Goodale g = new Goodale();
        g.setupMaps();
    }

    public void setupMaps()
    {
        distances = new HashMap<String, HashMap<String, Double>>();

        if(!distances.containsKey("High & Goodale")) {
            distances.put("High & Goodale", new HashMap<String,Double>());
        }
        if(!distances.containsKey("Goodale parking lot")) {
            distances.put("Goodale parking lot", new HashMap<String,Double>());
        }
        distances.get("High & Goodale").put("Goodale parking lot", new Double(0.22));
        distances.get("Goodale parking lot").put("High & Goodale", new Double(0.22));
        if(!distances.containsKey("High & 5th")) {
            distances.put("High & 5th", new HashMap<String,Double>());
        }
        if(!distances.containsKey("High & Goodale")) {
            distances.put("High & Goodale", new HashMap<String,Double>());
        }
        distances.get("High & 5th").put("High & Goodale", new Double(0.93));
        distances.get("High & Goodale").put("High & 5th", new Double(0.93));
        if(!distances.containsKey("I-71 5th offramp")) {
            distances.put("I-71 5th offramp", new HashMap<String,Double>());
        }
        if(!distances.containsKey("High & 5th")) {
            distances.put("High & 5th", new HashMap<String,Double>());
        }
        distances.get("I-71 5th offramp").put("High & 5th", new Double(1.07));
        distances.get("High & 5th").put("I-71 5th offramp", new Double(1.07));
        if(!distances.containsKey("I-71 11th offramp")) {
            distances.put("I-71 11th offramp", new HashMap<String,Double>());
        }
        if(!distances.containsKey("I-71 5th offramp")) {
            distances.put("I-71 5th offramp", new HashMap<String,Double>());
        }
        distances.get("I-71 11th offramp").put("I-71 5th offramp", new Double(0.52));
        distances.get("I-71 5th offramp").put("I-71 11th offramp", new Double(0.52));
        if(!distances.containsKey("I-71 17th offramp")) {
            distances.put("I-71 17th offramp", new HashMap<String,Double>());
        }
        if(!distances.containsKey("I-71 11th offramp")) {
            distances.put("I-71 11th offramp", new HashMap<String,Double>());
        }
        distances.get("I-71 17th offramp").put("I-71 11th offramp", new Double(0.47));
        distances.get("I-71 11th offramp").put("I-71 17th offramp", new Double(0.47));
        if(!distances.containsKey("US-23 & 17th")) {
            distances.put("US-23 & 17th", new HashMap<String,Double>());
        }
        if(!distances.containsKey("I-71 17th offramp")) {
            distances.put("I-71 17th offramp", new HashMap<String,Double>());
        }
        distances.get("US-23 & 17th").put("I-71 17th offramp", new Double(0.75));
        distances.get("I-71 17th offramp").put("US-23 & 17th", new Double(0.75));
        if(!distances.containsKey("US-23 & 15th")) {
            distances.put("US-23 & 15th", new HashMap<String,Double>());
        }
        if(!distances.containsKey("US-23 & 17th")) {
            distances.put("US-23 & 17th", new HashMap<String,Double>());
        }
        distances.get("US-23 & 15th").put("US-23 & 17th", new Double(0.12));
        distances.get("US-23 & 17th").put("US-23 & 15th", new Double(0.12));
        if(!distances.containsKey("High & 15th")) {
            distances.put("High & 15th", new HashMap<String,Double>());
        }
        if(!distances.containsKey("US-23 & 15th")) {
            distances.put("US-23 & 15th", new HashMap<String,Double>());
        }
        distances.get("High & 15th").put("US-23 & 15th", new Double(0.49));
        distances.get("US-23 & 15th").put("High & 15th", new Double(0.49));
        if(!distances.containsKey("High & Woodruff")) {
            distances.put("High & Woodruff", new HashMap<String,Double>());
        }
        if(!distances.containsKey("High & 15th")) {
            distances.put("High & 15th", new HashMap<String,Double>());
        }
        distances.get("High & Woodruff").put("High & 15th", new Double(0.26));
        distances.get("High & 15th").put("High & Woodruff", new Double(0.26));
        if(!distances.containsKey("Woodruff & Tuttle")) {
            distances.put("Woodruff & Tuttle", new HashMap<String,Double>());
        }
        if(!distances.containsKey("High & Woodruff")) {
            distances.put("High & Woodruff", new HashMap<String,Double>());
        }
        distances.get("Woodruff & Tuttle").put("High & Woodruff", new Double(0.46));
        distances.get("High & Woodruff").put("Woodruff & Tuttle", new Double(0.46));
        if(!distances.containsKey("Lane & Tuttle")) {
            distances.put("Lane & Tuttle", new HashMap<String,Double>());
        }
        if(!distances.containsKey("Woodruff & Tuttle")) {
            distances.put("Woodruff & Tuttle", new HashMap<String,Double>());
        }
        distances.get("Lane & Tuttle").put("Woodruff & Tuttle", new Double(0.17));
        distances.get("Woodruff & Tuttle").put("Lane & Tuttle", new Double(0.17));
        if(!distances.containsKey("SR-315 & Lane")) {
            distances.put("SR-315 & Lane", new HashMap<String,Double>());
        }
        if(!distances.containsKey("Lane & Tuttle")) {
            distances.put("Lane & Tuttle", new HashMap<String,Double>());
        }
        distances.get("SR-315 & Lane").put("Lane & Tuttle", new Double(0.74));
        distances.get("Lane & Tuttle").put("SR-315 & Lane", new Double(0.74));
        if(!distances.containsKey("SR-315 I-670 offramp")) {
            distances.put("SR-315 I-670 offramp", new HashMap<String,Double>());
        }
        if(!distances.containsKey("SR-315 & Lane")) {
            distances.put("SR-315 & Lane", new HashMap<String,Double>());
        }
        distances.get("SR-315 I-670 offramp").put("SR-315 & Lane", new Double(2.05));
        distances.get("SR-315 & Lane").put("SR-315 I-670 offramp", new Double(2.05));
        if(!distances.containsKey("Park & Vine")) {
            distances.put("Park & Vine", new HashMap<String,Double>());
        }
        if(!distances.containsKey("SR-315 I-670 offramp")) {
            distances.put("SR-315 I-670 offramp", new HashMap<String,Double>());
        }
        distances.get("Park & Vine").put("SR-315 I-670 offramp", new Double(0.99));
        distances.get("SR-315 I-670 offramp").put("Park & Vine", new Double(0.99));
        if(!distances.containsKey("Park & Goodale")) {
            distances.put("Park & Goodale", new HashMap<String,Double>());
        }
        if(!distances.containsKey("Park & Vine")) {
            distances.put("Park & Vine", new HashMap<String,Double>());
        }
        distances.get("Park & Goodale").put("Park & Vine", new Double(0.15));
        distances.get("Park & Vine").put("Park & Goodale", new Double(0.15));
        if(!distances.containsKey("Goodale parking lot")) {
            distances.put("Goodale parking lot", new HashMap<String,Double>());
        }
        if(!distances.containsKey("Park & Goodale")) {
            distances.put("Park & Goodale", new HashMap<String,Double>());
        }
        distances.get("Goodale parking lot").put("Park & Goodale", new Double(0.13));
        distances.get("Park & Goodale").put("Goodale parking lot", new Double(0.13));
        if(!distances.containsKey("US-23 & Goodale")) {
            distances.put("US-23 & Goodale", new HashMap<String,Double>());
        }
        if(!distances.containsKey("US-23 & 15th")) {
            distances.put("US-23 & 15th", new HashMap<String,Double>());
        }
        distances.get("US-23 & Goodale").put("US-23 & 15th", new Double(1.76));
        distances.get("US-23 & 15th").put("US-23 & Goodale", new Double(1.76));
        if(!distances.containsKey("SR-315 & King")) {
            distances.put("SR-315 & King", new HashMap<String,Double>());
        }
        if(!distances.containsKey("SR-315 & Lane")) {
            distances.put("SR-315 & Lane", new HashMap<String,Double>());
        }
        distances.get("SR-315 & King").put("SR-315 & Lane", new Double(1.10));
        distances.get("SR-315 & Lane").put("SR-315 & King", new Double(1.10));
        if(!distances.containsKey("High & King")) {
            distances.put("High & King", new HashMap<String,Double>());
        }
        if(!distances.containsKey("SR-315 & King")) {
            distances.put("SR-315 & King", new HashMap<String,Double>());
        }
        distances.get("High & King").put("SR-315 & King", new Double(1.02));
        distances.get("SR-315 & King").put("High & King", new Double(1.02));
        if(!distances.containsKey("High & 11th")) {
            distances.put("High & 11th", new HashMap<String,Double>());
        }
        if(!distances.containsKey("I-71 11th offramp")) {
            distances.put("I-71 11th offramp", new HashMap<String,Double>());
        }
        distances.get("High & 11th").put("I-71 11th offramp", new Double(1.15));
        distances.get("I-71 11th offramp").put("High & 11th", new Double(1.15));
        if(!distances.containsKey("US-23 & Goodale")) {
            distances.put("US-23 & Goodale", new HashMap<String,Double>());
        }
        if(!distances.containsKey("Goodale parking lot")) {
            distances.put("Goodale parking lot", new HashMap<String,Double>());
        }
        distances.get("US-23 & Goodale").put("Goodale parking lot", new Double(0.41));
        distances.get("Goodale parking lot").put("US-23 & Goodale", new Double(0.41));
        if(!distances.containsKey("High & 15th")) {
            distances.put("High & 15th", new HashMap<String,Double>());
        }
        if(!distances.containsKey("High & 11th")) {
            distances.put("High & 11th", new HashMap<String,Double>());
        }
        distances.get("High & 15th").put("High & 11th", new Double(0.37));
        distances.get("High & 11th").put("High & 15th", new Double(0.37));
        if(!distances.containsKey("High & 11th")) {
            distances.put("High & 11th", new HashMap<String,Double>());
        }
        if(!distances.containsKey("High & King")) {
            distances.put("High & King", new HashMap<String,Double>());
        }
        distances.get("High & 11th").put("High & King", new Double(0.31));
        distances.get("High & King").put("High & 11th", new Double(0.31));
        if(!distances.containsKey("High & King")) {
            distances.put("High & King", new HashMap<String,Double>());
        }
        if(!distances.containsKey("High & 5th")) {
            distances.put("High & 5th", new HashMap<String,Double>());
        }
        distances.get("High & King").put("High & 5th", new Double(0.21));
        distances.get("High & 5th").put("High & King", new Double(0.21));


        lon = new HashMap<String, Double>();
        lat = new HashMap<String, Double>();

        lon.put("High & Goodale", new Double(-83.00286));
        lat.put("High & Goodale", new Double(39.97384));
        lon.put("High & 5th", new Double(-83.00551));
        lat.put("High & 5th", new Double(39.98710));
        lon.put("I-71 5th offramp", new Double(-82.98526));
        lat.put("I-71 5th offramp", new Double(39.98631));
        lon.put("I-71 11th offramp", new Double(-82.98519));
        lat.put("I-71 11th offramp", new Double(39.99394));
        lon.put("I-71 17th offramp", new Double(-82.98443));
        lat.put("I-71 17th offramp", new Double(40.00072));
        lon.put("US-23 & 17th", new Double(-82.99865));
        lat.put("US-23 & 17th", new Double(40.00133));
        lon.put("US-23 & 15th", new Double(-83.00118));
        lat.put("US-23 & 15th", new Double(39.99973));
        lon.put("High & 15th", new Double(-83.00807));
        lat.put("High & 15th", new Double(40.00007));
        lon.put("High & Woodruff", new Double(-83.00888));
        lat.put("High & Woodruff", new Double(40.00409));
        lon.put("Woodruff & Tuttle", new Double(-83.01748));
        lat.put("Woodruff & Tuttle", new Double(40.00400));
        lon.put("Lane & Tuttle", new Double(-83.01683));
        lat.put("Lane & Tuttle", new Double(40.00631));
        lon.put("SR-315 & Lane", new Double(-83.03085));
        lat.put("SR-315 & Lane", new Double(40.00646));
        lon.put("SR-315 I-670 offramp", new Double(-83.02120));
        lat.put("SR-315 I-670 offramp", new Double(39.97749));
        lon.put("Park & Vine", new Double(-83.00469));
        lat.put("Park & Vine", new Double(39.97147));
        lon.put("Park & Goodale", new Double(-83.00453));
        lat.put("Park & Goodale", new Double(39.97362));
        lon.put("Goodale parking lot", new Double(-83.00649));
        lat.put("Goodale parking lot", new Double(39.97372));
        lon.put("US-23 & Goodale", new Double(-82.99826));
        lat.put("US-23 & Goodale", new Double(39.97423));
        lon.put("SR-315 & King", new Double(-83.02511));
        lat.put("SR-315 & King", new Double(39.99084));
        lon.put("High & King", new Double(-83.00610));
        lat.put("High & King", new Double(39.99019));
        lon.put("High & 11th", new Double(-83.00712));
        lat.put("High & 11th", new Double(39.99528));

        System.out.println(distances.get("Woodruff & Tuttle").get("Lane & Tuttle"));
        Set<String> options = distances.get("Woodruff & Tuttle").keySet();
    }
}








