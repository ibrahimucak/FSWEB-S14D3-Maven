Java Polymorphism Projesi
Genel Bakış:
Proje, Java’da Polymorphism (çok biçimlilik) kullanarak farklı araba sınıflarının aynı metodlarla nasıl farklı davranabileceğini test etmek için oluşturulmuştur. Aşağıdaki adımlar gerçekleştirildi:

Car Sınıfı:

Car sınıfı oluşturuldu, içinde 4 private değişken bulunuyor: engine, cylinders, name, wheels.
Constructor sadece cylinders ve name parametrelerini alacak şekilde tanımlandı. engine ve wheels için varsayılan değerler ayarlandı.
startEngine(), accelerate(), ve brake() metodları yazıldı ve her biri getClass().getSimpleName() değeriyle loglandı.
toString() ve equals() metodları override edildi, name ve cylinders alanlarına göre eşitlik kontrolü yapıldı.
Alt Sınıflar (Mitsubishi, Holden, Ford):

Mitsubishi, Holden, ve Ford sınıfları, Car sınıfından türetildi ve startEngine(), accelerate(), brake() metodları override edildi.
Her bir araç türü, kendi özel davranışlarıyla bu metodları çalıştıracak şekilde tasarlandı.
CarSkeleton Sınıfı ve Alt Sınıflar:

CarSkeleton sınıfı oluşturuldu, startEngine(), drive(), runEngine() metodlarını içeriyor. runEngine() metodunun erişim seviyesi protected olarak belirlendi.
GasPoweredCar, ElectricCar, ve HybridCar sınıfları CarSkeleton sınıfından türedi ve her biri kendine özgü motor tiplerine göre metodları override etti.
Test Senaryosu:
Tüm sınıflardan nesneler oluşturuldu ve her birinin metodları test edildi. Polymorphism kullanılarak, her sınıfın metodunun doğru şekilde çalışıp çalışmadığı kontrol edildi.

Sonuç:
Bu proje, Java’da polymorphism özelliğinin nasıl çalıştığını ve alt sınıfların parent sınıflardan nasıl farklı davranışlar devralabileceğini göstermektedir.






