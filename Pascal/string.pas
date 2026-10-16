program ManipulacaoStrings;
// Cada comando do programa foi explicado na linha de cima ou ao lado dele

var
  nomeEntrada, nomeCompara: string[20];   // duas strings de ate 20 caracteres
  numeroForm: real;                       // numero real que sera convertido para string
  stringNum: string[10];                  // recebe o numero convertido em texto
  numeroConv: real;                       // recebe o resultado da conversao texto -> numero
  codigo: integer;                        // 0 = conversao ok; >0 = posicao do primeiro erro
  stringNumerica: string[6];              // texto que supostamente contem um numero
  titulo, primeiroNome, sobrenome: string[20];
  nomeCompletoComTitulo: string[60];      // resultado da concatenacao
  linha: string[80];                      // linha com varios campos juntos
  nome, cargo: string[20];                // campos extraidos de "linha"
  continuar: char;                        // resposta do usuario (S/N)

begin
  { ---------- 10.4.4 COMPARACAO DE STRINGS ---------- }
  nomeEntrada := 'Maria';                 // atribui um texto a variavel string
  nomeCompara := 'Maria';                 // mesmo texto
  // a comparacao eh caractere a caractere pelo codigo ASCII:
  // maiusculas < minusculas, e digitos 0-9 < letras.
  // Um unico caractere diferente (ate um espaco) torna o teste falso.
  if nomeEntrada = nomeCompara
    then writeln('Strings iguais')        // executa se TODOS os caracteres coincidem
    else writeln('Strings diferentes');   // 'Maria' <> 'maria' (M e m tem codigos ASCII distintos)

  { ---------- 10.4.5 PROCEDIMENTO STR (numero -> string) ---------- }
  numeroForm := 1025.169;                 // valor numerico original
  // str(<valor>:<largura>:<casas decimais>, <variavel string>)
  // aqui: largura 10 e 2 casas decimais -> arredonda para 1025.17
  str(numeroForm:10:2, stringNum);
  writeln('Numero como string: [', stringNum, ']');  // stringNum contem '   1025.17'

  { ---------- 10.4.5 PROCEDIMENTO VAL (string -> numero) ---------- }
  stringNumerica := '12.5';               // texto que sera convertido
  numeroConv := 0;                        // inicializa a variavel de destino
  // val(<string>, <variavel numerica>, <codigo de retorno>)
  val(stringNumerica, numeroConv, codigo);
  if codigo > 0                           // codigo > 0: falhou; o valor eh a posicao do 1o caractere invalido
    then writeln('Codigo: ', codigo)      // mostra a posicao do erro
    else writeln(numeroConv:8:2);         // codigo = 0: deu certo, mostra o numero com 2 casas

  { ---------- 10.4.6 FUNCAO CONCAT ---------- }
  titulo := 'Dra. ';
  primeiroNome := 'Maria ';
  sobrenome := 'Souza';
  // concat junta as strings na ordem em que sao passadas
  nomeCompletoComTitulo := concat(titulo, primeiroNome, sobrenome);
  // o operador + faz exatamente a mesma concatenacao:
  nomeCompletoComTitulo := titulo + primeiroNome + sobrenome;
  writeln(nomeCompletoComTitulo);         // Dra. Maria Souza

  { ---------- FUNCAO COPY ---------- }
  // linha: "0023Maria Souza        Gerente" (codigo nas posicoes 1-4, nome a partir da 5, cargo a partir da 25)
  linha := '0023Maria Souza        Gerente                     ';
  // copy(<string>, <posicao inicial>, <quantidade de caracteres>)
  nome := copy(linha, 5, 20);             // 20 caracteres a partir da posicao 5 (o 'M' de Maria)
  cargo := copy(linha, 25, 20);           // 20 caracteres a partir da posicao 25 (o 'G' de Gerente)
  // se pedir mais caracteres do que existem, devolve apenas os existentes
  writeln('Nome: ', nome);
  writeln('Cargo: ', cargo);

  { ---------- FUNCAO POS ---------- }
  // pos(<substring>, <string pesquisada>) devolve a posicao inicial ou 0 se nao achar
  if pos('Gerente', cargo) > 0            // > 0 significa que 'Gerente' esta dentro de cargo
    then writeln('Eh gerente da empresa'); // aqui entraria o processamento dos dados do gerente

  { ---------- FUNCAO UPCASE ---------- }
  write('Continuar? (S/N): ');
  readln(continuar);                      // le um caractere digitado
  // upcase converte letra minuscula em maiuscula; se ja for maiuscula ou nao for letra, nao altera
  // assim, tanto 's' quanto 'S' fazem o teste ser verdadeiro
  if upcase(continuar) = 'S'
    then writeln('Segue processando')
    else writeln('Encerrando');
end.
