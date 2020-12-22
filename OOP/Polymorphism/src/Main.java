
class Movie {
    private String name;

    public Movie(String name){
        this.name = name;
    }

    public String plot() {
        return  "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie{

    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "A shark attack";
    }

}

class Limitless extends Movie {
    public Limitless() {
        super("Limitless");
    }

    @Override
    public String plot() {
        return "Unlocking the brain";
    }
}

class MazeRunner extends Movie {

    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Escaping the ultimate maze";
    }
}

class StarWars extends Movie {

    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Star Wars. enough said.";
    }
}

class ForgettableMovie extends Movie {

    public ForgettableMovie() {
        super("ForgettableMovie");
    }
}

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie No: " + i + " - " +
                                movie.getName() + "\n" + "Plot: " +
                                movie.plot() + "\n");

        }
    }

    public static Movie randomMovie() {
        int randomNo = (int) (Math.random()*5) +1;
        System.out.println("Random number is " + randomNo);
        switch (randomNo) {
            case 1:
                return new Jaws();
            case 2:
                return new Limitless();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new ForgettableMovie();
        }

        return null;

    }

}
