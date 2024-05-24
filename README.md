# SI_2024_lab2_223079
Dino Gavrovski 223079
3. Ciklomatskata kompleksnost e 4, koristejki ja formulata CK = E - N + 2P, kade shto P = 1
CK = 22 - 20 + 2 * 1
CK = 4
4. allItems == null -> allItems ke go postavime na null
   item.getName() == null || item.getName().length() == 0 -> imeto na null ili dolzinata na imeto da e 0
   item.getBarcode() != null -> za da vleze vo else ke stavime barcode-ot da e null
   allowed.indexOf(c) == -1 -> karakter shto ne e broj 
   item.getDiscount() > 0 -> za vo else ke stavime da nema discount (discount = 0)
   item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0) == '0' -> site ovie da se ispolneti
   sum <= payment - > za da vleze vo else go barame obratniot slucaj t.e sum > payment.
   So ova bi gi opfatile site test cases.
5. 2^3 uslovi, t.e 8 test cases
   1. Site T
   2. Site F
   3. T F F
   4. T T F
   5. T F T
   6. F T T
   7. F F T
   8. F T F
