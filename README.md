# Hybris Final Case

## Giriş

### Part 1

Ürün(Product) üzerinde tipi boolean olan bir alan oluşturun. Bu alanı solr a indexleyin ve ürün listeleme sayfasında gösterin.

### Part 2

Ürün’ün kodu içerisinde 1 rakamı geçenleri listeyen bir dao ve service sınıfı yazın.Ürünün üzerinde tipi integer olan bir alan oluşturun.Bir tane cronjob yazın ve yazdığın dao ve servisi burada kullanarak, a maddesinde yazdığınız servisi kullanarak bulduğunuz ürünlerin kodu içerisinde geçen 1 sayısından kaç tane geçtiğini b maddesinde oluşturduğunuz alana yazın.

## Ürün İndeksleme
ürünün database'e yansıması için config ayarları yapıldı ve komut istemi üzerinde belirli komutları çalıştırarak database gönderildi. provider üzerinde ProductVolumePricesProvider isimli bir class oluşturularak içeresinde boolean tipinde method kaltılım yoluyla override edilip çağırıldı ve  solr arayüz üzerinde ilgili alanlar set edildi.

## Ürün gösterme
backoffice arayüzünde facet search configurations bölümünden electronics sekmesine tıklayarak indekselen alan edit item sayfasında görüntülendi.

