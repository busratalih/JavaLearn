package j29_Abstract;

public class C01_Abstract {

    /*
    1-) Bazı durumlarda child classlar parent class dak methodların genellikle body lerini değiştirerek override ederler
    Bu gibi durumlarda parent classdaki methoda body tanımlamak ram ve memory acısından gereksizdir.
    Çözüm olarak java parent class a bodysiz (abstract yani soyut) methodlar tanımlamıştır.

    2-) Parent classtaki abstract methodlar application guvenliği açısından child classda override edilmek zorundadır.
    Eger parent classdaki child classın mutlaka kullanması gereken method varsa abstract tanımlanmalı. Motor() her araçta olmalı

    3-)Abstract method tanımlamak için
    * Body {} olmaz
    * Access modifier sonrası abstract keyword kullanılmalı
    * Abstract method içinde abstract keyword ve{} body bir arada kullanılamaz, aksi halde CTE verir
    abstract class tanımlamak için class ifadesinden önce abstract keyword kullanılmalı

    4-)Abs method sadece abs classda tanımlanabilir, kesinlikle concrete classda abs method tanımlanamaz ama abs classda
    concrete method tanımlanabilir.

    5-) Abstract class içinde hem abstract method hem de concrete method ve variable tanımlanabilir.

    6-) Bir concrete child class parent abs class extend ettiğinde abs methodları implement etmek zorunda ama concrete
    methodlar istege göre override edilir.

    7-) Parent-Child ilişkisi olan bastrac classlar abs methodları implement etmek zorunda değildir.

    8-) Parent olan bas class birden cok concrete veya abstract child class extend edebilir ancak child class birden cok
    abs parent classdan extend edemez.

    9-) Abstract classta final ve abs method tanımlanamaz, CTE verir. -> final method override edilemeyecegı için abs olamaz

    10-) Abstract classda private ve abs method tanımlanamaz. CTE -> private method override edilemeyeceği için abs olamaz

    11-) Abstract classta static ve abs method tanımlanamaz CTE -> static method override edilemeyeceği için abs olamaz

    12-) ABSTRACT CLASS ASLA OBJE ÜRETEMEZ.

    TRİCK-> Abs classlar referansı child classın objesini tutabilir.(polimorfizm)

     */


}
