public class Main {
    public static void main(String[] args) {

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = 3.5 * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var boxer1weight = 78.2;
        var boxer2weight = 82.7;
        var sumWeight = boxer1weight + boxer2weight;
        System.out.println(sumWeight);
        var differenceWeight1 = boxer2weight - boxer1weight;
        System.out.println(differenceWeight1);
        var differenceWeight2 = boxer2weight % boxer1weight;
        System.out.println(differenceWeight2);

    var hours = 640;
    var hoursPerWorker = 8;
    var sumWorkers = hours / hoursPerWorker;
    System.out.println("Всего работников в компании - " + sumWorkers + " человек");

    var plusWorkers = 94;
    var hoursPlusWorkers = (sumWorkers + plusWorkers ) * 8;
    System.out.println("Если в компании работает " + (sumWorkers + plusWorkers) + " человек, то всего " + hoursPlusWorkers + " часов работы может быть поделено между сотрудниками");

    System.out.println("Наставник, оцени домашнюю работу, пожалуйста");
    }
}