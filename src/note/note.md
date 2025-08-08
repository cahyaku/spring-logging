# Spring Logging

## Url

- https://docs.google.com/presentation/d/1y7uiHT28fw_S00YMOtxpzfOglgRXAMr-3_q7eL2Mqj0/edit?slide=id.p#slide=id.p

## Default Logging Setting

```
- Di spring Boot, secara default sudah memiliki setting atau pengaturan untuk looging.
- Secara default, Spring Boot melakukan logging ke Console, 
  selain itu Spring Boot juga memiliki LogFormat.
```

> Contoh: Membuat Logging
>> Membuat unit test -> class LoggingTest
> >> Result:
> > > ![img.png](img.png)

## Logging Level

```
Saat menggunakan LogBack, biasanya kita bisa ubah level dari logging di file `logback.xml`. 
Namun, Springh Boot memiliki fitur dimana kita bisa menggunakan fle Spring application.properties
untuk mengubah pengaturan logging.

CARA: 
- Menggunakan prefix loging.level untuk mengubah pengaturan logging level,misal:
  1. logging.level.root=info (semua atau default).
  2. logging.level.nama,pacakage.nya=warn (spesifik ke package atau file).
```

> Contoh: Buat file `application-test.properties`
> 1. Buat foder resources di src/test/resources/application-test.properties.