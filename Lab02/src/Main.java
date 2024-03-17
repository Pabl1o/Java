import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        //zadania z pliku lab_03
        //zadanie 1 pdf lab_03
        System.out.println("Podaj liczbę studentów:");
        int n=inputInt();
        System.out.println("Średnia liczba punktów w grupie: "+zad1lab03(n));
        //zadanie 2 pdf lab_03
        zad2lab03();
        //zadanie 3 pdf lab_03
        System.out.println("Podaj ilość wyrazów ciągu:");
        int iw=inputInt();
        zad3lab03(iw);
        //zadanie 4 pdf lab_03
        System.out.println("Podaj ilość liczb do wylosowania:");
        int ldw=inputInt();
        System.out.println("Suma liczb parzystych wylosowanych: "+zad4lab03(ldw));
        //zadanie 5 pdf lab_03
        System.out.println("Podaj słowo do sprawdzenia:");
        String slowo=inputString();
        zad5lab03(slowo);
         */
        //zadania z pliku lab_04
        //zadanie 1 pdf lab_04
        z1lab04();
        //zadanie 2 pdf lab_04
        int[] num={1,2,3,4,5,6,7,8,9,10};
        int[] nelm={5,2,3,1,8,8,7};
        z2lab04(num,nelm);
        //zadanie 3 pdf lab_04
        z3lab04();
        //zadanie 4 pdf lab_04
        z4lab04();
        //zadanie 5 pdf lab_04
        z5lab04();
        //zadanie 6 pdf lab_04
        z6lab04();
        //zadanie 7 pdf lab_04
        String[] ts1={"Ala","Kot","Pies","Droga"};
        String[] ts2={"Ala","Kot","Pies","Droga"};
        z7lab04(ts1,ts2);
    }

    public static int inputInt(){
        Scanner scanner=new Scanner(System.in);
        int liczba=scanner.nextInt();
        return liczba;
    }

    public static double inputDouble(){
        Scanner scanner=new Scanner(System.in);
        double liczba=scanner.nextDouble();
        return liczba;
    }

    public static String inputString(){
        Scanner scanner=new Scanner(System.in);
        String text=scanner.nextLine();
        return text;
    }

    public static double zad1lab03(int n){
        int i=0;
        double sumapkt=0, a;
        System.out.println("Podaj liczbę punktów:");
        while(i<n){
            a=inputDouble();
            sumapkt=sumapkt+a;
            i++;
        }
        return (sumapkt/n);
    }

    public static void zad2lab03(){
        System.out.println("Podaj 10 liczb do wczytania:");
        int a, iled=0, ileu=0, sumad=0, sumau=0;
        for(int i=0;i<10;i++){
            a=inputInt();
            if(a>=0){
                iled++;
                sumad=sumad+a;
            }
            else{
                ileu++;
                sumau=sumau+a;
            }
        }
        System.out.println("Ilość liczb dodatnich: "+iled);
        System.out.println("Ilość liczb ujemnych: "+ileu);
        System.out.println("Suma liczb dodatnich wynosi: "+sumad);
        System.out.println("Suma liczb ujemnych wynosi: "+sumau);
    }

    public static void zad3lab03(int n){
        int a, sumap=0;
        if(n>0){
            System.out.println("Podaj wyrazy ciągu:");
            for(int i=0;i<n;i++){
                a=inputInt();
                if(a%2==0){
                    sumap=sumap+a;
                }
            }
            System.out.println("Suma liczb parzystych w ciągu wynosi: "+sumap);
        }
        else {
            System.out.println("Liczba wyrazów ciągu nie może być mniejsza od 0.");
        }
    }

    public static int zad4lab03(int n){
        int a, sumalp=0;
        if(n>0){
            Random rand=new Random();
            for (int i=0;i<n;i++){
                a=rand.nextInt(45-(-10)+1)+(-10);
                System.out.println(a);
                if(a%2==0)
                {
                    sumalp=sumalp+a;
                }
            }
            return sumalp;
        }
        else {
            System.out.println("Liczba wyrazów ciągu nie może być mniejsza od 0.");
            return sumalp;
        }
    }

    public static void zad5lab03(String slowo){
        int dl=slowo.length();
        int l=0;
        for(int i=0;i<slowo.length();i++)
        {
            if (slowo.charAt(i)==slowo.charAt(dl-i-1)){
                l++;
            }
        }
        if(l==dl)
        {
            System.out.println("Podane słowo jest palindromem.");
        }
        else {
            System.out.println("Podane słowo nie jest palindromem.");
        }
    }

    public static int losuj(int a, int b){
        Random random=new Random();
        int liczba=random.nextInt(b-a+1)+a; // przedzial <a;b>
        return liczba;
    }

    public static void z1lab04(){
        int i, suma=0, srednia=0;
        int[] tab=new int[10];
        for(i=0;i<tab.length;i++)
        {
            tab[i]=losuj(1,10);
        }
        for(int x : tab){
            suma=suma+x;
        }
        srednia=suma/(tab.length);
        System.out.println("Suma liczb z tablicy wynosi: "+suma);
        System.out.println("Średnia liczb z tablicy wynosi: "+srednia);
    }

    public static void z2lab04(int[] num, int[] nelm){
        for (int i=0;i<num.length;i=i+2){
            System.out.println(num[i]);
        }
        for (int j=0;j<nelm.length;j=j+2){
            System.out.println(nelm[j]);
        }
    }

    public static void z3lab04(){
        String[] tab={"napis","Ala","kot","lokomotywa"};
        for(String x : tab){
            System.out.println(x.toUpperCase());
        }
    }

    public static void z4lab04(){
        System.out.println("Proszę podać 5 słów:");
        int i;
        String[] tab=new String[5];
        for(i=0;i<5;i++)
        {
            tab[i]=inputString();
        }
        for(i=tab.length-1;i>=0;i--){
            for(int j=tab[i].length()-1;j>=0;j--)
            {
                System.out.printf(String.valueOf(tab[i].charAt(j)));
            }
            System.out.println();
        }
    }

    public static void z5lab04(){
        System.out.println("Podaj 8 liczb:");
        int[] tab=new int[8];
        int i;
        for (i=0;i<tab.length;i++){
            tab[i]=inputInt();
        }
        System.out.println("Tablica przed posortowaniem:");
        for (i=0;i<tab.length;i++){
            System.out.println(tab[i]);
        }
        int elem, index;
        for(i=1;i<tab.length;i++){
            elem=tab[i];
            index=i;
            while (index>0 && elem<tab[index-1]){
                tab[index]=tab[index-1];
                index--;
            }
            tab[index]=elem;
        }
        System.out.println("Tablica po posortowaniu:");
        for (i=0;i<tab.length;i++){
            System.out.println(tab[i]);
        }
    }

    public static void z6lab04(){
        System.out.println("Podaj 5 liczb:");
        int[] tab=new int[5];
        int i, j, silnia=1;
        for (i=0;i<tab.length;i++){
            tab[i]=inputInt();
        }
        //obliczanie silni dla liczby z tablicy
        for(i=0;i<tab.length;i++){
            silnia=1;
            for(j=1;j<=tab[i];j++){
                silnia=silnia*j;
            }
            System.out.println("Slinia z liczby "+tab[i]+" wynosi "+silnia);
        }
    }

    public static void z7lab04(String[] ts1,String[] ts2){
        int i, j;
        boolean same=true;
        if(ts1.length==ts2.length){
            for(i=0;i<ts1.length;i++){
                if(!(ts1[i].equals(ts2[i]))){
                    same=false;
                }
            }
            if(same){
                System.out.println("Tablice są takie same.");
            }
            else{
                System.out.println("Tablice nie są takie same.");
            }
        }
        else {
            System.out.println("Tablice nie są takie same.");
        }
    }

}//koniec klasy