package j02_DataTypes_WrapperClass;

public class C04_WrapperClass {

    public static void main(String[] args) {

        String  name= "Haluk";
        int yas=33;
        System.out.println(name.toUpperCase());

        // non-primitive data turleri data depolamak yaninda kullanışlı birçok method'a sahiptir
       // ancak primitive data turlerinin boyle bir ozelligi yoktur
        // primitive data turleri sadece degerleri saklarlar (container) ve hwerhangi bir özellik(method) vs bulundurmaz.
       //Ancak primitive data turleri icin de bazi işlemler için (String'den tamsayı çekme) method'lar ihtiyaç
       // olduğunda Java her bir primitive data turunu, non-primitive  Wrapper Class  oluşturarak ilgili methodlarla
        // ara çözüm imkanı sunmuştur.

        // TASK id ve tc string değerlerinin toplamını print eden kod yazınız

        String tc="1234455";
        String id="98765";
        System.out.println(tc+id); //concat birleştirme yaptı

       int yeniTC= Integer.valueOf(tc); // tc stringi değerini int çevirdi ve yeni TC2 ye atadı
        System.out.println("yeniTC = " + yeniTC);
       int yeniid= Integer.valueOf(id); // tc stringi değerini int çevirdi ve yeni id ye atadı
        System.out.println("yeniid = " + yeniid);
        System.out.println(yeniid+yeniTC); //topladı

        String okulNo="234543l";
       // int yeniOkulNo= Integer.valueOf(yeniOkulNo); //run time exeption çalışma zamanı hatası
       // System.out.println("yeniOkulNo = " + yeniOkulNo);

        System.out.println("madem geldin dünyaya otur çalış javaya");

        // TASK byte short int, maximum ve minimum değerlerini print eden kod yazınız

        byte maxByteDegeri=Byte.MAX_VALUE;
        byte minByteDegeri=Byte.MIN_VALUE;

        System.out.println("maxByteDegeri = " + maxByteDegeri);
        System.out.println("minByteDegeri = " + minByteDegeri);

        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);

        int a=5;
        System.out.println(a);// 5
        System.out.println(5);// 5






    }




}
