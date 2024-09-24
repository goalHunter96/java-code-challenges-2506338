package com.linkedinlearning.challenges;

public class VATCalculator {
  //Anhand von Netto-Preis den Brutto-Preis mit MwSt. berechnen
  //Methode String renderInvoice(double price)
  //kleine Rundungsfehler sind erlaubt, zwei Dezimalstellen
  //Ausgabe als Auflistung der einzelnen Posten (Netto, MwSt.-Anteil, Brutto)
  //Änderbarkeit des MwSt.-Satzes vorsehen

 static String renderInvoice(double price, String currency){
   double MwSt = 0.19;
   
   double brutto = price * (1+ MwSt);
   double MwStAnteil = price * MwSt;

   String ausgabeNetto = "Netto: " + price + currency + "\n"; 
   String ausgabeVAT = "VAT (" + MwSt + "): " + MwStAnteil + currency + "\n" ;
   String ausgabeBrutto = "Total: " + brutto + currency + "\n";

   return ausgabeNetto + ausgabeVAT + ausgabeBrutto;

  }

  public static void main(String[] args) {
    System.out.print(renderInvoice(100.00, "€"));
    
  }

}
