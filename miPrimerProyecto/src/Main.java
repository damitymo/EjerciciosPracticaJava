public class Main {
    public static void main(String[] args) {

    Automovil autoFamiliar=new AutoFamiliar();
    Automovil autoDeportivo=new AutoDeportivo ("Renault","Clio",2020, false);
    Automovil autoDeportivo2= new AutoDeportivo("Fiat");

    autoDeportivo.setMarca("Ford");
    autoDeportivo.setModelo("Focus");

    AutoDeportivo autoDeportivo1=new AutoDeportivo();


        System.out.println("Auto 1, año de Fabricacion: " + autoFamiliar.getAnioFabricacion());
        System.out.println("Auto 2, marca: " + autoDeportivo.getMarca());



    }
}