public class Main {
    public static void main(String[] args) {
        var dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        double dogs = 12;
        dogs = dogs -3;
        System.out.println(dogs);
        cat = cat -1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var oneWeight = 78.2;
        var twoWeight = 82.7;
        var sumWeight = oneWeight + twoWeight;
        System.out.println("Общий вес двух бойцов составляет  " + sumWeight + " кг.");
        var minWeight = twoWeight - oneWeight;
        System.out.println("Разница веса между двумя бойцами составляет " + minWeight + " кг.");
        var minWeight1 = (twoWeight - oneWeight)%sumWeight;
        System.out.println(minWeight1);

        var allHours = 640;
        var everyHour = 8;
        var crumembers = allHours/everyHour;
        System.out.println("Всего в компании работает " + crumembers + " человек.");
        var allcrumembers = crumembers + 94;
        var hourEveryCrumembers = allHours / allcrumembers;
        System.out.println("Если в компании работает " + allcrumembers + " ,тогда часов между сотрудниками будет " +
                hourEveryCrumembers + " часа.");







    }
}