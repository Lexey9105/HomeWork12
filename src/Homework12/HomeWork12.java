package Homework12;

public class HomeWork12 {
    public static void main (String [] args){
        Author venYerofeyev=new Author("Ерофеев", "Венедикт");
        Book mskPetushki=new  Book("Москва-Петушки",venYerofeyev,1970);

        mskPetushki.setPublisher(1988);
        System.out.println("mskPetushki.getpublisher() = " + mskPetushki.getpublisher());

        Author leonAndreyev=new Author("Андреев","Леонид");
        Book judasIscariot=new Book("Иуда Искариот",leonAndreyev,1907);
    }

}
