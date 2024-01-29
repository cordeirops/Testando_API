import java.time.LocalDateTime;

public class Cnpj {
    int id;
    String cnpj;
    String name;
    String lock_date;
    String is_blocked;


    String test_date;
    String test_system;
    String active;
    String installation_date;
    String phone;
    String version;
    String system;
    String observation;
    String state;
    String city;

    //var block_date = LocalDateTime.now();

    private String bloqueado (){
        if (is_blocked == "true"){
            return "Sim";
        }else{
            return "Não";
        }
    };

    @Override
    public String toString() {
        return "RESULTADO PARA O CNPJ" + '\n' +
                "ID: " + id + '\n' +
                "- Cnpj: " + cnpj + '\n' +
                "- Nome: " + name + '\n' +
                "- Data de Bloqueio: " + lock_date + '\n' +
                "- Está bloqueado?: " + bloqueado() + '\n' +
                "- Ativo?: " + active + '\n' +
                "- Data Instalação:" + installation_date + '\n' +
                "- Tefone: " + phone + '\n' +
                "- Versão Sistema: " + version + '\n' +
                "- Sistema: " + system + '\n' +
                "- Observações: " + observation + '\n' +
                "- Estado: " + state + '\n' +
                "- Cidade: " + city + '\n';
    }

}

