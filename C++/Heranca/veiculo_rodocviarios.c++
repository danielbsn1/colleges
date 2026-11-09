#include <iostream>  // Inclui a biblioteca padrão de entrada e saída
using namespace std; // Permite usar cout e string sem o prefixo std::

class veiculo_rodoviarios
{
    int rodas;       // Atributo: número de rodas do veículo
    int passageiros; // Atributo: número de passageiros que o veículo pode transportar

public:
    void set_rodas(int num) { rodas = num; }
    int get_rodas() { return rodas; }               // Método para obter o número de rodas
    void set_passageiros(int num) { passageiros = num; }
    int get_passageiros() { return passageiros; }   // Método para obter o número de passageiros
};

class caminhao : public veiculo_rodoviarios // caminhao herda de veiculo_rodoviarios
{
    int carga; // Atributo: capacidade de carga do caminhão

public:
    void set_carga(int num) { carga = num; }
    int get_carga() { return carga; } // Método para obter a capacidade de carga
    void mostrar();
};

enum tipo { car, van, vagao }; // Enumeração para representar os tipos de veículos

class automovel : public veiculo_rodoviarios // automovel herda de veiculo_rodoviarios
{
    tipo t; // Atributo: tipo do automóvel (carro, van ou vagão)

public:
    void set_tipo(tipo tipo_veiculo) { t = tipo_veiculo; }
    tipo get_tipo() { return t; } // Método para obter o tipo do automóvel
    void mostrar();
};

// Implementação do método mostrar() de caminhao
void caminhao::mostrar()
{
    cout << "rodas: " << get_rodas() << ", passageiros: " << get_passageiros() << ", carga: " << get_carga() << endl;
}

// Implementação do método mostrar() de automovel
void automovel::mostrar()
{
    cout << "rodas: " << get_rodas() << ", passageiros: " << get_passageiros() << ", tipo: ";
    switch (get_tipo())
    {
    case car:
        cout << "Carro" << endl;
        break;
    case van:
        cout << "Van" << endl;
        break;
    case vagao:
        cout << "Vagão" << endl;
        break;
    }
}

int main()
{
    caminhao t1, t2; // Cria dois objetos do tipo caminhao
    automovel c;     // Cria um objeto do tipo automovel

    t1.set_rodas(6);        // Define 6 rodas para t1
    t1.set_passageiros(2);  // Define 2 passageiros para t1
    t1.set_carga(10000);    // Define carga de 10000 para t1
    t1.mostrar();
    cout << "\n";

    t2.set_rodas(10);       // Define 10 rodas para t2
    t2.set_passageiros(3);  // Define 3 passageiros para t2
    t2.set_carga(20000);    // Define carga de 20000 para t2
    t2.mostrar();
    cout << "\n";

    c.set_rodas(4);         // Define 4 rodas para c
    c.set_passageiros(5);   // Define 5 passageiros para c
    c.set_tipo(car);        // Define tipo carro para c
    c.mostrar();
    cout << "\n";

    c.set_tipo(van);        // Altera o tipo para van
    c.mostrar();

#if defined WIN32
    system("pause");
#endif
    return 0; // Indica que o programa terminou com sucesso
}
