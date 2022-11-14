<p align="center">
  <img width="330" height="300" src="https://github.com/alexaugusto23/java_alura/blob/master/img/logo%20java.gif">
</p>


# Curso Alura - Java JRE e JDK: Escreva o seu primeiro código com Eclipse
__Por: Alexsandro Augusto Ignácio e instrutor | Alura

* JVM? JDK? JRE? O que são essas siglas?
* Compilando e executando código java
* Aprenda a usar Eclipse
* Variáveis e controle de fluxo
* Conheça os principais tipos do Java


### __Conhecimentos do curso__

* O que é Java? Ver primeiro vídeo
* Instalação e o primeiro programa
* Começando com Eclipse
* Tipos e variáveis
* Trabalhando com caracteres
* Praticando condicionais
* Controlando fluxo com laços


# Curso Alura - Java OO: Introdução à Orientação a Objetos

* Domine o paradigma de programação mais usado no mercado de trabalho
* Entenda o que são referências e objetos
* Use atributos, métodos da instancia e da classe
* Define objetos através de construtores
* Aprenda sobre encapsulamento


### __Conhecimentos do curso__

* O problema do paradigma procedural Ver primeiro vídeo
* Introdução à Orientação a Objetos
* Definindo comportamento
* Composição de objetos
* Encapsulamento e visibilidade
* Construtores e membros estáticos

--------------------------------------

JVM (Java Virtual Machine)
JDK - Java Development Kits - Compilador
JRE - Java Runtime Environment - Máquina Virtual

CMD udar o comando:
* java roda a máquina virtual e traz o príncipais comandos ex -version.
* javac compila o código fonte.

javac -version
java -version

instalando no linux:

sudo apt update
sudo apt install openjdk-17-jdk
sudo update-alternatives --config java
export JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64/bin

instalando no windows:

https://www.oracle.com/java/technologies/downloads/#jdk17-windows

Depois de instalado salvar a variável de ambiente para execussão: C:\Program Files\Java\jdk1.8.0_261\bin


o comando type exibe o contéudo do arquivo, similar ao cat do linux.

public class Programa {
        public static void main(String[]args) {
                System.out.println("Ola mundo");
        }
}

type Programa.java

o comando javac compila o código fonte do arquivo .java que gera um arquivo .class -> Bytecode que é interpretado pela jvm.

Para executar o programa basta digitar o comando java mais a classe no diretório onde contém o arquivo .class exemplo: java Programa

result = ola mundo

IDE´s para java:

* NetBeans
* IntelliJ 
* Eclipse

Palavras chaves no java são mínusculas.

Padrão de Escrita CamelCase exemplo: ProgramaSoma

Comando print não pula linha, mas o println sim!
