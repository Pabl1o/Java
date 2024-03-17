import java.security.KeyStore;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //imie();
        //System.out.println(imie()+" lat: "+wiek());
        /*
        System.out.println("Podaj a: ");
        int a=inpuntInt();
        System.out.println("Podaj b: ");
        int b=inpuntInt();
        zadanie2(a,b);
        System.out.println("Podaj liczbe c: ");
        int c=inpuntInt();
        if(zadanie3(c)){
            System.out.println("Liczba jest parzysta.");
        }
        else{
            System.out.println("Liczba nie jest parzysta.");
        }
        System.out.println("Podaj liczbe d: ");
        int d=inpuntInt();
        if(zadanie4(d)){
            System.out.println("Liczba jest podzielna przez 3 i 5.");
        }
        else{
            System.out.println("Liczba nie jest podzielna przez 3 i 5.");
        }
        System.out.println("Podaj liczbe e: ");
        int e=inpuntInt();
        System.out.println(zadanie5(e));
        System.out.println("Podaj liczbe f: ");
        int f=inpuntInt();
        System.out.println(zadanie6(f));

        //zadanie 7
        System.out.println("Podaj liczbe g: ");
        int g=inpuntInt();
        System.out.println("Podaj liczbe h: ");
        int h=inpuntInt();
        //System.out.println(losuj(g,h)+" "+losuj(g,h)+" "+losuj(g,h));
        if(zadanie7(losuj(g,h),losuj(g,h),losuj(g,h)))
        {
            System.out.println("Można zbudować trójkąt prostokątny.");
        }
        else
        {
            System.out.println("Nie da się zbudować trójkąta prostokątnego.");
        }
        //zadanie 1 z pliku lab02
        System.out.println("Podaj współczynnik a równania kwadratowego.");
        int aw=inpuntInt();
        System.out.println("Podaj współczynnik b równania kwadratowego.");
        int bw=inpuntInt();
        System.out.println("Podaj współczynnik c równania kwadratowego.");
        int cw=inpuntInt();
        z1lab02(aw,bw,cw);
        //zadanie 2 z pliku lab02
        System.out.println("Podaj argument dla funkcji a(x), b(x) i c(x)");
        double afx=inputDouble();
        System.out.println("Wartosc funkcji a(x): "+z2ax(afx));
        System.out.println("Wartosc funkcji b(x): "+z2bx(afx));
        System.out.println("Wartosc funkcji c(x): "+z2cx(afx));
         */
        //zadanie 3 z pliku lab02
        z3lab02(8,1,4);
        //zadanie 4 z pliku lab02
        System.out.println("Czy pada deszcz? (tak=1) (nie=0)");
        int deszcz=inpuntInt();
        System.out.println("Czy jest autobus? (tak=1) (nie=0)");
        int autobus=inpuntInt();
        z4lab02(deszcz,autobus);
        //zadanie 5
        System.out.println("Czy jest zniżka na samochód? (tak=1) (nie=0)");
        int znizka=inpuntInt();
        System.out.println("Czy pracownik otrzymał podwyżkę? (tak=1) (nie=0)");
        int podwyzka=inpuntInt();
        z5lab02(znizka,podwyzka);
        //zadanie 6
        System.out.println("Podaj dwie liczby:");
        int l1=inpuntInt();
        int l2=inpuntInt();
        System.out.println("Wybierz rodzaj działania (suma, roznica, iloczyn, iloraz, resztazd)");;
        String rodzdzial=inputString();
        z6lab02(l1,l2,rodzdzial);
    }//koniec main

    public static String imie(){
        return "pawel";
    }
    public static int wiek(){
        return 20;
    }

    public static void zadanie2(int a, int b) {
        System.out.println("Suma "+a+" + "+b+" = "+ (a+b));
        System.out.println("Różnica "+a+" - "+b+" = "+ (a-b));
        System.out.println("Iloczyn "+a+" * "+b+" = "+ (a*b));
    }

    public static int inpuntInt(){
        Scanner scanner = new Scanner(System.in);
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

    public static boolean zadanie3(int a){
        if (a%2==0) {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean zadanie4(int a){
        if (a%3==0 && a%5==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static double zadanie5(int a){
        return Math.pow(a,3);
    }

    public static double zadanie6(int a){
        return Math.sqrt(a);
    }

    public static  int losuj(int a, int b){
        Random random=new Random();
        int liczba=random.nextInt(b-a+1)+a; // przedzial <a;b>
        return liczba;
    }

    public static boolean zadanie7(int a, int b, int c){
        if(Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2))
        {
            return true;
        }
        else if(Math.pow(a,2)+Math.pow(c,2)==Math.pow(b,2))
        {
            return true;
        }
        else if(Math.pow(c,2)+Math.pow(b,2)==Math.pow(a,2))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void z1lab02(int a, int b, int c){
        if(a==0) // funkcja liniowa
        {
            System.out.println("Rozwiązanie równania liniowego: ");
            System.out.println((-c/b));
        }
        else{
            double delta=(Math.pow(b,2)-4*a*c);
            if(delta<0)
            {
                System.out.println("Funkcja nie ma rozwiązania w zbiorze liczb rzeczywistych.");
            }
            else
            {
                double x1=((-b-Math.sqrt(delta))/2*a);
                double x2=((-b+Math.sqrt(delta))/2*a);
                System.out.println("Rozwiązania równania kwadratowego to:");
                System.out.println("x1= "+x1);
                System.out.println("x2= "+x2);
            }
        }
    }

    public static double z2ax(double x){
        if(x>0)
        {
            return (2*x);
        }
        else if(x==0)
        {
            return 0;
        }
        else
        {
            return (-3*x);
        }
    }

    public static double z2bx(double x){
        if(x>=1)
        {
            return (Math.pow(x,2));
        }
        else
        {
            return (x);
        }
    }

    public static double z2cx(double x){
        if(x>2)
        {
            return (2+x);
        }
        else if(x==2)
        {
            return (8);
        }
        else
        {
            return (x-4);
        }
    }

    public static void z3lab02(int x, int y, int z)
    {
        int tab[]={x,y,z};
        Arrays.sort(tab);
        System.out.println("Uporządkowane liczby rosnąco: "+tab[0]+" "+tab[1]+" "+tab[2]);
    }

    public static void z4lab02(int p, int a)
    {
        boolean deszcz=false;
        boolean autobus=false;
        if(p==1)
        {
            deszcz=!deszcz;
        }
        if(a==1)
        {
            autobus=!autobus;
        }
        if(deszcz && autobus){
            System.out.println("Weź parasol");
            System.out.println("Dostaniesz się na uczelnie");
        }
        else if(deszcz && !autobus)
        {
            System.out.println("Nie dostaniesz sie na uczelnie");
        }
        else if(!deszcz && autobus)
        {
            System.out.println("Dostaniesz się na uczelnie");
            System.out.println("Miłego dnia i pięknej pogody");
        }
        else
        {
            System.out.println("Nie ma deszczu i nie ma autobusu, wiec sie nie dostaniesz");
        }
    }

    public static void z5lab02(int zniz, int podwyz){
        boolean znizka=false;
        boolean premia=false;
        if(zniz==1)
        {
            znizka=true;
        }
        if(podwyz==1)
        {
            premia=true;
        }
        if(znizka==false || premia==true){
            System.out.println("Możesz kupić samochód.");
            System.out.println("Zniżki na samochód nie ma.");
        }
        if(znizka==false || premia==false){
            System.out.println("Zakup samochodu trzeba odłożyć na później.");
            System.out.println("Zniżki na samochód nie ma.");
        }
        if(znizka==true || premia==true){
            System.out.println("Możesz kupić samochód.");
        }
    }


    public static void z6lab02(int x, int y, String dzialanie){
        if (dzialanie.equals("suma")){
            System.out.println("Wynik dzialania: "+(x+y));
        }
        else if (dzialanie.equals("roznica")){
            System.out.println("Wynik odejmowania: "+(x-y));
        }
        else if (dzialanie.equals("iloczyn")){
            System.out.println("Wynik mnozenia: "+(x*y));
        }
        else if (dzialanie.equals("iloraz")){
            if (y==0){
                System.out.println("Nie można dzielić przez 0!");
            }
            else
            {
                System.out.println("Wynik dzielenia: "+(x/y));
            }
        }
        else if (dzialanie.equals("resztazd")){
            System.out.println("Reszta z dzielenia: "+(x%y));
        }
        else{
            System.out.println("Wybrano nieprawwidłowy rodzaj działania.");
        }
    }

}//koniec klasy