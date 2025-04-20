# VernamCipher-and-ROT13
Ky projekt implementon dy algoritme klasike të enkriptimit: Vernam Cipher dhe ROT13. 
Vernam Cipher është një metodë e enkriptimit simetrik që përdor një çelës të rastësishëm me 
gjatësi të njëjtë me mesazhin, ndërsa ROT13 është një formë e thjeshtë e enkriptimit të
zëvendësimit (substitution cipher) që zhvendos shkronjat me 13 pozicione në alfabet.
## Veçoritë
- **Enkriptimi me Vernam Cipher**: Vernam Cipher është një algoritëm enkriptimi që përdor 
- operacionin XOR mbi secilin karakter të mesazhit me një çelës (key). Është i sigurt
- kur çelësi është po aq i gjatë sa mesazhi dhe përdoret vetëm një herë.
- **Enkriptimi me ROT13**: ROT13 është një algoritëm i thjeshtë që zhvendos çdo shkronjë 
- për 13 pozita në alfabet. Ajo është reversible, që do të thotë se të njëjtin 
- funksion mund ta përdorësh për enkriptim dhe dekriptim.
- **Ndërfaqe e thjeshtë**: Projekti ofron një ndërfaqe të qartë për të testuar të dyja 
metodat e enkriptimit.
## Kërkesat
- **Java Development Kit (JDK)** i instaluar në kompjuterin tuaj 
(rekomandohet versioni 23 ose më i lartë).
- **IntelliJ IDEA** (ose ndonjë IDE tjetër për Java) për të ekzekutuar 
dhe modifikuar kodin.
## Përdorim
- Para se të ekzekutoni programet, duhet të kompiloni klasat Java:
  javac VernamCipher/VernamCipher.java
  javac rot13/ROT13.java
1. Ekzekutoni programin për Vernam Cipher:as kompilimit, mund të ekzekutoni 
programin për Vernam Cipher me komandën:
   ```bash
   java VernamCipher
2. Për të ekzekutuar programin ROT13, përdorni komandën:
   ```bash
   java ROT13
   
 ## Shembuj të përdorimit
**Vernam Cipher**
- Plaintext: Hello
- Key: 12345
- Encrypted:yW_XZ
- Decrypted: Hello
-
**ROT13**
- Text: Hello World!
- Encrypted: Uryyb Jbeyq!
- Decrypted: Hello World!

## Skedarët
- **VernamCipher/VernamCipher.java**: Implementimi i algoritmit Vernam Cipher për
enkriptim dhe dekriptim të mesazheve duke përdorur një çelës të rastësishëm.
- **rot13/ROT13.java**: Implementimi i algoritmit ROT13 për enkriptim 
dhe dekriptim të mesazheve përmes zhvendosjes së shkronjave me 13 pozicione.

## Grupi punues:
- Diella Kika
- Erisa Ramadani
- Endri Sojeva
- Enis Shabani
