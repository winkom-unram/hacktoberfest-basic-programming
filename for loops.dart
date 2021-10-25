void main(){
  // String value
  var message = StringBuffer('Dart is fun');
  // i looping until 5x
  for(var i = 0; i < 5; i++){
    message.write('!');
  }
  // Print to console
  print(message);
}
