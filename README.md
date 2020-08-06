# Food


[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)

Food é um app criado para execução de testes mobile, neste meu projeto de automação utilizei os recursos relacionadas abaixo:

  - Linguaguem de Programação: Java
  - Framework de automação: Appium
  - IDE: Eclipse
  - Framework para escrita de linguagem natural: Cucumber
  - Simulador de dispositivo: Android Studio, Android Real, utilizar sempre o Android em uma Versão >= 10

### Instalação

Clone o projeto para sua IDE de preferência

Instale o Appium, recomendo utilizar o Appium Desktop http://appium.io/

Dentro do pom.xml do projeto já vai conter as dependências do cucumber, então é só buildar o projeto com o maven

Caso ainda não possua, baixe e instale o android studio para Simular um dispositivo Android, ou se preferir utilize um device real em modo de depuração


### Configuração

Inicie o servidor do Appium

Abra o projeto Na classe DriverFactory localizada no path "food/src/test/java/core/DriverFactory.java" e altere os desiredCapability conforme suas configurações:
Substituir "Pixel 2 API 29 2" com o nome do seu device
```sh
caps.setCapability("deviceName", "Pixel 2 API 29 2");
```
Substituir "C:\\Users\\tulio.menezes\\Desktop\\Compasso\\app\\test_ifood.apk" pelo caminho onde encontra-se a sua apk em sua máquina (Obs: Utilizar sempre as duas barras, ao invés de apenas uma, conforme está escrito)
```sh
caps.setCapability("app", "C:\\Users\\tulio.menezes\\Desktop\\Compasso\\app\\test_ifood.apk");
```
       
Substituir o "emulator-5554" pelo udid de seu dispositivo, você pode localizar o udid do seu dispostivo executando o comando "adb devices" no prompt de comando
```sh
caps.setCapability("udid", "emulator-5554");
```
### Execução

Executar a classe CadastroTest.java, localizada no path "food/src/test/java/test/CadastroTest.java", para executar a classe você pode clicar com o botão direito na mesma, ir até a opção "Run As" e selecionar a opção "JUnit Test"


**Pronto!! Seus testes já estão sendo iniciados!**
