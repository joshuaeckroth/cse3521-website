#!/usr/bin/perl

#print "graph G {\n";
#print "overlap=\"false\"\n";

$marker = 65;
while(<>)
{
    if(m/\|.*\|.*\|\s+\d\.\d\d\s+\|/)
    {
        ($start, $end, $distance) = m/\| \w?\s+\| (\w.*?)\s+\| (\w.*?)\s+\|\s+(\d\.\d\d)/;
        #print "\"$start\" -- \"$end\" [label=\"$distance\"];\n";
        print "if(!distances.containsKey(\"$start\")) {\n";
        print "\tdistances.put(\"$start\", new HashMap<String,Double>());\n";
        print "}\n";
        print "if(!distances.containsKey(\"$end\")) {\n";
        print "\tdistances.put(\"$end\", new HashMap<String,Double>());\n";
        print "}\n";
        print "distances.get(\"$start\").put(\"$end\", new Double($distance));\n";
        print "distances.get(\"$end\").put(\"$start\", new Double($distance));\n";
        #print "distances.setdefault(\"$start\", {})\n";
        #print "distances.setdefault(\"$end\", {})\n";
        #print "distances[\"$start\"][\"$end\"] = $distance\n";
        #print "distances[\"$end\"][\"$start\"] = $distance\n";
    }

    if(m/\|.*\|\s+-\d\d\.\d{5}\s+\|\s+\d\d\.\d{5}\s+\|/)
    {
        ($start, $lon, $lat) = m/\| (\w.*?)\s+\|\s+(-\d\d\.\d{5})\s+\|\s+(\d\d\.\d{5})\s+\|/;
        print "lon.put(\"$start\", new Double($lon));\n";
        print "lat.put(\"$start\", new Double($lat));\n";
        #print "lonlat[\"$start\"] = ($lon, $lat)\n";
        #print "((\"$lat,$lon\") . (:label ?".chr($marker).")) ;; $start\n";
        $marker++;
    }

}

#print "}\n";
