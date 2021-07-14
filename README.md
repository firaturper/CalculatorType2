# Calculator-Type-2
Daha önce yapmış olduğumuz "Calculator-Type-1" hesap makinesi uygulamasına yeni bir özellik ekliyoruz. Bu özelliği farklı ülkelere göre tasarlayacağız. Bu ülkeler İngiltere ve Türkiye'dir. İngiltere’de sayıların gösteriminide 3 basamak ayrımı virgül ile gerçekleştiriliyor (Örneğin: 1,000.54) Türkiye’de ise 3 basamak ayrımı gösterimi nokta ile yapılmaktadır. (Örneğin: 1.000,54) 
Hesap makinemizde işlem sonucu belirlediğimiz ülkenin formatına göre gösterilecek. Türkiye veya İngiltere formatının seçimini en başta belirleyeceğiz. Bu sebeple dizaynımız şöyle olmalı: 

* "Calculator" adında bir interface oluşturulmalı ve "void displayResult()" metodu burada yer almalı.

* "Calculator-Type-1" ödevinde bulunan interface'ler "Calculator" interface'ini extends etmelidir.

* “AbstractCalculator” adında bir abstract class'ımız olmalıdır.  "MuhendislikHesapMakineImp" class'ı “AbstractCalculator”ı extends etmelidir ki "displayResult" metodunu miras alabilelim.

* İki tane concrete class'ımız  olmalıdır. İsimleri “TurkishStyleCalculator” ve “UKStyleCalculator” olmalıdır. Bu iki concrete class'lar "MuhendislikHesapMakine" interface'ni extends etmelidir.

* "displayResult" metodunu kullanmayı ve gerekli yerlerde override edilmesini unutmayınız.  
