package com.company;

public class Main {

    public static void main(String[] args) {
	Rower rowerPierwszy = new Rower();
    rowerPierwszy.nazwa = "Pierwszy";
    Rower rowerDrugi = new Rower();
    rowerDrugi.nazwa = "Drugi";

    rowerPierwszy.start();
    rowerDrugi.start();

    rowerDrugi.przyspiesz(50);

    rowerDrugi.wyswietlStan();
        rowerDrugi.wyswietlStan();

        rowerDrugi.stop();

        rowerDrugi.wyswietlStan();
    }
}

class Rower{
    boolean wRuchu;
    int predkosc;
    String nazwa;

    void start(){
        wRuchu = true;
        predkosc = 0;
    }
    void stop(){
        wRuchu = false;
        predkosc =0;
    }
    void przyspiesz( int nowaPredkosc){
       predkosc = nowaPredkosc;
    }
    void wyswietlStan(){
        System.out.println("Obecny stan " + nazwa);
        System.out.println("Predkosc wynosi:"+predkosc);
        System.out.println("Czy rower jest w rychu?"+(wRuchu ? "tak":"nie"));
    }
}
