import java.util.Scanner;

class Cliente {
    private String nome;
    private String telefone;

    public Cliente(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }
}

class Veiculo {
    private String placa;
    private String modelo;
    private Cliente proprietario;

    public Veiculo(String placa, String modelo, Cliente proprietario) {
        this.placa = placa;
        this.modelo = modelo;
        this.proprietario = proprietario;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public Cliente getProprietario() {
        return proprietario;
    }
}

class Servico {
    private String descricao;
    private double preco;

    public Servico(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }
}

class LavaCar {
    private Cliente cliente;
    private Veiculo veiculo;
    private Servico servico;

    public void adicionarCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public void adicionarServico(Servico servico) {
        this.servico = servico;
    }

    public void listarCliente() {
        if (cliente != null) {
            System.out.println("Nome: " + cliente.getNome() + ", Telefone: " + cliente.getTelefone());
        } else {
            System.out.println("Nenhum cliente cadastrado.");
        }
    }

    public void listarVeiculo() {
        if (veiculo != null) {
            System.out.println("Placa: " + veiculo.getPlaca() + ", Modelo: " + veiculo.getModelo() + ", Proprietário: " + veiculo.getProprietario().getNome());
        } else {
            System.out.println("Nenhum veículo cadastrado.");
        }
    }

    public void listarServico() {
        if (servico != null) {
            System.out.println("Serviço: " + servico.getDescricao() + ", Preço: R$ " + servico.getPreco());
        } else {
            System.out.println("Nenhum serviço cadastrado.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LavaCar lavaCar = new LavaCar();

        while (true) {
            System.out.println("1. Adicionar Cliente");
            System.out.println("2. Adicionar Veículo");
            System.out.println("3. Adicionar Serviço");
            System.out.println("4. Listar Cliente");
            System.out.println("5. Listar Veículo");
            System.out.println("6. Listar Serviço");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            if (opcao == 1) {
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("Telefone: ");
                String telefone = scanner.nextLine();
                Cliente cliente = new Cliente(nome, telefone);
                lavaCar.adicionarCliente(cliente);
                System.out.println("Cliente adicionado com sucesso!");

            } else if (opcao == 2) {
                if (lavaCar.cliente == null) {
                    System.out.println("Primeiro adicione um cliente.");
                } else {
                    System.out.print("Placa: ");
                    String placa = scanner.nextLine();
                    System.out.print("Modelo: ");
                    String modelo = scanner.nextLine();
                    Veiculo veiculo = new Veiculo(placa, modelo, lavaCar.cliente);
                    lavaCar.adicionarVeiculo(veiculo);
                    System.out.println("Veículo adicionado com sucesso!");
                }

            } else if (opcao == 3) {
                System.out.print("Descrição do serviço: ");
                String descricao = scanner.nextLine();
                System.out.print("Preço: ");
                double preco = scanner.nextDouble();
                scanner.nextLine(); // Consumir nova linha
                Servico servico = new Servico(descricao, preco);
                lavaCar.adicionarServico(servico);
                System.out.println("Serviço adicionado com sucesso!");

            } else if (opcao == 4) {
                lavaCar.listarCliente();

            } else if (opcao == 5) {
                lavaCar.listarVeiculo();

            } else if (opcao == 6) {
                lavaCar.listarServico();

            } else if (opcao == 0) {
                System.out.println("Saindo...");
                scanner.close();
                break;

            } else {
                System.out.println("Opção inválida.");
            }
        }
    }
}
