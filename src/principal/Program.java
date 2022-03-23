package principal;

import entities.Cliente;
import entities.Endereco;
import helpers.InputHelper;

import javax.swing.*;


public class Program {

    public static void main(String[] args) {
        try {
            System.out.println("--------DADOS DO CLIENTE--------");

            Cliente cliente = new Cliente(
                    InputHelper.lerID
                            ("Informe o id do cliente: "),
                    InputHelper.lerTexto
                            ("Informe o nome do cliente: "),
                    InputHelper.lerTexto
                            ("Informe o sobrenome do cliente: "),
                    InputHelper.lerTexto
                            ("Informe o cpf do cliente: "),
                    InputHelper.lerTexto
                            ("Informe o email do cliente: "),
                    InputHelper.lerTexto
                            ("Informe o telefone do cliente: ")
            );

            System.out.println("--------ENDEREÇO DO CLIENTE--------");

            Endereco endereco = new Endereco(
                    InputHelper.lerID
                            ("Informe o id do endereço: "),
                    InputHelper.lerTexto
                            ("Informe o logradouro: "),
                    InputHelper.lerTexto
                            ("Informe o complemento: "),
                    InputHelper.lerTexto
                            ("Informe o número: "),
                    InputHelper.lerTexto
                            ("Informe o bairro: "),
                    InputHelper.lerTexto
                            ("Informe o cidade: "),
                    InputHelper.lerTexto
                            ("Informe o estado: "),
                    InputHelper.lerTexto
                            ("Informe o cep: ")
            );

            cliente.setEndereco(endereco);
            endereco.setCliente(cliente);

            System.out.println("----------DADOS DO CLIENTE----------");
            System.out.println("ID do cliente: " + cliente.getId());
            System.out.println("Nome do cliente: " + cliente.getNome());
            System.out.println("Sobrenome do cliente: " + cliente.getSobrenome());
            System.out.println("CPF do cliente: " + cliente.getCpf());
            System.out.println("Email do cliente: " + cliente.getEmail());
            System.out.println("Telefone do cliente: " + cliente.getTelefone());

            System.out.println("----------ENDEREÇO DO CLIENTE----------");
            System.out.println("ID do endereço do cliente: " +endereco.getId());
            System.out.println("Logradouro do cliente: " + endereco.getLogradouro());
            System.out.println("Complemento do cliente: " + endereco.getComplemento());
            System.out.println("Número do cliente: " + endereco.getNumero());
            System.out.println("Bairro do cliente: " + endereco.getBairro());
            System.out.println("Cidade do cliente: " + endereco.getCidade());
            System.out.println("Estado do cliente: " + endereco.getEstado());
            System.out.println("CEP do cliente: " + endereco.getCep());



        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!\n"+ e.getMessage(),"ERRO", JOptionPane.ERROR_MESSAGE );

        }

    }

}
