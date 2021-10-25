void coffee(){} // Toko top-level function

class Toko {
  static void bar(){} // Toko static method
  void warung() {} // Toko instance method
}

void main(){
  Function testing;
  
  // Comparing top-level functions.
  testing = coffee; 
  print(coffee == testing);
  
  // Comparing static methods
  testing = Toko.bar;
  print(Toko.bar == testing);
  
  // Comaring instance methods
  var v = Toko(); // Instance #1 of Toko
  var w = Toko(); // Instance #2 of Toko
  var y = w;
  testing = w.warung;
  
  // These closures refer to the same instance
  // so they're equal
  print(y.warung == testing);
  
  //These closures refer to different instances
  //so they're unequal
  print(v.warung != w.warung);
  
}
