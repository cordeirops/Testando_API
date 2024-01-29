import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class manin {
    public static <Retorno> void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o CNPJ a ser pesquisado: ");
        var cnpj = sc.nextLine(); //Var já entende que é uma STRING
        String endpoint = "https://api.gtech.site/companies/" + cnpj + "/is_blocked";


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endpoint))
                .build();
        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());

        String json = response.body();

        Gson gson = new Gson();
        Cnpj cnpj1 = gson.fromJson(json, Cnpj.class);
        System.out.println(cnpj1);
    }
}
