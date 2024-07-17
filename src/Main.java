//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        System.out.println("Задача 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        System.out.println("Задача 3");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println("Задача 6");
        var weightBokser1 = 78.2;
        var weightBokser2 = 82.7;
        var totalWeightBoksers = weightBokser1 + weightBokser2;
        System.out.println("Общая масса двух бойцов " + totalWeightBoksers + " кг.");
        var differenseWight = weightBokser2 - weightBokser1;
        System.out.println("Разница между массами бойцов " + differenseWight + " кг.");
        System.out.println("Задача 7");
        var overLoad = weightBokser2 % weightBokser1;
        System.out.println(overLoad);
        System.out.println("Задача 8");
        var allWorkingTime = 640;
        var workingTime = 8.;
        var mostStaff = allWorkingTime / workingTime;
        System.out.println("Всего работников в компании- " + mostStaff + " человек");
        mostStaff = mostStaff + 94;
        workingTime = allWorkingTime / mostStaff;
        System.out.println("Если в компании работает " + mostStaff +" человека, то всего "+workingTime + " часов работы может быть поделено между сотрудниками");


    }
}