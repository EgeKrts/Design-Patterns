public class Test {

    public static void main(String[] args){

        Component jazz = new SongGroup("Jazz", " is a music genre that originated in the African-American communities of New Orleans, Louisiana, United States, \nin the late 19th and early 20th centuries, with its roots in blues and ragtime.");

        Component indieRock = new SongGroup("\nIndie rock", "is a genre of rock music that originated in the United States and United Kingdom in the 1970s.");

        Component rhythmAndBlues = new SongGroup("\nR&B", "[Rhythm and blues] is a genre of popular music that originated in African-American communities in the 1940s.");

        Component everySong = new SongGroup("Song List", "Every Song Available");


        everySong.add(jazz);

        jazz.add(new Song("Take the A Train", "Duke ELlington", 1940));
        jazz.add(new Song("So What ", "Miles Davis", 1959));

        everySong.add(indieRock);

        indieRock.add(new Song("When The Sun Goes Down", "Arctic Monkey", 2006));
        indieRock.add(new Song("Obstacle 1", "Interpol ", 2002));


        everySong.add(rhythmAndBlues);

        rhythmAndBlues.add(new Song("No Diggity", "Blackstreet", 1996));
        rhythmAndBlues.add(new Song("Can't Feel My Face", "The Weeknd", 2015));


        Dj myDJ = new Dj(everySong);

        myDJ.getSongList();

    }
}
