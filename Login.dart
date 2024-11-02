import 'dart:io';
import 'IMC.dart';
import 'GeradorDeFrases.dart';
void main(){
  String userName = "Matt1234!";
  String password = "h5r!1v#";


  print("    LOGIN APPS - AP2");
  stdout.write('Digite nome de usuario ');
  String? nomeUsuario = stdin.readLineSync();
 
  stdout.write('Digite sua senha: ');
  String? senhaUsuario = stdin.readLineSync();

  if(nomeUsuario != null || senhaUsuario != null){
    if(nomeUsuario == userName && senhaUsuario == password ){
      print("Logi realizado com sucesso");
      print("Bem vindo - ${userName}");
      print("---------------");

      print("Escolha uma opção de programa para executar");
      stdout.write("Escolha um APP: 1 - IMC | 2 - Gerador de Frases | 3 - Sair");
      String? opString = stdin.readLineSync();
      switch (opString) {
        case "1":
          calcularIMC();
          break;
        case "2":
          gerarFrases();
          break;  
        case "3":
          print("Logout realizado");
          break;
        default:
          print("Opção invalida");
      }

    }
    else{
      print("nome ou senha invalidos");
    }
  }
  else{
    print("Digite seu nome de usuario ou senha");
  }









}