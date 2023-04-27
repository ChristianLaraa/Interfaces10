package ejemplo2;

public class DriverVehiculo {
    public static void main(String[] args){
        Camion camion = new Camion("Diesel", 3);
        camion.encender();
        System.out.println(camion);
        System.out.println(camion.encender());
        camion.frenar();
        camion.frenar();
        System.out.println(camion.apagar());
        System.out.println("---MOTOCICLETA---");
        Motocicleta moto = new Motocicleta(150, "yamaha");
        System.out.println(moto);
        moto.encender();
        moto.avanzar();
        moto.hacerCaballito();
        moto.frenar();
        moto.apagar();

    }
}
