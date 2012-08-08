distances = {}
distances.setdefault("High & Goodale", {})
distances.setdefault("Goodale parking lot", {})
distances["High & Goodale"]["Goodale parking lot"] = 0.22
distances["Goodale parking lot"]["High & Goodale"] = 0.22
distances.setdefault("High & 5th", {})
distances.setdefault("High & Goodale", {})
distances["High & 5th"]["High & Goodale"] = 0.93
distances["High & Goodale"]["High & 5th"] = 0.93
distances.setdefault("I-71 5th offramp", {})
distances.setdefault("High & 5th", {})
distances["I-71 5th offramp"]["High & 5th"] = 1.07
distances["High & 5th"]["I-71 5th offramp"] = 1.07
distances.setdefault("I-71 11th offramp", {})
distances.setdefault("I-71 5th offramp", {})
distances["I-71 11th offramp"]["I-71 5th offramp"] = 0.52
distances["I-71 5th offramp"]["I-71 11th offramp"] = 0.52
distances.setdefault("I-71 17th offramp", {})
distances.setdefault("I-71 11th offramp", {})
distances["I-71 17th offramp"]["I-71 11th offramp"] = 0.47
distances["I-71 11th offramp"]["I-71 17th offramp"] = 0.47
distances.setdefault("US-23 & 17th", {})
distances.setdefault("I-71 17th offramp", {})
distances["US-23 & 17th"]["I-71 17th offramp"] = 0.75
distances["I-71 17th offramp"]["US-23 & 17th"] = 0.75
distances.setdefault("US-23 & 15th", {})
distances.setdefault("US-23 & 17th", {})
distances["US-23 & 15th"]["US-23 & 17th"] = 0.12
distances["US-23 & 17th"]["US-23 & 15th"] = 0.12
distances.setdefault("High & 15th", {})
distances.setdefault("US-23 & 15th", {})
distances["High & 15th"]["US-23 & 15th"] = 0.49
distances["US-23 & 15th"]["High & 15th"] = 0.49
distances.setdefault("High & Woodruff", {})
distances.setdefault("High & 15th", {})
distances["High & Woodruff"]["High & 15th"] = 0.26
distances["High & 15th"]["High & Woodruff"] = 0.26
distances.setdefault("Woodruff & Tuttle", {})
distances.setdefault("High & Woodruff", {})
distances["Woodruff & Tuttle"]["High & Woodruff"] = 0.46
distances["High & Woodruff"]["Woodruff & Tuttle"] = 0.46
distances.setdefault("Lane & Tuttle", {})
distances.setdefault("Woodruff & Tuttle", {})
distances["Lane & Tuttle"]["Woodruff & Tuttle"] = 0.17
distances["Woodruff & Tuttle"]["Lane & Tuttle"] = 0.17
distances.setdefault("SR-315 & Lane", {})
distances.setdefault("Lane & Tuttle", {})
distances["SR-315 & Lane"]["Lane & Tuttle"] = 0.74
distances["Lane & Tuttle"]["SR-315 & Lane"] = 0.74
distances.setdefault("SR-315 I-670 offramp", {})
distances.setdefault("SR-315 & Lane", {})
distances["SR-315 I-670 offramp"]["SR-315 & Lane"] = 2.05
distances["SR-315 & Lane"]["SR-315 I-670 offramp"] = 2.05
distances.setdefault("Park & Vine", {})
distances.setdefault("SR-315 I-670 offramp", {})
distances["Park & Vine"]["SR-315 I-670 offramp"] = 0.99
distances["SR-315 I-670 offramp"]["Park & Vine"] = 0.99
distances.setdefault("Park & Goodale", {})
distances.setdefault("Park & Vine", {})
distances["Park & Goodale"]["Park & Vine"] = 0.15
distances["Park & Vine"]["Park & Goodale"] = 0.15
distances.setdefault("Goodale parking lot", {})
distances.setdefault("Park & Goodale", {})
distances["Goodale parking lot"]["Park & Goodale"] = 0.13
distances["Park & Goodale"]["Goodale parking lot"] = 0.13
distances.setdefault("US-23 & Goodale", {})
distances.setdefault("US-23 & 15th", {})
distances["US-23 & Goodale"]["US-23 & 15th"] = 1.76
distances["US-23 & 15th"]["US-23 & Goodale"] = 1.76
distances.setdefault("SR-315 & King", {})
distances.setdefault("SR-315 & Lane", {})
distances["SR-315 & King"]["SR-315 & Lane"] = 1.10
distances["SR-315 & Lane"]["SR-315 & King"] = 1.10
distances.setdefault("High & King", {})
distances.setdefault("SR-315 & King", {})
distances["High & King"]["SR-315 & King"] = 1.02
distances["SR-315 & King"]["High & King"] = 1.02
distances.setdefault("High & 11th", {})
distances.setdefault("I-71 11th offramp", {})
distances["High & 11th"]["I-71 11th offramp"] = 1.15
distances["I-71 11th offramp"]["High & 11th"] = 1.15
distances.setdefault("US-23 & Goodale", {})
distances.setdefault("Goodale parking lot", {})
distances["US-23 & Goodale"]["Goodale parking lot"] = 0.41
distances["Goodale parking lot"]["US-23 & Goodale"] = 0.41
distances.setdefault("High & 15th", {})
distances.setdefault("High & 11th", {})
distances["High & 15th"]["High & 11th"] = 0.37
distances["High & 11th"]["High & 15th"] = 0.37
distances.setdefault("High & 11th", {})
distances.setdefault("High & King", {})
distances["High & 11th"]["High & King"] = 0.31
distances["High & King"]["High & 11th"] = 0.31
distances.setdefault("High & King", {})
distances.setdefault("High & 5th", {})
distances["High & King"]["High & 5th"] = 0.21
distances["High & 5th"]["High & King"] = 0.21

lonlat = {}
lonlat["High & Goodale"] = (-83.00286, 39.97384)
lonlat["High & 5th"] = (-83.00551, 39.98710)
lonlat["I-71 5th offramp"] = (-82.98526, 39.98631)
lonlat["I-71 11th offramp"] = (-82.98519, 39.99394)
lonlat["I-71 17th offramp"] = (-82.98443, 40.00072)
lonlat["US-23 & 17th"] = (-82.99865, 40.00133)
lonlat["US-23 & 15th"] = (-83.00118, 39.99973)
lonlat["High & 15th"] = (-83.00807, 40.00007)
lonlat["High & Woodruff"] = (-83.00888, 40.00409)
lonlat["Woodruff & Tuttle"] = (-83.01748, 40.00400)
lonlat["Lane & Tuttle"] = (-83.01683, 40.00631)
lonlat["SR-315 & Lane"] = (-83.03085, 40.00646)
lonlat["SR-315 I-670 offramp"] = (-83.02120, 39.97749)
lonlat["Park & Vine"] = (-83.00469, 39.97147)
lonlat["Park & Goodale"] = (-83.00453, 39.97362)
lonlat["Goodale parking lot"] = (-83.00649, 39.97372)
lonlat["US-23 & Goodale"] = (-82.99826, 39.97423)
lonlat["SR-315 & King"] = (-83.02511, 39.99084)
lonlat["High & King"] = (-83.00610, 39.99019)
lonlat["High & 11th"] = (-83.00712, 39.99528)

# from: http://www.johndcook.com/python_longitude_latitude.html
def dist(state):
    (long1, lat1) = lonlat[state]
    (long2, lat2) = lonlat["Goodale parking lot"]
    # Convert latitude and longitude to 
    # spherical coordinates in radians.
    degrees_to_radians = math.pi/180.0
        
    # phi = 90 - latitude
    phi1 = (90.0 - lat1)*degrees_to_radians
    phi2 = (90.0 - lat2)*degrees_to_radians
        
    # theta = longitude
    theta1 = long1*degrees_to_radians
    theta2 = long2*degrees_to_radians
        
    # Compute spherical distance from spherical coordinates.
        
    # For two locations in spherical coordinates 
    # (1, theta, phi) and (1, theta, phi)
    # cosine( arc length ) = 
    #    sin phi sin phi' cos(theta-theta') + cos phi cos phi'
    # distance = rho * arc length
    
    cos = (math.sin(phi1)*math.sin(phi2)*math.cos(theta1 - theta2) + 
           math.cos(phi1)*math.cos(phi2))
    arc = math.acos( cos )

    # Remember to multiply arc by the radius of the earth 
    # in your favorite set of units to get length.
    return (arc * 3960.0)

