## Sekans Hizalama

Hesaplamalı Biyolojiye Giriş dersi kapsamında yapmış olduğum sekans hizalama proje ödevim.

hamdi.java dosyası asıl kodumuzdur. Diğer kodlar ayrı ayrı metotları belirtmektedir.

Kod, en son çıktı olan yerel hizalama matrisi haricindeki girdi-çıktı işlemlerini konsoldan yapmaktadır.

G = DNA dizilimimizin uzunluğu
L = Fragmanların uzunluğu 
N = Fragmanların sayısı

Kodun görevi, konsoldan girilen DNA dizilimini veya istenen uzunluğa göre rastgele üretilen DNA dizilimini, istenen uzunlukta ve sayıda fragmanlar ile ve bu fragmanların tümleyenleryle tekrardan sekanslamak. Bu sekanslamayı aşağıdaki algoritmayı baz alarak yapıyor. 

<img width="550" alt="Algoritma" src="https://user-images.githubusercontent.com/70757964/233127269-9ca10e8e-4656-4212-945e-5c5d43ab3d1f.png">

Her metotun ayrı ayrı ne yaptığını proje.pdf isimli ödev dosyasında mevcuttur.

DNA dizilimini ilk indisinden son indisine kadar G-L kez eşleştiriyor. Yine konsoldan alınan girdiler ile eşleşme için + skor eşleşmeme için - skor olacak şekilde o fragman için G-L tane skor oluşturuyor ve bunlardan maksimum skoru asıl skor olarak kabul ediyor. N tane fragman N*N boyutundaki yerel hizalama matrisine kaydediyor. Bu oluşturulan matrisi bir txt dosyasına yazdırıyor. Örnek konsol ve txt dosyası aşağıda görüldüğü gibidir.

### Örnek Çıktı
<img width="550" alt="Konsol" src="https://user-images.githubusercontent.com/70757964/233133067-686319d5-5c88-4a9e-988c-a33a6e4c6070.png">
<img width="550" alt="Skor Matrisi" src="https://user-images.githubusercontent.com/70757964/233133086-84176c89-9cc7-4b40-bfdb-f2af3423aea9.png">

