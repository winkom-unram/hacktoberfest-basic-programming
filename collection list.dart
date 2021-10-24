// This is where the app starts executing
void main() {
  var list = [1, 3, 4]; // List of number
  var listOf = ['#0', for(var i in list) '#$i']; // Check value in list of number
  print(listOf[1] == '#1'); // Print to console
  }
  
