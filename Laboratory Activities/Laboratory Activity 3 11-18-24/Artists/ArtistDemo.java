public class ArtistDemo {
    public static void main(String[] args) {
        Artist artist = new Artist(" Taylor Swift", "American", 34, "Music");
        artist.displayInfo();
        System.out.println();
        
        Singer singer = new Singer("Elvis Presley", "American", 42, "Music", Genre.CLASSICAL);
        singer.displayInfo();
        System.out.println();
        
        Painter painter = new Painter("Claude Monet", "French", 86, "Painting", Medium.WATERCOLOR);
        painter.displayInfo();
        System.out.println();
        
        Writer writer = new Writer("Jane Austen", "British", 41, "Writing", WritingStyle.FICTION);
        writer.displayInfo();
        System.out.println();
        
        Dancer dancer = new Dancer("Anna Pavlova", "Russian", 49, "Dancing", DanceStyle.BALLET);
        dancer.displayInfo();
    }
}
