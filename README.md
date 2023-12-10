ButtonGrid Uygulaması

Bu basit Java Swing uygulaması, 4x4 bir buton grid'i içermektedir. Her buton, belirtilen bir GraphQL şemasına bir mutation gönderir. Butonlar, üzerlerine tıklanarak aktif hale getirilebilir ve diğer butonların pasif hale gelmesini sağlar.

Kullanımı

Projeyi indirin veya kopyalayın.
ButonKontrol.java ve ButtonGridExample.java dosyalarını bir Java IDE'sinde açın.
Projeyi derleyin ve çalıştırın.
Butonlar arasında geçiş yapmak için bir butona tıklayın. Aktif olan butonun rengi ve simgesi değişirken, diğer butonlar pasif hale gelir. Her buton tıklandığında, belirtilen GraphQL şemasında bir mutation çalıştırılır.

Bağımlılıklar: Ek bağımlılık gerekmez. Java'nın standart kütüphanelerini kullanmaktadır.

Derleme: Proje klasöründe bulunan ButtonGridExample.java dosyasını derleyebilirsiniz.

Özel Ayarlar

Buton Özellikleri: CustomButton sınıfı, butonların özelliklerini belirlemenizi sağlar. Her bir butonun üzerindeki metni, GraphQL şemasını, aktif ve pasif renkleri, aktif ve pasif simgeleri belirleyebilirsiniz.

GraphQL Şeması: Buton tıklamaları sonrasında çalışacak GraphQL mutation'ını belirlemek için executeGraphQLMutation metodunu özelleştirebilirsiniz.
