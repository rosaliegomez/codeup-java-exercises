

public class ServerNameGenerator {


    public static String[] nouns = {
            "boat",
            "chicken",
            "instructor",
            "lamp",
            "dog",
            "swamp",
            "car",
            "poet",
            "hula hoop",
            "chair"
    };
    public static String[] adjectives = {
            "cute",
            "happy",
            "irritated",
            "cold",
            "sweaty",
            "ugly",
            "short",
            "hostile",
            "tall",
            "blue"
    };

    public static String getRandom(String[] words) {
        int i = (int) Math.floor(Math.random() * 10);
        return words[i];
    }

    public static void main(String[] args) {


        System.out.println("Here is your server name: " + getRandom(adjectives) + "-" + getRandom(nouns));

    }


}

