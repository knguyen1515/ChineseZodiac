public class ZodiacSign {
    public int[] years;
    public String personality, luckyNumbers, luckyColors, luckyFlowers, unluckyNumbers, unluckyColors;

    @Override
    public String toString() {
        return super.toString();
    }
}

class Rat extends ZodiacSign {
    public Rat() {
        years = new int[] {1912, 1924, 1936, 1948, 1960, 1972, 1984, 1996, 2008, 2020, 2032};
        personality = "Rats are quick-witted, clever, charming, sharp, and funny. They make good friends" +
                " and are generous and loyal to others.";
        luckyNumbers = "2, 3";
        luckyColors = "blue, gold, green";
        luckyFlowers = "lily, African violet";
        unluckyNumbers = "5, 9";
        unluckyColors = "yellow, brown";
    }

    @Override
    public String toString() {
        return "Rat";
    }
}

class Ox extends ZodiacSign {
    public Ox() {
        years = new int[] {1913, 1925, 1937, 1949, 1961, 1973, 1985, 1997, 2009, 2021, 2033};
        personality = "Oxen are steadfast, goal-oriented, detail-oriented, and hard-working. However, they are also " +
                "stubborn, introverted, and can feel lonely and insecure.";
        luckyNumbers = "1, 4";
        luckyColors = "blue, yellow, green";
        luckyFlowers = "tulip, peach blossoms";
        unluckyNumbers = "3, 6";
        unluckyColors = "red, brown";
    }

    @Override
    public String toString() {
        return "Ox";
    }
}

class Tiger extends ZodiacSign {
    public Tiger() {
        years = new int[] {1914, 1926, 1938, 1950, 1962, 1974, 1986, 1998, 2010, 2022, 2034};
        personality = "Tigers are authoritative and self-possessed, but are also charming, ambitious, " +
                "courageous, and warm-hearted.";
        luckyNumbers = "0, 1, 3, 4";
        luckyColors = "grey, white, blue, purple, orange";
        luckyFlowers = "cineraria";
        unluckyNumbers = "6, 7, 8";
        unluckyColors = "gold, silver, brown, black";
    }

    @Override
    public String toString() {
        return "Tiger";
    }
}

class Rabbit extends ZodiacSign {
    public Rabbit() {
        years = new int[] {1915, 1927, 1939, 1951, 1963, 1975, 1987, 1999, 2011, 2023, 2035};
        personality = "Rabbits are popular, compassionate, sincere, and like to avoid conflict. They enjoy being " +
                "around friends and family and enjoy home life.";
        luckyNumbers = "3, 6, 9";
        luckyColors = "black, pink, purple, blue, red";
        luckyFlowers = "plantain lily, snapdragon, jasmine";
        unluckyNumbers = "1, 7, 8";
        unluckyColors = "brown, yellow, white";
    }

    @Override
    public String toString() {
        return "Rabbit";
    }
}

class Dragon extends ZodiacSign {
    public Dragon() {
        years = new int[] {1916, 1928, 1940, 1952, 1964, 1976, 1988, 2000, 2012, 2024, 2036};
        personality = "Dragons are energetic, warm-hearted, and charismatic. They’re natural leaders, are good" +
                " at giving orders, and competitive.";
        luckyNumbers = "1, 6, 7";
        luckyColors = "yellow";
        luckyFlowers = "bleeding-heart vine, dragon flower";
        unluckyNumbers = "3, 8, 9";
        unluckyColors = "blue, green";
    }

    @Override
    public String toString() {
        return "Dragon";
    }
}

class Snake extends ZodiacSign {
    public Snake() {
        years = new int[] {1917, 1929, 1941, 1953, 1965, 1977, 1989, 2001, 2013, 2025, 2037};
        personality = "Snakes are introverted, generous, charming, good with money, analytical, smart, hard-working," +
                " and intelligent. However, they are insecure and envious.";
        luckyNumbers = "2, 8, 9";
        luckyColors = "red, light yellow, black";
        luckyFlowers = "orchid, cactus";
        unluckyNumbers = "1, 6, 7";
        unluckyColors = "white, golden, brown";
    }

    @Override
    public String toString() {
        return "Snake";
    }
}

class Horse extends ZodiacSign {
    public Horse() {
        years = new int[] {1918, 1930, 1942, 1954, 1966, 1978, 1990, 2002, 2014, 2026, 2038};
        personality = "Horses are energetic, self-reliant, frugal, and impatient. They enjoy traveling, love " +
                "and intimacy.";
        luckyNumbers = "1, 4, 5, 7, 9";
        luckyColors = "gold, yellow, red, blue";
        luckyFlowers = "sunflower, jasmine";
        unluckyNumbers = "2, 3, 6";
        unluckyColors = "pink, brown, white";
    }

    @Override
    public String toString() {
        return "Horse";
    }
}

class Goat extends ZodiacSign {
    public Goat() {
        years = new int[] {1919, 1931, 1943, 1955, 1967, 1979, 1991, 2003, 2015, 2027, 2039};
        personality = "Goats enjoy being alone in their thoughts. They’re creative thinkers and wanderers. " +
                "However, they need lots of attention and are unorganized.";
        luckyNumbers = "2, 3, 4, 7, 9";
        luckyColors = "green, red, purple";
        luckyFlowers = "carnation, primrose";
        unluckyNumbers = "6, 8";
        unluckyColors = "gold, brown";
    }

    @Override
    public String toString() {
        return "Goat";
    }
}

class Monkey extends ZodiacSign {
    public Monkey() {
        years = new int[] {1920, 1932, 1944, 1956, 1968, 1980, 1992, 2004, 2016, 2028, 2040};
        personality = "Monkey are active, energetic, upbeat, and good at listening. However, " +
                "they lack self-control and are impulsive.";
        luckyNumbers = "3, 4, 7, 9";
        luckyColors = "white, blue";
        luckyFlowers = "chrysanthemum, crape myrtle";
        unluckyNumbers = "2, 5, 8";
        unluckyColors = "red, black, grey";
    }

    @Override
    public String toString() {
        return "Monkey";
    }
}

class Rooster extends ZodiacSign {
    public Rooster() {
        years = new int[] {1921, 1933, 1945, 1957, 1969, 1981, 1993, 2005, 2017, 2029, 2041};
        personality = "Roosters are practical, resourceful, analytical, straightforward, trusting, " +
                "honest, and neat.";
        luckyNumbers = "5, 7, 8";
        luckyColors = "gold, brown, yellow";
        luckyFlowers = "gladiola, impatiens, cockscomb";
        unluckyNumbers = "1, 3, 9";
        unluckyColors = "white, green";
    }

    @Override
    public String toString() {
        return "Rooster";
    }
}

class Dog extends ZodiacSign {
    public Dog() {
        years = new int[] {1922, 1934, 1946, 1958, 1970, 1982, 1994, 2006, 2018, 2030, 2042};
        personality = "Dogs are loyal, faithful, and honest. However, they are sensitive, temperamental," +
                " are often guilty of telling white lies.";
        luckyNumbers = "3, 4, 9";
        luckyColors = "green, red, purple";
        luckyFlowers = "rose, oncidium, cymbidium, orchid";
        unluckyNumbers = "1, 6, 7";
        unluckyColors = "blue, white, gold";
    }

    @Override
    public String toString() {
        return "Dog";
    }
}

class Pig extends ZodiacSign {
    public Pig() {
        years = new int[] {1923, 1935, 1947, 1959, 1971, 1983, 1995, 2007, 2019, 2031, 2043};
        personality = "Pigs are very nice, good-mannered, helpful, and intelligent. However, they " +
                "are perfectionists and picky.";
        luckyNumbers = "2, 5, 6, 8";
        luckyColors = "yellow";
        luckyFlowers = "lily";
        unluckyNumbers = "3, 4, 9";
        unluckyColors = "red, blue";
    }

    @Override
    public String toString() {
        return "Pig";
    }
}