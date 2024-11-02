import 'dart:math';

void gerarFrases(){
  List<String> frasesNerds =[
    "É assim que morre a democracia, com um estrondoso aplauso",
    "Velocidade, eu sou a velocidade",
    "Oi, eu sou o Goku",
    "Ao infinito e além",
    "Nós temos o Hulk"
  ];

  Random fraseRandom = Random();
  int indiceDaFrase = fraseRandom.nextInt(frasesNerds.length);

  print("Frase: ${frasesNerds[indiceDaFrase]}");


}