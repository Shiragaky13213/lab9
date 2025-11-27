
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Character> characters = new ArrayList<>();
        characters.add(new Character("Warrior", 100));
        characters.add(new Character("Mage", 40));
        characters.add(new Character("Archer", 60));
        characters.add(new Character("Rogue", 25));
        characters.add(new Character("Paladin", 80));

        System.out.println("Вывод через for:");
        for (int i = 0; i < characters.size(); i++) {
            System.out.println(characters.get(i));
        }

        System.out.println("\nВывод через for-each:");
        for (Character c : characters) {
            System.out.println(c);
        }


        characters.add(new Character("Healer", 35));

        characters.remove(2);
        characters.removeIf(c -> c.getName().equals("Mage"));

        System.out.println("\nРазмер списка: " + characters.size());

        Character first = characters.get(0);
        System.out.println("Имя первого персонажа: " + first.getName());

        first.setHp(150);

        System.out.println("\nПоиск персонажа с HP < 30:");
        for (Character c : characters) {
            if (c.getHp() < 30) {
                System.out.println("Найден: " + c);
                break;
            }
        }

        System.out.println("\ncontains(): " + characters.contains(first));

        characters.clear();
        System.out.println("Размер после очистки: " + characters.size());
    }
}
