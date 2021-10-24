void main() {
  var list = [1, 3, 4];
  var listOf = ['#0', for(var i in list) '#$i'];
  print(listOf[1] == '#1');
  }
  
