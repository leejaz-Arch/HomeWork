//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
var dog = 8.0;
var cat = 3.6;
var paper = 763789;
System.out.println("dog = " + dog);
System.out.println("cat = " + cat);
System.out.println("paper = " + paper);

dog = dog + 4;
System.out.println("dog = "+ dog);
cat = cat +4;
System.out.println("cat =" + cat);
paper = paper + 4;
System.out.println("paper =" + paper);

dog = dog - 3.5;
System.out.println("dog =" + dog);
cat = cat - 1.6;
System.out.println("cat =" + cat);
paper = paper - 7639;
System.out.println("paper =" + paper);

var friend = 19;
System.out.println("friend =" + friend);
friend = friend + 2;
System.out.println("friend =" + friend);
friend = friend / 7;
System.out.println("friend =" + friend);

var frog = 3.5;
System.out.println("frog =" + frog);
frog = frog * 10;
System.out.println("frog =" + frog);
frog = frog / 3.5;
System.out.println("frog =" + frog);
frog = frog + 4;
System.out.println("frog =" + frog);

var firstBoxerWeight = 78.2;
var secondBoxerWeight = 82.7;
var totalWeight = firstBoxerWeight + secondBoxerWeight;
System.out.println("общая масса двух боксеров =" + totalWeight + " кг");
var weightDifference = secondBoxerWeight - firstBoxerWeight;
System.out.println("Разница в весе между двумя боксерами =" + weightDifference + " кг");
weightDifference = secondBoxerWeight % firstBoxerWeight;
System.out.println("Остаток деления =" + weightDifference + " кг");

var totalHours = 640;
var oneEmployeeHours = 8;
var totalEmployee = totalHours / oneEmployeeHours;
System.out.println("Всего работников в компании " + totalEmployee + " человек");
totalEmployee = totalEmployee + 94;
oneEmployeeHours = totalHours / totalEmployee;
System.out.println("Если в компании работает " + totalEmployee + " человек, то всего " + oneEmployeeHours + " часов работы может быть поделено между сотрудниками");


    }
}