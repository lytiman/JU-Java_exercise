public abstract class Main {
    private String nameofcar;
    private String colorofv;
    private String modelofv;
    private double price;
    void drive(){
        System.out.println("please Start the motor");
        System.out.println("Thank you um moving");
    }
    void brake()
    {
        System.out.println("kick the break!!");
        System.out.println("Stopped");
    }

    public static void main(String[] args) {

        RoyceRolles Royce=new RoyceRolles();

        Royce.setColorofv("Blue");
        Royce.setNameofcar("Royce Rolles");
      Royce.setPrice(32000);
      Royce.setModelofv("2023RC");
      Ferrari fer = new Ferrari();
      fer.brake();
      fer.drive();
      fer.setColorofv("RED");
      fer.setModelofv("1916fr");
      fer.setNameofcar("FERRARI");
      fer.setPrice(23400000.0);
        System.out.println(Royce.getNameofcar());
        System.out.println( Royce.getColorofv());
        System.out.println( Royce.getModelofv());

        System.out.println( Royce.getPrice());
        Royce.drive();
          Royce.brake();
      Royce.buy();

    }

    public String getNameofcar() {
        return nameofcar;
    }

    public void setNameofcar(String nameofcar) {
        this.nameofcar = nameofcar;
    }

    public String getColorofv() {
        return colorofv;
    }

    public void setColorofv(String colorofv) {
        this.colorofv = colorofv;
    }

    public String getModelofv() {
        return modelofv;
    }

    public void setModelofv(String modelofv) {
        this.modelofv = modelofv;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}