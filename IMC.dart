import 'dart:io';
void calcularIMC() async{
double imc;
//  String resultado;
stdout.write('Digite seu nome: ');
String? nome = stdin.readLineSync();

stdout.write('Digite seu peso: ');
String? pesoString = stdin.readLineSync();

stdout.write('Digite sua altura: ');
String ? alturaString = stdin.readLineSync();

double? peso = pesoString != null ? double.tryParse(pesoString) : null;
double? altura = alturaString != null ? double.tryParse(alturaString):null;

if (peso != null && altura != null && altura > 0) {
  imc = peso / (altura * altura);
    if (imc <18.5){
      print('Paciente: ${nome}');
      print('IMC: abaixo do ideal - ${imc}');
    } 
    else if (imc >= 18.5 && imc <24.9){
      print('Paciente: ${nome}');
      print('IMC: peso normal - ${imc}');
    }
    else if (imc >= 25.0 && imc <29.9){
      print('Paciente: ${nome}');
      print('IMC: Obesidade grau I - ${imc}');
    }
    else if (imc >= 30.0 && imc <34.9){
      print('Paciente: ${nome}');
      print('IMC: Obesidade grau II - ${imc}');
    }
    else{
      print('Paciente: ${nome}');
      print('IMC: Obesidade grau III - ${imc}');
    }
}
else {
  print("Valores invalidos");
}

} 