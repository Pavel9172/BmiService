public class Main {
    public static void main(String[] args) {

      //BmiService service = new BmiService();
    //  double bodyMassIndex = service.calculate(78, height * height);
      //  System.out.println(" ваш индекс " + bodyMassIndex );

      double weight = 78;
      double height = 1.8;
      double meter2 = height * height;

      double bodyMassIndex;

    bodyMassIndex = weight / meter2;

    System.out.println(" ваш индекс " + bodyMassIndex );
    }
}
