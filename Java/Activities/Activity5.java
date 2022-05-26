package activities;

public class Activity5 {

    public static void main(String[] args) {
        String title = "Hitler";

        Book newNovel = new MyBook();

        newNovel.setTitle(title);

        System.out.println("Book title is : "+newNovel.getTitle());
    }
}
