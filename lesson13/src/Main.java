public class Main {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("aza", "8-918-12345678");
        phoneBook.add("mat", "8-918-7777777");
        phoneBook.add("boi", "8-918-5555555");
        phoneBook.add("men", "8-918-4444444"); // Добавляем второй номер для "Иванов"

        System.out.println(" aza: " + phoneBook.get("aza"));
        System.out.println(" mat: " + phoneBook.get("mat"));
        System.out.println(" boi: " + phoneBook.get("boi"));
        System.out.println(" men: " + phoneBook.get("men"));
    }
}